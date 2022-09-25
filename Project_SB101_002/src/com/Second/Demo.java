package com.Second;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void fun1(List<? extends Person> list) {
		
		System.out.println("inside fun1...");
		
		for(Person p:list) {			
			System.out.println(p);		
			
			p.show();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				
				new Student(12, "N1", 500),
				new Student(13, "N2", 500),
				new Student(14, "N3", 500),
				new Student(15, "N4", 500)
				
				);
		
		fun1(students);		
		
	}

}
