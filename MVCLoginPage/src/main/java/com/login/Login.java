package com.login;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

	public void proccessRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try (PrintWriter outPrintWriter = resp.getWriter()) {
			try {
				String studentN = null;
				String studentE = null;
				String studentU = null;
				con = DBConnection.createConnection();
				String queryString = "select * from users where Email=? and password=?";
				preparedStatement = con.prepareStatement(queryString);
				preparedStatement.setString(1, email);
				preparedStatement.setString(2, password);
				ResultSet resultSet = preparedStatement.executeQuery();
				System.out.print("hellio");
				while (resultSet.next()) {
					studentN = resultSet.getString(1);
					studentE = resultSet.getString(2);
					studentU = resultSet.getString(3);
					outPrintWriter.print("<h1>Your is Name " + studentN + "</h1><br><h1>Your Email is " + studentE
							+ "</h1><br><h1>Your username is " + studentU + "</h1>");
				}
				if (studentN == null) {
					outPrintWriter.print("<h1>Wrong Email or Password</h1>");

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proccessRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		proccessRequest(req, resp);
	}

}