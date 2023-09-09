package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/myLogin")
public class Login extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail = (String) request.getParameter("email");
		String mypass = (String) request.getParameter("pass1");
		
		if(myemail.equals("Aniket@gmail.com")&& mypass.equals("12345")){
			System.out.println("Success");
		}
		else {
			System.out.println("failed");
		}
	}
}
	