package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //Loading the driver related jar file. This is optional from java 1.6.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/Practise"; //Preparing url
		
		Connection conn = null; //Declaring conn outside the try block so that we can access it in finally block for closing the connection
		
		try {
			conn = DriverManager.getConnection(url, "root", "sql123"); 	//Establishing the connection with db
			
			Statement st = conn.createStatement(); 	//Getting the statement object for executing SQL query
			
			int x = st.executeUpdate("insert into student1 values(1, 'IP', 25)"); 
			/* This Method is for DML. If we run this program more than once we will get an exception java.sql.SQLIntegrityConstraintViolationException because id field in db has primary key as constraint. */
			
			if(x>0)
				System.out.println("Record inserted");  //x is the no. of rows affected in db
			else 
				System.out.println("Not inserted");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} finally {
			
			try {
				conn.close(); //Closing the connection
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
/*		Another way of closing the connection ---> try with resources. Here it is ensured that if try block or catch block executes after execution resources will be released.
		
		try(Connection conn = DriverManager.getConnection(url, "root", "sql123")) { 														
			
			Statement st = conn.createStatement(); 					
			int x = st.executeUpdate("insert into student1 values(1, 'IP', 25)"); 
						
			if(x>0)
				System.out.println("Record inserted"); 
			else 
				System.out.println("Not inserted");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			
		} 
		  
*/	
		
	 }
}
