package com.valan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		if(userName.equals("Admin")  && password.equals("123"))
			response.sendRedirect("Success.jsp");
		else {
			response.sendRedirect("Fail.jsp");
			
		out.close();
		}
	}

}
