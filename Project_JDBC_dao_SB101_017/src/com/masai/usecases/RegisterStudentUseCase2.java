package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;



public class RegisterStudentUseCase2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String sname = sc.nextLine();
		
		System.out.println("Enter Student Marks: ");
		int marks = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter Student Password: ");
		String password = sc.nextLine();
		
		
		StudentDao dao = new StudentDaoImpl(); 
		
		Student student = new Student();
		
		student.setName(sname);
		student.setMarks(marks);
		student.setEmail(email);
		student.setPassword(password);
		
		//We have wrapped all the input data into student object
		
		String result = dao.registerStudent2(student);
		
		System.out.println(result);
		
		
	}

}
