import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FirstJDBC {
	public static void main(String args[]) {
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// creating a connection
			
			String url = "jdbc:mysql://localhost:3306/part";
			String username = "root";
			String password = "Aniket@12";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			// create a query
			String q = "create table table1(tid, int(20) primary key auto increment, tNmae varchar(200), not null, tcity varchar(400))";
			
			// create statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created");
//			con.close();
			
			// create a query
			String q = "insert intotable1(tName, tCity) values(?,?)";
			
			//get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the values to query
			pstmt.setString(1, "ANIKET SINGH");
			pstmt.setString(2, "Mubarakpur") ; 
			
			pstmt.executeUpdate();
			
			System.out.println("inserted");
			con.close();
			
			if(con.isClosed()) {
				System.out.println("connection is closed");
			}
			else {
				System.out.println("dataabases created");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
