package com.Day5;

public class Test {
	
	static int j = 30;
	
	static A a1 = new A();

	public static void main(String[] args) {
		
		Test.a1.fun();
		
/*		
		Here a1 is the static variable of Test class and also it is reference variable of A 		class object and fun() is a non-static method of A class. This statement is similar to 		System.out.println(). Here out is a static variable of System class and also it is a 		reference variable of PrintStream class object and println() is a method of PrintStream 		class. In other words, we can say PrintStream class statically defined in System class 		with out variable. The pseudo code is as follows:
		
		
    	class System {
			
			static PrintStream out = new PrintStream();
			
		}

*/
		
	}

}
