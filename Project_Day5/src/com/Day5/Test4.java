package com.Day5;

//Static Polymorphism

public class Test4 {
	
	void fun1() {
		
		System.out.println("Inside fun1");
	}
	
	void fun1(int x) {
		
		System.out.println("Inside fun1(int x) "+x);
		
	}
	
	void fun1(float y) {
		
		System.out.println("Inside fun1(float y) "+y);
		
	}

	public static void main(String[] args) {
		
		Test4 t = new Test4();
		
		t.fun1();
		
		t.fun1(20);
		
		t.fun1(10.55f);
		
	}

}
