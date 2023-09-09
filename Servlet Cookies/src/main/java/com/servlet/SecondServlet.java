package com.servlet;
 
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			Cookie ck[]=request.getCookies();
			out.println("Hello" + ck[0].getValue());
			
			out.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}
