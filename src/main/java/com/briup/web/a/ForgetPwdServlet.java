package com.briup.web.a;

import java.io.IOException;
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

@WebServlet("/forgetpwd")
public class ForgetPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得映射接口的实现类对象
		EUserMapper eUserDao = BriupUtil.getMapper(EUserMapper.class);
		// 操作user表的where条件，操作不同的表需要不同的example
		EUserExample userExample = new EUserExample();
		// 创建where条件
		Criteria userWhere = userExample.createCriteria();

		// 获得用户名和手机号
		String name = request.getParameter("name");
		String telephone = request.getParameter("telephone");

		// 获得新密码
		String newpwd = request.getParameter("newpwd");
		String confirmpwd = request.getParameter("confirmpwd");
		if (newpwd == null || confirmpwd == null || !newpwd.equals(confirmpwd)) {
			request.setAttribute("msg1", "新密码为空或两次输入的密码不一致！");
			request.getRequestDispatcher("a/forgetPassword.jsp").forward(request, response);
			return;
		} else {
			// sql:where username=${name} and password=${password}
			userWhere.andUsernameEqualTo(name);
			userWhere.andPhoneEqualTo(telephone);
			// 使用where条件进行查询
			List<EUser> list = eUserDao.selectByExample(userExample);
			if (list == null || list.size() == 0) {
				request.setAttribute("msg2", "该用户不存在");
				request.getRequestDispatcher("a/forgetPassword.jsp").forward(request, response);
				return;
			} else {
				// 获得用户的信息
				EUser eUser = list.get(0);
				eUser.setPassword(newpwd);
				eUserDao.updateByPrimaryKey(eUser);
				request.getRequestDispatcher("a/login.jsp").forward(request, response);
				return;
			}
		}

	}
}
