package com.briup.web.a;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.EUser;
import com.briup.bean.EUserExample;
import com.briup.bean.EUserExample.Criteria;
import com.briup.mapper.EUserMapper;
import com.briup.util.BriupUtil;

@SuppressWarnings("all")
@WebServlet("/userinfo")
public class UserinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取用户的登入状态
		HttpSession session = request.getSession();
		EUser user = (EUser) session.getAttribute("user");
		//通过用户获取用户名和id
		String username = user.getUsername();
		BigDecimal id = user.getId();
		//将用户名和id显示在修改信息界面，并且保证不能修改
		request.setAttribute("msg", username);
		request.setAttribute("id", id);
		
		//获取用户修改的信息
		String pwd = request.getParameter("pwd");
		String zip = request.getParameter("zip");
		String address = request.getParameter("address");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		
		EUser eUser = new EUser();
		eUser.setId(id);
		eUser.setUsername(username);
		eUser.setPassword(pwd);
		eUser.setZip(zip);
		eUser.setAddress(address);
		eUser.setPhone(telephone);
		eUser.setEmail(email);
		
		//获取映射接口
		EUserMapper eUserDao = BriupUtil.getMapper(EUserMapper.class);
		//将新信息更新到数据库中
		// 操作不同的表需要不同的example
		EUserExample userExample = new EUserExample();
		// 创建where 条件
		Criteria userWhere = userExample.createCriteria();
		userWhere.andIdEqualTo(id);
		eUserDao.updateByPrimaryKey(eUser);
		
		request.getRequestDispatcher("a/userinfo.jsp").forward(request, response);
		return;
		
		
	}
}
