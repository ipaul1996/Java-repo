package com.masai.dao;

import java.util.List;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.exceptions.StudentException;
import com.masai.exceptions.CourseException;

public interface StudentDao {
	
	public String registerStudent(String name, int marks, String email, String password);
	
	public String registerStudent2(Student student);
	
	public Student getStudentByRoll(int roll) throws StudentException;

	public Student loginStudent(String username, String password) throws StudentException;
	
	public List<Student> getAllStudentDetails() throws StudentException;
	
	public String registerStudentInsideACourse(int cid, int roll) throws StudentException, CourseException;

	public List<StudentDTO> getAllStudentsByCourseName(String cname) throws CourseException;
}
