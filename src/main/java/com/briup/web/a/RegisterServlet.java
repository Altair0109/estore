package com.briup.web.a;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.EUser;
import com.briup.bean.EUserExample;
import com.briup.bean.EUserExample.Criteria;
import com.briup.mapper.EUserMapper;
import com.briup.util.BriupUtil;

//Clause：子句
//Criteria：实例、标准、条件、准则
@SuppressWarnings("all")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取用户注册输入的信息
		String username = (String) request.getParameter("name");
		String password = (String) request.getParameter("password");
		String zip = (String) request.getParameter("zip");
		String address = (String) request.getParameter("address");
		String telephone = (String) request.getParameter("telephone");
		String email = (String) request.getParameter("email");
		EUser eUser = new EUser();
		eUser.setUsername(username);
		eUser.setPassword(password);
		eUser.setZip(zip);
		eUser.setAddress(address);
		eUser.setPhone(telephone);
		eUser.setEmail(email);
		eUser.setDob(new Date());

		EUserMapper eUserDao = BriupUtil.getMapper(EUserMapper.class);
		// 将新用户保存到数据库

		// 操作不同的表需要不同的example
		EUserExample userExample = new EUserExample();
		// 创建where 条件
		Criteria userWhere = userExample.createCriteria();
		userWhere.andUsernameEqualTo(username);
		// 从数据库中查询数据，再进行比对
		List<EUser> list = eUserDao.selectByExample(userExample);

		for (EUser user : list) {
			String name = user.getUsername();
			if (username.equals(name)) {
				// 注册验证不通过
				request.setAttribute("msg", "用户名已存在！");
				request.getRequestDispatcher("a/register.jsp").forward(request, response);
				return;
			}
		}
		// 注册验证通过
		eUserDao.insert(eUser);
		request.getRequestDispatcher("b/index.jsp").forward(request, response);
		return;
	}
}
