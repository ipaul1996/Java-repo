package com.First;

public class Demo2 {
	
	public static void main(String[] args) {
		
		System.out.println("inside main of Demo");
		
		try {
		String s1= "100";
		String s2= "50";
		
		A a1=null;
		
		int num1= Integer.parseInt(s1);
		int num2= Integer.parseInt(s2);
		
		int z = num1/num2;
		
		if(z > 5)
			a1=new A();
		
		
		a1.funA();
		
		
		}
		catch (Exception e) {
			System.out.println("inside exception");
		}
					
		System.out.println("end of main...");
		
	}

}
