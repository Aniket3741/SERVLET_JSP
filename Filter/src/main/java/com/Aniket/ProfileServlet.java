package com.Aniket;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

   
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()){
			System.out.println("Profile servlet Executed");
			out.println("<!DOCTYPE html");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet ProfileServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Welcome to profile page</h1>");
			out.println("<h1>This is profile page</h1>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}

}
