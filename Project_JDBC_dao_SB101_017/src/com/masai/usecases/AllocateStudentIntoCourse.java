package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;

public class AllocateStudentIntoCourse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the course id : ");
		int cid = sc.nextInt();
		
		System.out.println("Enter the roll no. : ");
		int roll = sc.nextInt();
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
			
			String str = dao.registerStudentInsideACourse(cid, roll);
			System.out.println(str);
			
		} catch (StudentException | CourseException e) {
			System.out.println(e.getMessage());
		}
	}

}
