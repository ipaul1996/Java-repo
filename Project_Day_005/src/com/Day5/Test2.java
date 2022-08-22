package com.Day5;

public class Test2 {
	
	int x = 100;
	
	static Test2 t = new Test2();

	public static void main(String[] args) {
		
		Test2 t = new Test2();
		
		System.out.println(t.x); //100
		
		System.out.println(t.t.x); //100
		
		System.out.println(Test2.t.x); //100

	}

}
