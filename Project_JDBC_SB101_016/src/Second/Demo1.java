package Second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Loading the driver related jar file. 														This is optional from java 1.6.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise"; 
		
	
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) { 														
			
			PreparedStatement ps = conn.prepareStatement("select * from student1");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int i = rs.getInt("id");
				String n = rs.getString("name");
				int m = rs.getInt("marks"); // If marks is null then value of m will be 0
				
				System.out.println("Id is : " + i);
				System.out.println("Name is : " + n);
				System.out.println("Marks is : " + m);
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
				 
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} 
		

	}

}




