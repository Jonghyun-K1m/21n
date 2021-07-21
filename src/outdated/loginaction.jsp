<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dao.first_dao" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import ="java.sql.*" %>

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
		
			first_dao ab=new first_dao();
			int a=ab.login(hello.getBeans_id(),hello.getBeans_pwd());
/*		
			웹페이지에 찍기위한 소스
			PrintWriter script=response.getWriter();			
			script.println(hello.getBeans_id());
			script.println(hello.getBeans_pwd());
			script.println("===========");

*/
			switch(a){
			case 1 :
				System.out.println("access");
				session.setAttribute(hello.getBeans_id(),hello.getBeans_id());
				response.sendRedirect("default.jsp");
				//변수,대입값
				break;
			case 2:
				System.out.println("nopwd");
				response.sendRedirect("test.jsp");
				break;
			case 3:
				System.out.println("noid");
				response.sendRedirect("test.jsp");
				break;				
			default:
				response.sendRedirect("test.jsp");
				break;
			}
		%>

</body>
</html>
