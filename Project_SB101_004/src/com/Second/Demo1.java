package com.Second;

public class Demo1 {
	
	public int getPension(int age, int salary) throws InvalidAgeException{
		
		int pension = 0;
		
		if(age > 40 && age < 100)
			pension = (age * salary)/100;
		else {			
			InvalidAgeException ie = new InvalidAgeException("Invalid Age : " + age);
			throw ie;			
		//this exception is generated based on logical error occurs due to the business logic 		     		violation	
			
		}
		
		return pension;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("inside main of Demo");
				
		Demo1 d1= new Demo1();
		
		try {
			
		int result= d1.getPension(10, 50000);		
		System.out.println(result);
		
		}catch (InvalidAgeException ie) {
			
			System.out.println(ie.getMessage());
			System.out.println(ie);
			ie.printStackTrace();
			
		}
					
		System.out.println("end of main...");
		
	}

}

