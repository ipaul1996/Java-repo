package com.Day9;

public class Demo1 extends A {
	
	int x = 100;
	
	void funX() {
		System.out.println("Inside funX of Demo1");
		
		funA(); //Overridden method will be called
		super.funA(); //Parent class method will be called
	}
	
	
//	Method Overriding
	@Override
	void funA() {
		System.out.println("Inside funA of Demo1: Method Overriding");
	}
	
	public static void funS() {
		System.out.println("Inside funS of Demo");
	}
	

	public static void main(String[] args) {

		Demo1 d1 = new Demo1();
		
		System.out.println(d1.x);
		d1.funX();
		
		System.out.println(d1.i);
		d1.funA();
		
		d1.toString();

	}

}
