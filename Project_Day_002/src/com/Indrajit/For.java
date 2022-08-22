package com.Indrajit;

public class For {

	public static void main(String[] args) {

		//In general, we will utilize for loop when we aware no. of iterations in 		advance before writing loop
		
		for(int i=0;i<10;i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("Before Loop");
		
		for(int i=0; true ;i++){
			
			System.out.println("Inside Loop");
		
		}
		
		//System.out.println("After Loop"); //This line gives error as it is a 		unreachable statement

	}

}
