package com.Day4;

public class HasARelationship {
	
	void fun2() {
		
		System.out.println("Inside fun2");
		
	}
	
	Demo d = new Demo();

	public static void main(String[] args) {
		
		HasARelationship h = new HasARelationship();
		
		System.out.println(h); //Address of HasARelationship object
		
		h.fun2();
		
		System.out.println(h.d); //Address of Demo object
		
		System.out.println(h.d.x);
		
		h.d.fun1();
		
		h.d = null;

	}

}
