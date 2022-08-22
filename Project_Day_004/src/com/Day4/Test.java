package com.Day4;

public class Test {
	
//	 instance Variable
	 int i;
			
			
//	 static or class variable
	 static int j = 200;
	 
//	 non-static or instance method
	 void fun1() {
		 
		 System.out.println("Inside fun1 of Test");
		 
	 }
	 
	 static void fun2() {
		 
		 System.out.println("Inside fun2 of Test");
		 
	 }

	public static void main(String[] args) {

//		local variable of main method
		int x = 20; //primitive variable. Here x is holding 20 value.
		
//		System.out.println(i);
		
		System.out.println(j);
		
//		fun1();
		
		fun2();
		
		System.out.println("Inside Main");
		
//		Creating an object/instance to the class Test or Initiating an object to the class Test
		Test d1 = new Test(); //It is a reference variable of Test type. Here d1 is pointing to Demo 		class object.
		
		System.out.println(d1); 
		
		System.out.println(d1.i); //0
		
		d1.i = 100; //Value changed in the heap area of ram for d1 object, it does not change in the 		hard disk
		
		System.out.println(d1); //100
		
		d1.fun1();
		
		Test d2 = new Test();
		
		System.out.println(d2.i); //0
		
		d2.i = 25;
		
		System.out.println(d2.i); //25
		
		System.out.println(d1 == d2); //false
		
		Test d3 = d2;
		
		System.out.println(d3.i); //25
		
		//Here the reference variables d2 and d3 pointing to same object. So any changes in the object 		will be reflected in both d2 and d3.
		
		 d3 = null;
		 
//		 System.out.println(d3.i); //NullPointerException
		 
		 Test d4 = new Test();
		 
		 d4.i = 1000;
		 
		 System.out.println(d4.i); //1000
		 
		 d4 = new Test(); //Fresh object assignment to d4 and link to previous object has been broken.
		 
		 System.out.println(d4.i); //0 ---> Default value
		 
		 
		 
		 Test d5 = new Test();
		 
		 Test d6 = d5;
		 
		 //Here d5 and d6 both are pointing to same object i.e., same memory location.
		 
		 d5 = null;
		 
		 //d5 is pointing to null but still d6 is pointing to the object.
		 
		 
//		 Primitive variable v/s Reference Variable
		 
		 int a = 10;
		 
		 int b = a; //Here value of a is copied to b
		 
		 System.out.println(a); //10
		 
		 System.out.println(b); //10
		 
		 a = 100;
		 
		 System.out.println(a); //100
		 
		 System.out.println(b); //10
		 
		 
		 
		 Test d7 = new Test();
		 
		 Test d8 = d7;
		 
		 d7.i = 100;
		 
		 System.out.println(d7); //100
		 
		 System.out.println(d8); //100
		 
		 
		 Test d9 = new Test();
		 
		 d9.fun1();
		 
//		 Another approach for calling a method is:
		 new Test().fun1();
		 
//		Here the object used for calling the method has no reference variable, so after being used 		for calling the method it gets destroyed. 
		 
//		If we want to call any non-static method only once then this approach is much efficient 		whereas if we want call multiple methods from an object i.e., we want to use the object 		multiple time then first approach is better. 
		 
		
		
	}

}
