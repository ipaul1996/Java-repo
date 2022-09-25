package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id:");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Marks: ");
		int marks = sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Loading the driver related jar file. 														This is optional from java 1.6.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise"; 
		
	
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) { 														
			
			PreparedStatement ps = conn.prepareStatement("insert into student1 values(?, ?, ?)");
			ps.setInt(1, id); //This does not accept any SQL query thus it provides better security	
			ps.setString(2, name); 
			ps.setInt(3, marks);
//			We don't have to close prepared statement as when conection will clone it will also close automatically.
			
			int x = ps.executeUpdate();
			
			if(x>0)
				System.out.println("Record inserted"); 
			else 
				System.out.println("Not inserted");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} 
		

	}

}

