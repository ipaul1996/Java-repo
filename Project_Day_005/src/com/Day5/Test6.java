package com.Day5;

public class Test6 {
	
	void fun1(A a) {
		
		System.out.println("Inside fun1(A a)");
		
	}
	
	void fun1(B b) {
		
		System.out.println("Inside fun1(B b)");
		
	}

	public static void main(String[] args) {
		
		Test6 t = new Test6();
		
		t.fun1(new A()); //Inside fun1(A a)
		
		t.fun1(new B()); //Inside fun1(B b)
		
//		t.fun1(null); //CE: The method fun1(A) is ambiguous for the type Test6
	}

}
