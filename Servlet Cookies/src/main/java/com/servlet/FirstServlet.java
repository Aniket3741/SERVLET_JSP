package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String n = request.getParameter("userName");
			out.println("Welcome" + n);
			
			Cookie ck = new Cookie("Uname" ,n);  // creating cookie object
			response.addCookie(ck);  // adding cookie in the response
			
			 // creating submit buttom
			
			out.print("<form action='SecondServlet'>");  
			out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
			
			out.close();
			
		}
		catch(Exception e) {
			System.out.println("e");
			
		}
	}

}
