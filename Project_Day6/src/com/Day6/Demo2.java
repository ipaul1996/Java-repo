package com.Day6;

//2

public class Demo2 {
	
	int x = 20; //Instance variable
	
	void fun1(int x) {
		
		System.out.println(x); //Local Variable
		
		System.out.println(this.x); //20 //Instance variable
		
		System.out.println(this); //'this' refers the current object on which fun1 is called
		
	}

	public static void main(String[] args) {
		
		Demo2 d1 = new Demo2();
		
		d1.fun1(0);
		
		System.out.println(d1);
		
	}

}
