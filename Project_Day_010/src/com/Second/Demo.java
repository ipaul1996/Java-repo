package com.Second;

public class Demo {
	
public Object fun1(int x) {
		
		System.out.println("inside fun1 of Demo");
		
		if(x > 10)
			return new A();
		else
			return new B();
	}
	
	public static void main(String[] args) {
				
		Demo d1 = new Demo();
		
//		A a1= d1.fun1(20); //CE
		
//		Object obj1= d1.fun1(20);		
//		A a1= (A)obj1;
		
//		We can merge above two statements as follows,
		A a1 = (A)d1.fun1(20);

		a1.funA();
		
		Object obj2 = d1.fun1(2);
		
//		A a2 = (A)obj2; //RE: java.lang.ClassCastException: class com.Second.B cannot be cast 		to class com.Second.A
		
		B b2 = (B)obj2;
		
		b2.funB();
		
		
		Object obj3 = d1.fun1(100);
		
//		We may not know obj3 instance of which class for that:
		
		if(obj3 instanceof A) {
			
			A a3= (A)obj3;
			a3.funA();
			
		} else {
			
			B b3 = (B)obj3;
			b3.funB();
			
		}
	
	}

}
