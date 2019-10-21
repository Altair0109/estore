package com.briup.web.b;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Product;
import com.briup.bean.ProductExample;
import com.briup.bean.ProductExample.Criteria;
import com.briup.mapper.ProductMapper;
import com.briup.util.BriupUtil;

@WebServlet("/view")
public class ViewBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 展示书籍的详细页面，内容，通过书的id值
		 * select * from product where id=${id};
		 */
		String bookid = request.getParameter("bookid");
		ProductMapper proDao = BriupUtil.getMapper(ProductMapper.class);
		ProductExample proExample = new ProductExample();
		Criteria proWhere = proExample.createCriteria();
		proWhere.andIdEqualTo(new BigDecimal(bookid));
		List<Product> bookList = proDao.selectByExample(proExample);
		System.out.println("book======="+bookList);
		
		HttpSession session = request.getSession();
		session.setAttribute("bookList", bookList);
		request.getRequestDispatcher("b/viewBook.jsp").forward(request, response);
	}
}
