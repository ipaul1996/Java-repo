package com.Day5;

public class Demo3 {
	
	int k;
	
	static int x = 225;
	
	static void fun1() {
		
		System.out.println("Inside the fun1");
		
	}

	public static void main(String[] args) {
		
//		How to access static members?
		
//		Approach1
		System.out.println(x); //225
		
		fun1(); //Inside fun1
		
//		Approach2
		System.out.println(Demo3.x); //225
		
		Demo3.fun1(); //Inside fun1
		
//		This is the most recommended way of calling static members. In this approach we can 		call any class members(Static).
		
		System.out.println(Demo2.j); //20
		
//		Approach3
		
		Demo3 d = new Demo3();
		
		d.fun1(); //Inside fun1
		
		//This approach is not recommended. 
		
		d = null;
		
		d.fun1(); //Inside fun1
		
//		System.out.println(d.k); //NullPointerException
		
		
		

	}

}
