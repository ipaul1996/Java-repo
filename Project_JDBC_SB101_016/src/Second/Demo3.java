//Searching application ---> Getting only marks

package Second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Loading the driver related jar file. 														This is optional from java 1.6.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise"; 
		
	
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) { 														
			
			PreparedStatement ps = conn.prepareStatement("select marks from student1 where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
			
				int m = rs.getInt("marks"); 				
				System.out.println("Marks is : " + m);
				 
			} else {
				System.out.println("Record does not exist");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} 
		

	}

}






