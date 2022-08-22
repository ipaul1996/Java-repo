package com.Day5;

//main method overloading

public class Main {
	
	public static void main(int i) {
		
		System.out.println("Inside manin(int i)");
		
	}

	public static void main(String[] args) {
		
		main(10);
		
		Main.main(30);
		
		new Main().main(50);
		
		Test1.main(null);//We can call main method of Test1 class from main method of Main 		class
		
	}

}
