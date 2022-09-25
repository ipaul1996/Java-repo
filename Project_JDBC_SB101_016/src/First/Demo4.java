package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Demo4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Grace Marks:");
		int gmarks = sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Loading the driver related jar file. 														This is optional from java 1.6.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise"; 
		
	
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) { 														
			
			PreparedStatement ps = conn.prepareStatement("update student1 set marks = marks + ? where marks < 30");
			ps.setInt(1, gmarks); 
			
			int x = ps.executeUpdate();
			
			if(x>0)
				System.out.println(x + " Record updated"); 
			else 
				System.out.println("Not updated");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} 
		

	}

}


