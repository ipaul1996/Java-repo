package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;



public class RegisterStudentUseCase1 {
	
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
		
		
		StudentDao dao = new StudentDaoImpl(); //Interface reference, Implementation object
		
		String result = dao.registerStudent(sname, marks, email, password);
		
		System.out.println(result);
		
		
	}

}
