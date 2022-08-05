package com.Day5;

public class Test3 {
	
//	Method Declaration
	public void fun1(int x) {
		
		System.out.println("Inside fun1 "+x);
		
	}
	
	public void fun2(A a3) {
		
		System.out.println("Inside fun2 "+a3);
		
		a3.fun(); //Hello World  //Here fun2 is calling fun() on the object a3
//		If a3 points to null here we will get a nullPointerException
		
	}

	public static void main(String[] args) {
		
		Test3 t = new Test3();
		
//		Method Calling
		t.fun1(2);
//		Here we are calling the fun1() method from main method on Test3 object.
		
//		t.fun2(null);
		
		A obj = new A();
		
		System.out.println(obj); //com.Day5.A@156643d4
		
		t.fun2(obj); //Inside fun2 com.Day5.A@156643d4
		
		t.fun2(new A());
/*		
        This way of passing argument is much more efficient because when we call the method, we 		pass the argument (new a()), at that time the object to A class is created and assigned 		to the local variable of fun2 method,a3. After the completion of execution of fun2() 		method, local variable a3 get destroyed and A class object becomes unreferenced, and as 		we know unreferenced object is the responsibility of garbage collector, so the A class 		object also get destroyed.Henece we save some memory space in the RAM. On the other 		hand, while we pass obj as argument, after destruction of a3 variable the A class 		object does not become unreferenced due the presence of reference variable obj. 	
		As a result A class object does not get destroyed and occupy memory space in the RAM. 		This object will only get destroyed when execution of main method is completed.
 */
		
		
		

	}

}
