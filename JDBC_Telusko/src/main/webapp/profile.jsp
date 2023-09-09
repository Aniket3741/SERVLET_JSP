<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ import = "java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
101<br>
Aniket Singh<br>
Aniket 3914<br>https://github.com/Aniket3741<br>

  <%
  
    String url = "jdbc:mysql://localhost:3306/Shalu"; 
    String username = "root";
    String password = "0";
    String sql = "select * from student where rollno-19";
    Class.forName("com.mysql.cj.jdbc.Driver" );
    Connection con = DriverManager.getConnection(url, username, password);
    Statement st = con.createStatement();
    
    ResultSet rs = st.executeQuery(sql);
    rs.next();
    
    
    
  %>
  
  Rollno : <%= rs.getString(1) %><br>
  Name : <%= rs.getString(2) %><br>
  Marks : <%= rs.getString(3) %>
  
</body>
</html>