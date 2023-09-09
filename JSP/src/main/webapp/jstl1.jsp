<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page errorPage="error.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>This is our jstl1</h1>
  <%!
     int n1 = 10000;
     int n2 = 50;
  %>
  
  <%
  
  int division = n1/n2;
  
  %>
  
  <h1>Division = <%= division %></h1>
</body>
</html>