package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter student address : ");
		String address = sc.nextLine();
		
		System.out.println("Enter student marks : ");
		int marks = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) {

			Statement st = conn.createStatement();
			int x = st.executeUpdate("insert into student values("+id+", '"+name+"', '"+address+"', "+marks+")");
			
			if(x>0) {
				System.out.println("Record has inserted");
			} else {
				System.out.println("Record has not inserted");
			}
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
