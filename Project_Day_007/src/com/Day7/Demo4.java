package com.Day7;

public class Demo4 {

	public static void main(String[] args) {
		
		String s1 = "Welcome";		
		String s2 = s1.concat(" to Java");
		
		System.out.println(s1); //Welcome		
		System.out.println(s2); //Welcome to Java
		
		String s3 = s1.toUpperCase();
		
		System.out.println(s3); //WELCOME
		System.out.println(s1 == s3); //false
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		
		String s4 = s3.toUpperCase();
		
		System.out.println(s3 == s4); //true
		System.out.println(s3.equals(s4)); //true
		
		String s5 = "       Hello        ";
		
		System.out.println(s5.trim());
		
		

	}

}
