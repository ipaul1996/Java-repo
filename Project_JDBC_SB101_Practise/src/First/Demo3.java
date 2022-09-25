package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter Student Marks: ");
		int marks = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "sql123")){
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?, ?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Record inserted succesfully...");
			} else {
				System.out.println("Record not inserted...");
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
