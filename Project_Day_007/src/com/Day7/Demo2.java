package com.Day7;

public class Demo2 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = "Hello";
		
		System.out.println(s1 == s2); //false ---> Compare reference
		System.out.println(s2 == s3); //true
		System.out.println(s1.equals(s2)); //true ---> Compare content

	}

}
