package Perform;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = null;
		
		try {
			out = response.getWriter();
			out.println("<center>");
			int a = Integer.parseInt(request.getParameter("num1"));
			int b = Integer.parseInt(request.getParameter("num2"));
			int c=0;
			String op = request.getParameter("btn");
			if(op.equals("+"))c=a+b;
			if(op.equals("-"))c=a-b;
			if(op.equals("*"))c=a*b;
			if(op.equals("/"))c=a/b;
			if(op.equals("%"))c=a%b;
			out.println(c);
		}catch(Exception e) {
			out.println("Error : "+e.getMessage());
		}
		finally {
			out.println("<br>");
			out.println("To Goto main page <a href=index.html> Click Here </a>");
			out.println("</center");
		}
		
	}


}
