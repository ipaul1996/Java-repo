package com.Indrajit;

public class AndOr {

	public static void main(String[] args) {
		
		int a=10;
		
		int b=10;
		
		if( (a++ == 10) | (b++ == 10) )
			
		{
			
		System.out.println(a+" "+b);//OUTPUT: 11 11
		
		}
		
		int c=10;
		
		int d=10;
		
		if( (c++ == 10) || (d++ == 10) )
			
		{
			
		System.out.println(c+" "+d);//OUTPUT: 11 10
		
		
		int x=10;
		
		int y=10;
		
		if( (x++ != 10) & (y++ != 10) )
			
		{ }
		
		System.out.println(x+" "+y);//OUTPUT: 11 11
		
		int u=10;
		
		int v=10;
		
		if( (u++ != 10) && (v++ != 10) )
			
		{ }
		
		System.out.println(u+" "+v);//OUTPUT: 11 10
		
		}


	}

}
