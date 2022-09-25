package com.First;

public class Demo1 {

public static <T> void fun1(T t) {
		
		System.out.println(t);
	}
	
	
	public static <K,V> void fun2(K k, V v) {
		
		System.out.println(k+"========"+v);
		
		
	}
	
	public static <T,V> V fun3(T t, V v) {
		
		System.out.println(t+"========"+v);
		
		return v;
	}
	
	
	
	public static void main(String[] args) {
			
		fun2(10, 20);		
		fun2("Hello",20);
				
	}


}
