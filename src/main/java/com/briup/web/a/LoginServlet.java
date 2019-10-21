package com.briup.web.a;

import java.io.IOException;
import java.util.List;

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
import com.briup.util.Shopcar;

@SuppressWarnings("all")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		// 查询 e_user 表

		// 获得映射接口实现类对象
		EUserMapper userDao = BriupUtil.getMapper(EUserMapper.class);

		// 操作user表的where条件，操作不同的表需要不同的example
		EUserExample userExample = new EUserExample();
		// 创建where条件
		Criteria userWhere = userExample.createCriteria();
		// sql:where username=${name} and password=${password}
		userWhere.andUsernameEqualTo(name);
		userWhere.andPasswordEqualTo(password);

		// 使用where条件进行查询
		List<EUser> list = userDao.selectByExample(userExample);
		// 用户名或密码错误
		if (list == null || list.size() == 0) {
			// 用户名密码错误
			request.setAttribute("msg", "用户名或密码错误");
			request.getRequestDispatcher("a/login.jsp").forward(request, response);
			return;
		} else {
			// 用户名密码正确
			HttpSession session = request.getSession();
			// 根据用户输入的用户名和密码得到的用户信息
			EUser user = list.get(0);
			// 把用户信息放到session中
			// 其它模块可以使用这个user是否有值，判断是否有用户登陆
			session.setAttribute("user", user);
			System.out.println(user);
			Shopcar car = new Shopcar();
			// 创建购物车，购物车
			session.setAttribute("car", car);
			request.getRequestDispatcher("b/index.jsp").forward(request, response);
			return;
		}

	}
}
