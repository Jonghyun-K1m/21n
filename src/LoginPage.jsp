<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import ="java.sql.*" %>
<%@ page import ="com.jh.config.*" %>
<%@ page import ="com.jh.Crpto.*" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>




<body>

	<%
	//<form action="LoginCheck" method="POST">
	%>
		<!--<form action="loginaction.jsp" method="POST"> What is yours  ? <br/>  -->
	
				
				<form action="LoginAction.jsp" method="POST">
				What is yours  ? <br/>
				 id<input type="text" name="beans_id"> <br/>
				pass<input type="text" name="beans_pwd" /><br/>
			
				 <input type="submit" value="로그인"/> 
			</form> 
	
			
</body>
</html>
