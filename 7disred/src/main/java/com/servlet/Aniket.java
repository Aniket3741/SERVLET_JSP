package com.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Aniket")
public class Aniket extends HttpServlet{
   	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			HttpSession session = request.getSession(false);
			if (username.equals("Aniket Kumar") && password.equals("1234")) {
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				response.sendRedirect("userpage.jsp");
			} else {
				request.getRequestDispatcher("index.jsp").include(request, response);
			}		}}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}
}