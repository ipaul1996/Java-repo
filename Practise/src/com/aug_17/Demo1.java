package com.aug_17;

public class Demo1 {
	
	void funA(byte f) {
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		
		d1.funA((byte) 0);
	}

}
