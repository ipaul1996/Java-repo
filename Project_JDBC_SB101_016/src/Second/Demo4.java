//Getting all the records based on marks

package Second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Demo4 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise"; 
		
	
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) { 														
			
			PreparedStatement ps = conn.prepareStatement("select * from student1 where marks < 800");
			ResultSet rs = ps.executeQuery();
			
			boolean flag = true;
			if(rs.next()) {
				
				flag = false;
				
				int i = rs.getInt("id");
				String n = rs.getString("name");
				int m = rs.getInt("marks"); 
				
				System.out.println("Id is : " + i);
				System.out.println("Name is : " + n);
				System.out.println("Marks is : " + m);
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
				 
			} else {
				System.out.println("Record does not exist");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} 
		

	}

}






