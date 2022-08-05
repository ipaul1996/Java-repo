package com.Day5;

//Method Overloading

public class Test5 {
	
	void fun1(int x, float y) {
		
		System.out.println("Inside fun1(int x, float y)");
		
	}
	
	void fun1(float x, int y) {
		
		System.out.println("Inside fun1(float x, int y)");
		
	}

	public static void main(String[] args) {
		
		Test5 t = new Test5();
		
		t.fun1(10, 10.5f); //Inside fun1(int x, float y)
		
		t.fun1(10.5f, 10); //Inside fun1(float x, int y)
		
//		t.fun1(10, 10); //CE:The method fun1(int, float) is ambiguous for the type Test5

	}

}
