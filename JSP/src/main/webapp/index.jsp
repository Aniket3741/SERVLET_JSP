<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is jsp file</title>
</head>
<body>

<%!

   int a = 45;
   int b = 90;
   
   public int doSum(){
	   return a + b;
   }
   
   public String reverse(){
	   StringBuffer br = new StringBuffer(name);
	   return br.reverse().toString();
   } 
   
%>

<%

    out.println(a);
    out.println("<br>");
    out.println(b);
    out.println("<br>");
    out.println(doSum());
    out.println("<br>");
    out.println(reverse());
 
%>

<%= doSum() %><br>
<%= a %><br>
<%= reverse() %> 

</body>
</html>