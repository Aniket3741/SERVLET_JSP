package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DBConnection")
public class DBConnection {
	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/youtube"; // MySQL URL followed by the database name
		String username = "root"; // MySQL username
		String password = "Aniket@12"; // MySQL password
		System.out.println("In DBConnection.java class ");

		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // loading MySQL drivers. This differs for database servers
			} catch (Exception e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, username, password); // attempting to connect to MySQL database
			System.out.println("Printing connection object " + con);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}