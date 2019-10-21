package com.briup.web.c;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.EOrder;
import com.briup.bean.EUser;
import com.briup.bean.Orderline;
import com.briup.mapper.EOrderMapper;
import com.briup.mapper.OrderlineMapper;
import com.briup.util.BriupUtil;
import com.briup.util.Shopcar;

@WebServlet("/goconfirm")
public class GoConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获得用户勾选的某几个订单项
		String[] olid = request.getParameterValues("olid");

		HttpSession session = request.getSession();
		Shopcar car = (Shopcar) session.getAttribute("car");
		
		// 存放用户勾选的订单项信息
		List<Orderline> olList = new ArrayList<Orderline>();

		List<Orderline> lines = car.getLines();
		List<Orderline> delLine = new ArrayList<>();
		
		for (Orderline ol : lines) {
			BigDecimal id = ol.getId();
			for (int i = 0; i < olid.length; i++) {
				String idStr = id.toString();
				if (idStr.equals(olid[i])) {
					// 用户勾选了这个订单项
					olList.add(ol);
					//删除购物中 被结算了的商品
					delLine.add(ol);
				}
			}
		}
		EUser user = (EUser) session.getAttribute("user");
		
		//生成订单信息
		EOrder order = new EOrder();
		long time = new Date().getTime();
		order.setDob(new BigDecimal(time));
		order.setCustomerId(user.getId());
		order.setDob(new BigDecimal(new Date().getTime()));
		order.setOrderid(UUID.randomUUID().toString().substring(0, 6));
		order.setPaystatus(new BigDecimal(2));//1:支付，2:未支付
		//保存到数据库
		//所有的订单项也要保存到数据库
		EOrderMapper orDao = BriupUtil.getMapper(EOrderMapper.class);
		orDao.insert(order);
		OrderlineMapper olDao = BriupUtil.getMapper(OrderlineMapper.class);
		for (Orderline ol : olList) {
			ol.setOrderId(order.getId());
			olDao.insert(ol);
		}
		//把confirm.jsp页面需要的数据放到容器中
		request.setAttribute("order", order);
		request.setAttribute("olList", olList);
		request.getRequestDispatcher("c/confirm.jsp").forward(request, response);
	
		//移除购物车中的已经被提交了的订单项信息
		lines.removeAll(delLine);
		System.out.println("---------------");
		lines.stream().forEach(System.out::println);
		System.out.println("---------------");
		car.setLines(lines);
		session.setAttribute("car", car);
	
	}
}
