package com.Day6;

//5

public class Student {
	
	int roll;
	
	String name;
	
	int marks;
	
	void showDetails() {
		
		System.out.println("Roll no. is : " + roll);
		
		System.out.println("Name is : " + name);
		
		System.out.println("Marks is : " + marks);
		
	}
	
	Student(int roll, String name, int marks) {
		
		this.roll = roll;
		
		this.name = name;
		
		this.marks = marks;
		
	}

}
