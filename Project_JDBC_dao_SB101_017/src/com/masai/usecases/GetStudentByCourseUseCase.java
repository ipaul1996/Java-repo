package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.StudentDTO;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.CourseException;

public class GetStudentByCourseUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter course name : ");
		String cn = sc.nextLine();
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
			
			List<StudentDTO> list = dao.getAllStudentsByCourseName(cn);
			
			list.forEach(sdto -> {
				
				System.out.println("Student Name : " + sdto.getName());
				System.out.println("Student Roll : " + sdto.getRoll());
				System.out.println("Student Email Address : " + sdto.getEmail());
				System.out.println("Course Enrolled : " + sdto.getCname());
				System.out.println("Course Fee : " + sdto.getFee());
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			});
			
		} catch (CourseException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
