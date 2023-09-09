<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>
    <%@ page import="java.util.Date" %>
        <%@ taglib prefix="c" uri="	http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
*{
background : red;
}
</style>
<body>
<%-- <div style="color: white">
<h1>Sorry !! Something is happening</h1>
<p>Note......</p>
<p><%= exception %></p>
   <p> <%= exception %></p>
</div> --%>


<%= new Date().toString() %>
<h1>Taglib directive tutorial</h1>
<hr>
<c:set var="name" value="TECHNICAL INDIA"></c:set>
<c:out value=${name}></c:out>
<% %>

</body>
</html>
