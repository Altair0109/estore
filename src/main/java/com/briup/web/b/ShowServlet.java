package com.briup.web.b;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Catedet;
import com.briup.bean.CatedetExample;
import com.briup.bean.CatedetExample.Criteria;
import com.briup.bean.Product;
import com.briup.bean.ProductExample;
import com.briup.mapper.CatedetMapper;
import com.briup.mapper.ProductMapper;
import com.briup.util.BriupUtil;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获得一级目录的id
		String cateid = request.getParameter("cateid");
		//获得二级目录的id
		String detid = request.getParameter("detid");
		//String path="a/list.jsp";
		
		//使用list存放 list.jsp需要显示的数据
		List<Product> list=new ArrayList<Product>();
		//用来存放 当前页面显示的所有书籍的 有关出版社信息
		Set<String> publishList=new HashSet<String>();
		
		/*
		 * 
		 通过二级目录的id查询书籍的所有信息
		儿童类一级目录下的二级目录detid=9 ，
		一个二级目录下有多个product产品
		select * from product pro, catedet det
		where pro.categorytwo_id=det.id
		 * 
		 */	
		CatedetMapper detDao = BriupUtil.getMapper(CatedetMapper.class);
		ProductMapper proDao = BriupUtil.getMapper(ProductMapper.class);
		
		//当用户点击一级栏目
		if(cateid!=null && !"".equals(cateid)) {
			CatedetExample detExample = new CatedetExample();
			Criteria detWhere = detExample.createCriteria();
			//查询获得一级目录下的所有二级目录
			detWhere.andCategoryIdEqualTo(new BigDecimal(cateid));
		
			List<Catedet> detList = detDao.selectByExample(detExample);
			System.out.println(".........."+detList);
			
			for(Catedet det:detList) {
				ProductExample proExample = new ProductExample();
				com.briup.bean.ProductExample.Criteria proWhere = proExample.createCriteria();
				//查询获得二级目录下的所有产品,添加到list集合中
				proWhere.andCategorytwoIdEqualTo(det.getId());
				List<Product> proList = proDao.selectByExample(proExample);		
				System.out.println(",-,-,-,-,-,-,-,-,-,-"+proList);
				list.addAll(proList);
			}
		//当用户点击二级栏目
		}else if(detid!=null && !"".equals(detid)){
			ProductExample proExample = new ProductExample();
			com.briup.bean.ProductExample.Criteria proWhere = proExample.createCriteria();
			//查询获得二级目录下的所有产品,添加到list集合中
			proWhere.andCategorytwoIdEqualTo(new BigDecimal(detid));
			List<Product> proList = proDao.selectByExample(proExample);	
		
			list.addAll(proList);
			
		}else {
			System.out.println("点击错误");
			request.getRequestDispatcher("b/index.jsp").forward(request, response);;
			return;
		}
		
		//遍历所有产品得到所有产品的出版社
		for(Product p :list) {
			publishList.add(p.getPublish());
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		session.setAttribute("publishList", publishList);
		request.getRequestDispatcher("b/list.jsp").forward(request, response);
		
	}
}
