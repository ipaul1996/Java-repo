package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.exceptions.StudentException;
import com.masai.exceptions.CourseException;
import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String registerStudent(String name, int marks, String email, String password) {
		
		String message = "Student not registered...";
						
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement
						("insert into Student(name, marks, email, password) values(?, ?, ?, ?)");
			
			ps.setString(1, name);
			ps.setInt(2, marks);
			ps.setString(3, email);
			ps.setString(4, password);
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Student registerd successfully";
			}
			
		} catch (SQLException e) {
			
			message = e.getMessage();
			
		}
		
			
		return message;
		
	}
	
	
	
	

	@Override
	public String registerStudent2(Student student) {
		
		String message = "Student not registered...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement
						("insert into Student(name, marks, email, password) values(?, ?, ?, ?)");
			
			ps.setString(1, student.getName());
			ps.setInt(2, student.getMarks());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getPassword());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Student registerd successfully";
			}
			
		} catch (SQLException e) {
			
			message = e.getMessage();
			
		}
		
			
		return message;
		
	}





	@Override
	public Student getStudentByRoll(int roll) throws StudentException {
		
		Student student = null;
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student where roll = ?");
			
			ps.setInt(1, roll);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e = rs.getString("email");
				String p = rs.getString("password");
				
				student = new Student(r, n, m, e, p);
								
			} else {
				 
				throw new StudentException("Student does not exist in the database with roll " + roll);
			 }
			
		} catch (SQLException e) {
			
			e.printStackTrace(); //It will be printed at server so client will not get any information
			throw new StudentException(e.getMessage()); //Exception re-throwing
			
		} 
		
		return student;
	}





	@Override
	public Student loginStudent(String username, String password) throws StudentException {
		
		Student student = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
		PreparedStatement ps = 	conn.prepareStatement("select * from student where email = ? AND password = ? ");
			
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			
			int r = rs.getInt("roll");
			String n = rs.getString("name");
			int m = rs.getInt("marks");
			String e = rs.getString("email");
			String p = rs.getString("password");
			
			student = new Student(r, n, m, e, p);
							
		} else {
			 
			throw new StudentException("Invalid username or password");
		 
		}
		
		
		} catch (SQLException e) {
			
			throw new StudentException(e.getMessage());
			
		}
		
		
		return student;
	}





	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		
		List<Student> studentlist = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");
				String e = rs.getString("email");
				String p = rs.getString("password");
				
				studentlist.add(new Student(r, n, m, e, p));
				
			}
			
			if(studentlist.size() == 0) {
				
				throw new StudentException("No student found...");
			}
			
		} catch (SQLException e) {
			
			throw new StudentException(e.getMessage());
		}
		
		
		return studentlist;
		
	}





	@Override
	public String registerStudentInsideACourse(int cid, int roll) throws StudentException, CourseException {
		
		String message = "Not registered";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from student where roll = ?");
			ps.setInt(1, roll);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				PreparedStatement ps1 = conn.prepareStatement("select * from course where cid = ?");
				ps1.setInt(1, cid);
				
				ResultSet rs1 = ps1.executeQuery();
				
				if(rs1.next()) {
					
					PreparedStatement ps2 = conn.prepareStatement("insert into course_student values(?, ?)");
					ps2.setInt(1, cid);
					ps2.setInt(2, roll);
					
					int x = ps2.executeUpdate();
					
					if(x > 0) {
						message = "Student registerd inside the course succesfully";
						
					} else {
						throw new StudentException("Technical error..!");
					}
					
				} else {
					
					throw new CourseException("Course does not exist in the database");
					
				}
				
				
			} else {
				
				throw new StudentException("Student does not exist in the database");
			}
			
			
		} catch (SQLException se) {
			
			
			throw new StudentException(se.getMessage());
		}
		
		return message;
	}





	@Override
	public List<StudentDTO> getAllStudentsByCourseName(String cname) throws CourseException {
		
		List<StudentDTO> studentlist = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select c.cname, c.fee, s.name, s.roll, s.email "
					+ "from course c inner join student s inner join course_student cs on "
					+ "cs.cid = c.cid and cs.roll = s.roll and c.cname = ?");
			
			ps.setString(1, cname);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				String e = rs.getString("email");
				String c = rs.getString("cname");
				int f = rs.getInt("fee");
				
				StudentDTO sdto = new StudentDTO(r, n, e, c, f);
				
				studentlist.add(sdto);
			}
			
			if(studentlist.isEmpty()) {
				
				throw new CourseException("No student found in the specified course");
			}
			
			
		} catch (SQLException e) {
			
			throw new CourseException(e.getMessage());
		}
		
		
		
		return studentlist;
	}

}
