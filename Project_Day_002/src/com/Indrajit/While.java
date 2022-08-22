package com.Indrajit;

public class While {

	public static void main(String[] args) {
		
	//In java applications, when we are not aware the no of iterations in advance before writing
	//loop there we should utilize 'while' loop.
		
		int i=0;
		
		while(i<10)
			
		{
			
		System.out.println(i);
		
		i=i+1;
		
		}
		
		System.out.println("Before Loop");
		
		while(true)
			
		{
			
				System.out.println("Inside Loop");
				
		}
		
		//System.out.println("After Loop"); //Compilation Error ---> 		Unreachable statement

	}

}
