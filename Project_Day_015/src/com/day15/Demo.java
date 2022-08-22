package com.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Student> studentArray = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.println("Enter details of student: " + (++count));
			
			System.out.println("Enter Roll: ");
			int roll = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Marks: ");
			int marks = sc.nextInt();
			
			Student s1 = new Student(roll, name, marks);
			
			studentArray.add(s1);
			
			System.out.println("Student added successfully...");
			System.out.println("Would you like to add more student? Type y or n");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
				continue;
				
			} else 
				break;
			
		}
		
		
//		for(Student student : studentArray) {
//			
//			System.out.println("Roll number is: " + student.getRoll());
//			System.out.println("Name is: " + student.getName());
//			System.out.println("Marks is: " + student.getMarks());
//			
//			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		}
		
		for(int i = 0; i < studentArray.size(); i++) {
			
			Student student = studentArray.get(i);
			System.out.println("Roll number is: " + student.getRoll());
			System.out.println("Name is: " + student.getName());
			System.out.println("Marks is: " + student.getMarks());
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

	}

}
