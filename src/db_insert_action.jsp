<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dao.first_dao" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import ="java.sql.*" %>
<%@ page import ="com.jh.config.*" %>
<%@ page import ="com.jh.Crpto.*" %>
<%@ page import ="dto.*" %>

	
<jsp:useBean class="beans.firstBeans" scope="page" id="hello"> 
<jsp:setProperty property="*" name="hello" />
</jsp:useBean>
<!-- firstbean을 받는 hello 객체에 변수명이 같은 모든(*)속성을 set함 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

		<%
		//<jsp:forward page="LoginCheck"></jsp:forward>
			String sk_str = session.getId();
			String stock_a=request.getParameter("stock_a");
			String stock_b=request.getParameter("stock_b");
			
			hyunCrypto ac=new hyunCrypto();
			trim trim=new trim();
	    	String publicKey;
	    	
	    	getProperties au=new getProperties();
	
	  	 	publicKey=trim.trim_request(1);
	  	 	sk_str=ac.encode(sk_str,publicKey);

			System.out.println("db insert jsp CALL");
			System.out.println(sk_str);
			System.out.println(stock_a);
			System.out.println(stock_b);	
			request.getSession().setAttribute("stock_a",stock_a);
			request.getSession().setAttribute("stock_b",stock_b);			
			request.getSession().setAttribute("sk_str",sk_str);			

		
			
	
			response.sendRedirect("db_insert");
		%>

</body>
</html>
