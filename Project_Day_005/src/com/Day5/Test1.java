package com.Day5;

public class Test1 {
	
	int y = 20;
	
	static int x = 10;

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		System.out.println(t1.y); //20
		
		System.out.println(t1.x); //10
		
		t1.y = 75;
		
		t1.x = 30;
		
		Test1 t2 = new Test1();
		
		System.out.println(t2.y);//20
		
		System.out.println(t2.x); //30
	}

}
