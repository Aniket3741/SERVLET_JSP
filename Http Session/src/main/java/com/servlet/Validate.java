package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name  = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		if(pass.equals("1234")) {
			// creating a Session
			HttpSession session = request.getSession(); 
			session.setAttribute("user", name);
			response.sendRedirect("Welcome");
			
		}
		else {
			response.sendRedirect("index.html");
		}
	}

}
