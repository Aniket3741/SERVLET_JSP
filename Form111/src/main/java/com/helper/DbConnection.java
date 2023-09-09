package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DBConnection")
public class DbConnection {
	private static Connection conn;


	public static Connection createConnection() {

		String url = "jdbc:mysql://localhost:3306/niraj"; // MySQL URL followed by the database name
		String username = "root"; // MySQL username
		String password = "Aniket@12"; // MySQL password
		System.out.println("In DBConnection.java class ");

		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // loading MySQL drivers. This differs for database servers
			} catch (Exception e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url, username, password); // attempting to connect to MySQL database
			System.out.println("Printing connection object " + conn);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}