<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id"); // Object의 장점 : 다형성
		if (id != null) { // login체크로 url을 알더라도 들어오는 것을 방지
			out.print(id + "님 환영합니다.");
			out.print("<a href='LogOut'>로그아웃</a>");
		} else {
			response.sendRedirect("LoginPage.jsp");
		}
	%>
	
				<form action="db_insert_action.jsp" method="POST"> send to db <br/>
				 name<input type="text" name="stock_a"/><br/>
				volume<input type="text" name="stock_b"/><br/>
				 <input type="submit" value="전송"/> 
				</form> 
		
				<form action="db_select" method="POST"> select all <br/>
				 <input type="submit" value="조회"/> 
				</form> 		
				
</body>
</html>
