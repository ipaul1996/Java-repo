package com.Day5;

public class Demo1 {
	
	int x = 10;
	
	Demo1 d1 = new Demo1();

	public static void main(String[] args) {
		
		Demo1 d2 = new Demo1();
		
		System.out.println(d2.x); //StackOverFlowError

	}

}
