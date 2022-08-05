package com.Day5;

public class Test7 {
	
	int fun1() {
		
		System.out.println("Inside fun1()");
		
		return 20;
		
//		System.out.println("Hello"); CE: Unreachable code
	}
	
	A fun2() {
		
		A a8 = new A();
		
//		return a8;
		
//		return null;
		
		return new A();
		
	}

	public static void main(String[] args) {
	
		Test7 t = new Test7();
		
		int k = t.fun1();
		
		A obj = t.fun2();
		
		if(obj != null) 
			
			obj.fun();
		
		else
			
			System.out.println("It is returning null value");
		

	}

}
