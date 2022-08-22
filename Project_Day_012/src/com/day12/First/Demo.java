package com.day12.First;

public class Demo {
	
	public void funDemo(X x1) {
		
		x1.fun1();
		x1.fun2();
		
	}
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		Ximpl obj = new Ximpl();
		d1.funDemo(obj);
		
//		d1.funDemo(new Ximpl());
		
//		d1.funDemo(null);
		
	}

}
