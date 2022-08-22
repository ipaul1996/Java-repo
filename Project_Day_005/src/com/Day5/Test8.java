package com.Day5;

public class Test8 {
	
	A fun1(String username, String password) {
		
		if(username.equals("admin") && password.equals("123")) {
			
			System.out.println("Signup Successful");
			
			return new A();
			
		} else
			
			return null;
			
	}

	public static void main(String[] args) {
		
		Test8 t = new Test8();
		
//		Object obj = t.fun1("admin", "123");
//		Object class is the super class to all the classes
		
		A obj = t.fun1("admin", "123");
		
		if(obj != null) {
			
			obj.fun();
			
		} else
			
			System.out.println("Invalid username or password");
	}

}
