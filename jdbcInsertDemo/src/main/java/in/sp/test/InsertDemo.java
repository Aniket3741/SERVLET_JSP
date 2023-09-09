package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception {

		System.out.println("driver class loaded successfully");
		
		
//		used values
//		String name1 = "Anuranjan";
//		String email1 = "Anuranjan@gmail.com";
//		String pass1 = "Anuranjan@12";
//		String gender1 = "male";
//		String city1 = "Muzzaffarpur";
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shalu", "root", "Aniket@12");
//			
			PreparedStatement ps = con.prepareStatement("insert into table_name values('Sudhanshu', 'Shudhanshu@gmail.com', 'Sudha12', 'male', 'Delhi')");
//			PreparedStatement ps = con.prepareStatement("insert into table_name values('Ankit', 'Ankit@gmail.com', 'Ankit12', 'male', 'Bihar')");
//			PreparedStatement ps = con.prepareStatement("insert into table_name values('"+name1+"', '"+email1+"', '"+pass1+"', '"+gender1+"', '"+city1+"')");
			
//			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
//			ps.setString(1, name1);
//			ps.setString(2,  email1);
//			ps.setString(3,  pass1);
//			ps.setString(4,  gender1);
//			ps.setString(5,  city1);
			
			int  i = ps.executeUpdate();
			
			if(i>0) {
				System.out.println("Success");
			}
			else {
				System.out.println("Fail");
			}
	}
}