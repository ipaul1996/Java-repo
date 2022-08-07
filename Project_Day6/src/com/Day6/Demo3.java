package com.Day6;

//3

public class Demo3 {
	
	Demo3() {
		
		this(10);
		
		System.out.println("Inside Demo3()");
		
	}
	
	Demo3(int x) {
		
		this("Hello");
		
		System.out.println("Inside Demo3(int x)");
		
		System.out.println(x);
		
	}
	
	Demo3(String s) {
		
		System.out.println("Inside Demo3(String s)");
		
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		
		Demo3 d = new Demo3();

	}

}
