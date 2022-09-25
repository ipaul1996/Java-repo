package com.First;

public class Demo{
	
	public static void main(String[] args) {
		
		System.out.println("inside main of Demo");		
	
		try {
			int i=10;
			
			int j=0;
						
			int result = i/j; 
			
			System.out.println(result);
		
		
		}catch(ArithmeticException ae) {
			
			System.out.println("inside catch block");
			
			System.out.println(ae); 				//java.lang.ArithmeticException: / by zero			
			System.out.println(ae.getMessage()); 	// by zero	
			ae.printStackTrace(); 					//java.lang.ArithmeticException: / by zero
												  	//at com.First.Demo.main(Demo.java:14)
			
			//alternate logic		
			
		}
				
		System.out.println("end of main...");
		
	}
	
}
