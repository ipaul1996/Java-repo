package com.day12.First;

public class Main {

	public static void main(String[] args) {
		
		X x1 = new Ximpl();
		
		x1.fun1();
		x1.fun2();
		
		
//		Interface reference down casted to implement class object 
		Ximpl y = (Ximpl)x1;
		
		y.fun3();
		y.fun1();
		y.fun2();
		
		System.out.println(x1.i); //100
		System.out.println(y.i); //100		
		System.out.println(X.i); //100

	}

}
