package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/S1")
public class S1 extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<tittle>Servlet S1<tittle>");
			out.println("</head>");
			out.println("<body>");
			
			String n1=request.getParameter("n1");
			String n2=request.getParameter("n2");
			
			int nn1=Integer.parseInt(n1);
			int nn2=Integer.parseInt(n2);
			
			// add
			int s=nn1+nn2;
			
			// attribute
			
			request.setAttribute("sum", s);
			
			// reuest ... request dispatcher 
			
			RequestDispatcher rd = request.getRequestDispatcher("s2");
			rd.forward(request, response);
			
			out.println("</body>");
			out.println("</html>");
			
			
		}
	}

}
