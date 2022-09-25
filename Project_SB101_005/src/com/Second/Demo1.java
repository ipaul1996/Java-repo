package com.Second;

public class Demo1 {
	
	public void fun1(int num1, int num2)throws InvalidAgeException {
		
		try {
		int result = num1/num2;
		
		System.out.println("The Result is :"+result);
		}catch (ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			
			InvalidAgeException ie= new InvalidAgeException("Num2 should not be 0");
			
			throw ie;
		}
		
		
	}	

	public static void main(String[] args)  {
		
		System.out.println("start of main");
	
		
		Demo1 d1 = new Demo1();
		
		try {
			d1.fun1(100, 0);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
				
		System.out.println("end of main...");
		
	}

}
