package com.day1.Third;

import com.day1.Second.Student;

public class Demo {
	
public static void main(String[] args) {
		
		MyGen<Integer> m1= new MyGen<>(10);
		System.out.println(m1.getData());
		
		MyGen<String> m2=new MyGen<>("Hello");
		System.out.println(m2.getData());
		
		
		MyGen<Student> m3= new MyGen<>(new Student(10, "Ram", 500));
		System.out.println(m3.getData());
				
	}

}
