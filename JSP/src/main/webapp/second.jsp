<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.util.Random, java.util.ArrayList, java.io.*, java.util.Date " %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is our second servlet</h1>

<%@ include file="header.jsp" %>
<h2>Random number : 

<%

Random r =new Random();
int n =r.nextInt(10);
out.println(n);

%>

<!--   <%= n %>   -->

</h2>
</body>
</html>