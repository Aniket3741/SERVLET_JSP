<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = (String) session.getAttribute("name_key");
%>
<h3>Welcome :<%= name %> </h3>

<a href="profile.jsp">profile</a> &nbsp;&nbsp;
<a href="about-us.jsp">About Us</a> 

</body>
</html>