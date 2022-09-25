package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;


public class Demo2 {

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
			
			Statement st = conn.createStatement(); 					
			int x = st.executeUpdate("insert into student1 values("+id+", '"+name+"', "+marks+")"); 
						
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
