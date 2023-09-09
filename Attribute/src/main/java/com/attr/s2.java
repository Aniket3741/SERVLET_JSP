package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/s2")
public class s2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<tittle>Servlet S2<tittle>");
			out.println("</head>");
			out.println("<body>");
			
//			String n1=request.getParameter("n1");
//			String n2=request.getParameter("n2");
			
			int nn1=Integer.parseInt(request.getParameter("n1"));
			int nn2=Integer.parseInt(request.getParameter("n2"));
			

			int p = nn1*nn2;
			
			// get attribute from request object
			
			int sum=(int)request.getAttribute("sum");
			
			out.println("<h2>");
			out.println("Sum is = "+sum);
			out.println("product is = "+p);
			out.println("</h2>");
			
			out.println("</body>");
			out.println("</html>");
			
		}
	}
}
