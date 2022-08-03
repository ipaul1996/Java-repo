package com.Indrajit;

public class Transfer {

	public static void main(String[] args) {
		
		//break ---> Instantly coming out of the loop
		
		for(int i=0;i<10;i++){
			
			if(i==5)
				
				break;
			
				System.out.println(i);
			
		}
		
		//continue ---> Skipping a particular iteration
		
		for(int i=0;i<10;i++){
			
			if(i==5)
				
			continue;
			
			System.out.println(i);
			
		}
		
		for(int i=0;i<10;i++)
			
		{
			
		if(i == 5)
			
		{
			
			System.out.println("Inside Loop, before continue");
			
			continue;
		
			//System.out.println("Inside Loop, After continue"); //Unreachable Statement ---> Compilation Error
		
		}
		
		}
		
			System.out.println("After loop");

	}

}
