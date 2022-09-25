package com.First;

public class Demo1 {
	
public static void main(String[] args) {
		
		System.out.println("start of main");
		
		
		try {
			
			System.out.println("inside try 1");
			
			System.out.println(100/10);
	
			
			try {
				
				System.out.println("inside try2");
				
				A a1=null;				
				a1.funA();
								
				System.out.println("end of try2");
				
			} catch (NullPointerException npe) {
				System.out.println("inside catch of try2");
			}
						
			System.out.println("end of try 1");
			
		} catch (Exception e) {
			System.out.println("catch of try1 ");
		}
				
		System.out.println("end of main...");
		
	}

}
