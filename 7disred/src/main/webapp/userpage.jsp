<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@page import="com.mysql.cj.xdevapi.Session"%>
	
<%session = request.getSession(false);
String username = (String) session.getAttribute("username");
String password = (String) session.getAttribute("password");
if (username == null || password == null) {response.sendRedirect("index.jsp");}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserPage</title>
</head>
<body>

	<%-- <h1>Your username is<%=username%> and password is<%=password%></h1> --%>
	
	<h1>Your username is <%=username%></h1>
	
	<h1>Your password is <%=password%></h1>
	
	
	
</body>
</html>