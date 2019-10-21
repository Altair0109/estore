package com.briup.web.b;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.briup.bean.Cate;
import com.briup.bean.Catedet;
import com.briup.bean.CatedetExample;
import com.briup.bean.CatedetExample.Criteria;
import com.briup.bean.Pricescope;
import com.briup.bean.Product;
import com.briup.bean.Report;
import com.briup.mapper.CateMapper;
import com.briup.mapper.CatedetMapper;
import com.briup.mapper.PricescopeMapper;
import com.briup.mapper.ProductMapper;
import com.briup.mapper.ReportMapper;
import com.briup.util.BriupUtil;

@WebListener()
public class IndexListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext app = event.getServletContext();
		//查询所有产品
		ProductMapper proDao = BriupUtil.getMapper(ProductMapper.class);
		//查询所有杰普快报
		ReportMapper repDao = BriupUtil.getMapper(ReportMapper.class);
		//查询价格
		PricescopeMapper priDao = BriupUtil.getMapper(PricescopeMapper.class);
		
		//查询所有一级栏目和一级栏目对应的二级栏目
		CateMapper cateDao = BriupUtil.getMapper(CateMapper.class);
		CatedetMapper detDao = BriupUtil.getMapper(CatedetMapper.class);
		
		//没有where条件
		List<Product> proList = proDao.selectByExample(null);
		List<Report> repLsit = repDao.selectByExample(null);
		List<Pricescope> priList = priDao.selectByExample(null);
		//获得所有一级栏目
		List<Cate> cateList = cateDao.selectByExample(null);
		
		//map用来存放一级栏目和二级栏目
		Map<Cate, List<Catedet>> map=new HashMap<Cate, List<Catedet>>();
		
		for(Cate c:cateList) {
			CatedetExample detExample = new CatedetExample();
			Criteria detWhere = detExample.createCriteria();
			//找到当前栏目下的二级栏目
			//where category_id=一级栏目id
			detWhere.andCategoryIdEqualTo(c.getId());
			List<Catedet> detList = detDao.selectByExample(detExample);
			System.out.println("----....."+detList);
		    map.put(c, detList);
		
		}
		
		
		//放到容器中
		app.setAttribute("map", map);
		app.setAttribute("proList", proList);
		app.setAttribute("repList", repLsit);
		app.setAttribute("cateList", cateList);
		app.setAttribute("priList", priList);
		
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}


}
