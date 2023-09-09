package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
    
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myEmail = req.getParameter("email");
		String myPass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		
		if(myEmail.equals("210101120019@cutm.ac.in") && myPass.equals("12345")) {
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else {
			resp.setContentType("text/html");
			out.print("<h3>Email id and password didnt matched</h3");
			RequestDispatcher rd = req.getRequestDispatcher("/index1.html");
			rd.forward(req, resp);
		}
	}

}
