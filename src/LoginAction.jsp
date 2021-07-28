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
			String id=request.getParameter("beans_id");
			String pwd=request.getParameter("beans_pwd");

			hyunCrypto ac=new hyunCrypto();
			trim trim=new trim();
	    	String publicKey;
	    	
	    	getProperties au=new getProperties();

	  	 	publicKey=trim.trim_request(1);
			pwd=ac.encode(pwd,publicKey);

			System.out.println("Login AC CALL");
			System.out.println(id);
			System.out.println(pwd);
			
			request.getSession().setAttribute("id",id);
			request.getSession().setAttribute("pwd",pwd);
			
			//pageContext.forward("LoginCheck");
			response.sendRedirect("LoginCheck");
		%>

</body>
</html>
