package com.day15;

public class Demo2 {

	public static void main(String[] args) {
		
		String s1 = "Amit";
		String s2 = "Amit";
		String s3 = new String("Amit");
		String s4 = new String("Amit");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		Student st1 = new Student(1, "Ram", 35);
		Student st2 = new Student(1, "Ram", 35);
		
		System.out.println(st1.equals(st2));

	}

}
