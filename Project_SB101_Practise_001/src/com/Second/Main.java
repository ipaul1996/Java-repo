package com.Second;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "N1", 100);
		Student s2 = new Student(2, "N2", 100);
		
		System.out.println(s1.equals(s2)); //Objects are equal as per our logic defined in 											 											 equals method
		System.out.println(s1.hashCode());//131		
		System.out.println(s2.hashCode());//131
		
	}

}
