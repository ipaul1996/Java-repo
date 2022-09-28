package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.StudentException;

public class LoginUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String uname = sc.nextLine();
		
		System.out.println("Enter Password : ");
		String pass = sc.nextLine();
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
			
			Student student = dao.loginStudent(uname, pass);
			System.out.println("Welcome " + student.getName());
			
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
