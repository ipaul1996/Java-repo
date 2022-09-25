package com.Second;

public class Demo extends A {
	
	public Demo() throws Exception {
		super();
		
	}

	
	public static void main(String[] args)  {
		
		System.out.println("start of main");
	
		try {
		Demo d1= new Demo();
		}catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("end of main...");
		
	}

}
