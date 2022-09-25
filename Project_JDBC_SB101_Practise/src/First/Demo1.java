package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, "root", "sql123");
			
			Statement st = conn.createStatement();
			int x = st.executeUpdate("insert into student values(1, 'Akhil', 'Coimbatore', '90')");
			
			if(x>0) {
				System.out.println("Record inserted successfully..");
			} else {
				System.out.println("Record insertion failed..");
			}
			
		} catch (SQLException e) {			
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
