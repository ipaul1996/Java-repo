package com.Day7;

public class Demo3 {

	public static void main(String[] args) {
		
		String s1 = "Welcome";
		System.out.println(System.identityHashCode(s1)); //212628335
		
		s1 = null;
		
		String s2 = "Welcome";
		System.out.println(System.identityHashCode(s2)); //212628335
		System.out.println(System.identityHashCode(s1)); //0
		

	}

}
