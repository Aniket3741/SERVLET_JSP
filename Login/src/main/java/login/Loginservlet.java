package login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n = request.getParameter("t1");	
		String pwd = request.getParameter("t2");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(n.equals("Aniket") && pwd.equals("12345")) {
			HttpSession hs = request.getSession();
			hs.setAttribute("uname", n);
			response.sendRedirect("success.jsp");
		}
		else {
			out.println("<font color=red size=14 face=Aniket>Sorry! username or password incorrect....Try Again");
			response.sendRedirect("input.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("input.jsp");
			rd.include(request, response);
		}
		
	}

}
