package com.masai.usecases;

import java.util.List;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;

public class GetAllStudentUseCase {
	
	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
			
			List<Student> list = dao.getAllStudentDetails();
			
			list.forEach(s -> {
				System.out.println("Student Name : " + s.getName());
				System.out.println("Student Email : " + s.getEmail());
				System.out.println("Student Roll : " + s.getRoll());
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
			});
			
		} catch (StudentException se) {
			
			System.out.println(se.getMessage());
		}
	}

}
