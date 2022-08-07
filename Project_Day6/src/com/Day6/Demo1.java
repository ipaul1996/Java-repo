package com.Day6;

//1

public class Demo1 {
	
	int x = 10;
	
	int y;
	
	void fun1() {
		
		System.out.println("Inside fun1 of Demo");
		
	}
	
	Demo1() {
		
		System.out.println("Inside constructor Demo1()");
		
	}
	
	Demo1(int j) {
		
		System.out.println("Inside constructor Demo1() "+ j);
		
	}
	
	Demo1(A a1) {
		
		System.out.println("Inside Demo1(A a1)");
		
	}


	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();  //1st constructor will be executed
		
		d1.fun1();
		
		d1.fun1();
		
		Demo1 d2 = new Demo1(10); //2nd constructor will be executed
		
		d2.fun1();
		
//		Demo1 d3 = new Demo1("Hello"); //CE: The constructor Demo1(String) is undefined
		
		Demo1 d4 = new Demo1(new A());
	}

}
