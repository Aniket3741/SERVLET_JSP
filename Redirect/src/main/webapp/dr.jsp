<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.Random, java.util.ArrayList, java.io.* " %>
    <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp directives | Directive tags in Jsp</title>
</head>
<body>
<h2> Random number  : </h2>
<%

    Random r =new Random();

    int n =r.nextInt(10);
    
    out.print(n);


%>
</body>
</html>