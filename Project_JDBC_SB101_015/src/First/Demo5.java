package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Demo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id of the student that you want to delete:");
		int id = sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Loading the driver related jar file. 														This is optional from java 1.6.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise"; 
		
	
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) { 														
			
			PreparedStatement ps = conn.prepareStatement("delete from student1 where id = ?");
			ps.setInt(1, id); 
			
			int x = ps.executeUpdate();
			
			if(x>0)
				System.out.println(x + " Record deleted"); 
			else 
				System.out.println("Not record exists with this id");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} 
		

	}

}



