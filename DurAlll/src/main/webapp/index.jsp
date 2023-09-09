<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ page import="java.util.Date" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to project home page</h1>
<p>This is Home page of Servlet testing</p>

 <%= new Date()%>
<br>
<a href="LoginServlet">Login Servlet</a>
</body>
</html>