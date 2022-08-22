package com.Day6;

//7

public class Test {

	public static void main(String[] args) {
		
		StudentBean s1 = new StudentBean(5,"Asmita", 99);
		
		StudentBean s2 = new StudentBean();
		
		s2.setRoll(2);
		
		s2.setName("IP");
		
		s2.setMarks(85);
		
		System.out.println("Roll Number is : " + s1.getRoll());
		
		System.out.println("Name is : " + s1.getName());
		
		System.out.println("Marks is : " + s1.getMarks());
		
		
		System.out.println("Roll Number is : " + s2.getRoll());
		
		System.out.println("Name is : " + s2.getName());
		
		System.out.println("Marks is : " + s2.getMarks());

	}

}
