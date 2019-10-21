package com.briup.web.c;


import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.briup.bean.Product;

import com.briup.mapper.ProductMapper;
import com.briup.util.BriupUtil;
import com.briup.util.Shopcar;

@WebServlet("/buy")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//获得当前用户 选择的书的id
		String bookid = request.getParameter("bookid");
		//通过id查找到数据库中的书product对象
		ProductMapper proDao = BriupUtil.getMapper(ProductMapper.class);
		//用户想购买的书籍对象
		Product pro = proDao.selectByPrimaryKey(new BigDecimal(bookid));
		//购物车在哪？登入成功以后会向session中放一个购物车
		//获取session中的购物车对象
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("car");
		if (obj == null) {//没有登入
			request.setAttribute("msg", "没有登录，请先登录！");
			request.getRequestDispatcher("a/login.jsp").forward(request, response);
			return;
		}
		Shopcar car = (Shopcar) obj;
		//把当前的商品添加到购物车中
		car.add(pro);
		

		//把最新的购物车重新放一遍
		session.setAttribute("car", car);
		
		request.getRequestDispatcher("b/list.jsp").forward(request, response);
		return;
		
	}
}
