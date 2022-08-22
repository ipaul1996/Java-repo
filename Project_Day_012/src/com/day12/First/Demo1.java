package com.day12.First;

public class Demo1 {
	
	public X funS() {
		
		System.out.println("Inside funS of Demo1");
		return new Ximpl();
		
	}

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		X x = d1.funS();
		
		x.fun1();
		x.fun2();
		
		Object obj = d1.funS();
		
//		First level down casting
		X x1 = (X)obj;
		
		x1.fun1();
		x1.fun2();
		
//		Second level down casting
		Ximpl y = (Ximpl)x1;
		
		y.fun1();
		y.fun2();
		y.fun3();
		
//		Directly down casting obj to Ximpl object
		Ximpl z = (Ximpl)obj;
		
		z.fun1();
		z.fun2();
		z.fun3();
		

	}

}
