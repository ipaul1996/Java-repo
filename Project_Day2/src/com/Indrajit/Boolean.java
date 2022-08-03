package com.Indrajit;

public class Boolean {

	public static void main(String[] args) {
		
		boolean b1=true;
		
		boolean b2=false;
		
		System.out.println(b1&b1);//true
		
		System.out.println(b1&b2);//false
		
		System.out.println(b2&b1);//false
		
		System.out.println(b2&b2);//false
		
		System.out.println(b1|b1);//true
		
		System.out.println(b1|b2);//true
		
		System.out.println(b2|b1);//true
		
		System.out.println(b2|b2);//false
		
		System.out.println(b1^b1);//false
		
		System.out.println(b1^b2);//true
		
		System.out.println(b2^b1);//true
		
		System.out.println(b2^b2);//false
		
		int a=10; //00001010
		
		int b=2;  
		
		System.out.println(a&b);
		
		System.out.println(a|b);
		
		System.out.println(a^b);
		
		System.out.println(a<<2);
		
		// Bitwise left shift operator. Remove 2 symbols at left side and append 2 0's at right side. 		//00101000
		
		System.out.println(a>>2);
		
		//Bitwise right shift operator. Remove 2 symbols at right side and append 2 0's at left side. 		//00000010

	}

}
