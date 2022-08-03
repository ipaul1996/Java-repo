package com.Indrajit;

public class Conditional {

	public static void main(String[] args) {
		
		/*int i=10;
		
		int j;
		
		if(i==10)
			
		{
			
		j=20;
		
		}
		
		System.out.println(j);
		
		}
		In java applications, only class level variables are having default values, local variables
		are not having default values. If we declare local variables in java applications then we
		must provide initializations for that local variables explicitly, if we access any local
		variable with out having initialization explicitly then compiler will rise an error like
		"Variable x might not have been initialized".*/
		
		int i=10;
		
		int j;
		
		if(i==10)
			
		{
			
		j=20;
		
		}
		
		else
			
		{
			
		j=30;
		
		}
		
		System.out.println(j); //20 //No Compilation Error
		
		
		int k=10;
		
		int l;
		
		if(k==10)
			
		{
			
		l=20;
		
		}
		
		else if(k==20)
			
		{
			
		l=30;
		
		}
		
		else
			
		{
			
		l=40;
		
		}
		
		System.out.println(l); //20

     }
}
