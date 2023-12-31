package com.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.RegisterBean;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/RegisterDao")
public class RegisterDao {
		public String registerUser(RegisterBean registerBean) {
			String fullName = registerBean.getFullName();
			String password = registerBean.getPassword();
			String email = registerBean.getEmail();
			String gender = registerBean.getGender();
			String course = registerBean.getCourse();
			
			Connection con = null;
			PreparedStatement preparedStatement = null;
			try {
				con = DbConnection.createConnection();
				String query = "insert into users(fullName,Email,userName,password) values (?,?,?,?)"; // Insert
																										// user
																										// details
																										// into
																										// the
																										// table
																										// 'USERS'
				preparedStatement = con.prepareStatement(query); // Making use of prepared statements here
																	// to insert bunch
				// of data
				preparedStatement.setString(1, fullName);
				preparedStatement.setString(2, password);
				preparedStatement.setString(3, email);
				preparedStatement.setString(4, gender);
				preparedStatement.setString(5, course);
				
				int i = preparedStatement.executeUpdate();

				if (i != 0) // Just to ensure data has been inserted into the database
					return "SUCCESS";
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.print("Hello World");
			}
			return "Oops.. Something went wrong there..!"; // On failure, send a message from here.
		}
	}
}


