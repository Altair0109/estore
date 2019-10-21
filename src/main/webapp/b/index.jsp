<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-首页</title>
<base href="/estore/">
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
</head>
<body>
	         
	<!--顶部-->
    <div class="top">
    <c:if test="${!empty user }">
    	<div class="top_center">
    		<ul class="top_lr">
            	<li><a>欢迎 ${user.username}</a></li>
            </ul>
            <ul class="top_bars">
            	<li><a href="logout">退出</a>|</li>
                <li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
                 <li><a href="http://www.briup.com">关注杰普<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </c:if>
    
    <c:if test="${empty user }">
    <div class="top_center">
    		<ul class="top_lr">
            	<li><a href="a/login.jsp" style="color: red;">亲,请登入</a></li>
                <li><a href="a/register.jsp">免费注册</a></li>
            </ul>
   
            <ul class="top_bars">
                <li><a href="c/confirmList.jsp">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="http://www.briup.com">关注杰普<span class="jt_down"></span></a></li>
            </ul>
        </div>
      </c:if>
    </div> 	
      
     <!--头部-->
    <div class="header3">
    	<a href="#"><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
      </div>
        
          <c:if test="${!empty user }">
        <div class="h3_right">
        	<div class="myyy">
            	<a href="a/userinfo.jsp">个人信息</a>
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
            	<a href="c/emptyCar.jsp">去购物车结算</a>
                <span class="sj_right"></span>
            </div>
        </div>
        </c:if>
    </div>
    
    
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
            <c:forEach items="${ map}" var="ent">
            
                <li><a href="show?cateid=${ent.key.id }">${ent.key.name }</a></li>
            </c:forEach>
            </ul>
        </div>
    </div>
    
	<div class="container3">
    	<div class="c3_b1">
        	<div class="c3_b1_left">
            	<dl>    
            	<!-- 循环遍历，显示一级栏目 -->
            	<c:forEach items="${map}" var="entry">
            	
               		<dd>
               		   <!-- 从map中获取key值，再获得一级栏目的名字 -->
                    	<h1>${entry.key.name }</h1>
                    	<p>
                    		<!-- 循环遍历获取Map中的value值，再获取二级栏目的id和name -->
                    		<c:forEach items="${entry.value }" var="det">
                        	<a href="show?detid=${det.id }">${det.name }</a>                   		
                    		</c:forEach>                   	
                      	</p>
                    </dd>
            	</c:forEach>  	
          </dl>
          
     </div>
            	
            <div class="c3_b1_center">
            	<div>
                	<a href="b/viewBook.jsp"><img src="images/ad1.png"></a>
                </div>
                <div class="c3_b1_c_bottom">
                    <ul>
                    <!-- for Each循环遍历,显示书本 -->
                    <c:forEach items="${proList }" var="pro" end="3">
                    
                        <li>
                           <a href="view?bookid=${pro.id}"><img src="${pro.img}" width=150 height=151/></a>
                           <a href="view?bookid=${pro.id}">${pro.name }</a>  
                        </li>
                    </c:forEach>
                  
                    </ul>
            	</div>
            </div>
            <div class="c3_b1_right">
            	<h1>杰普快报
            	 <c:if test="${!empty user }">
            	   <a href="b/detail.jsp">更多</a>
            	 </c:if>
            	 
            	</h1>
            	<ul>
            		<!-- 循环遍历，显示杰普简报 -->
            		<c:forEach items="${repList }" var="rep" >       		
                	<li><a href="b/detail.jsp?repid=${rep.id }">${rep.content }  </a></li>
            		</c:forEach>
                	
                </ul>
            </div>
            <div style="clear:both"></div>
        </div>
     </div>
    <div class="c20"></div>
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
        <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>

</body>
</html>