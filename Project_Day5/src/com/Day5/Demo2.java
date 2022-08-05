package com.Day5;

public class Demo2 {
	
	int x = 10;
	
	Demo2 d1;
	
	static byte j = 20;

	public static void main(String[] args) {
		
		Demo2 d2 = new Demo2();
		
		System.out.println(d2.d1); //null
		
		d2.d1 = new Demo2();
		
		System.out.println(d2.d1.x); //10

	}

}
