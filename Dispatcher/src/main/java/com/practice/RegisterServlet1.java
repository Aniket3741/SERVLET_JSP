package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/RegisterServlet")
public class RegisterServlet1 extends HttpServlet {
	


    
	protected void doPost(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome to Register Servlet</h2>");
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email"); 
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String cond = request.getParameter("condition");
		out.println(cond);
		if(cond!=null) {
			
		if(cond.equals("checked")) {
			out.println("<h2> Name : "+ name + "</h2");
			out.println("<h2> password : "+ password + "</h2");
			out.println("<h2> email : "+ email + "</h2");
			out.println("<h2> gender : "+ gender + "</h2");
			out.println("<h2> course : "+ course + "</h2");
			
			// 
			// JDBC
			// 
			// Saved to db
			//
			
			RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
			
		}
		else {
			out.println("<h2>You have not accepted terms and condition</h2>");
		}
		}
		else {
			out.println("<h2>You have not accepted terms and condition</h2>");
			
			// I want to include output of index.html
			
			// get the object of RequestDispatcher
			
			RequestDispatcher rd = request.getRequestDispatcher("insex.html");
			rd.include(request, response);		}
	}

}
