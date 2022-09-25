package com.day1.Third;

public class Demo1 {
	
	public static <T> void fun1(T[] tr) {
			
			for(T t1:tr) {
				System.out.println(t1);
			}
	}
	
	
	
	public static void main(String[] args) {
		
		//int[] nums= {10,20,30,40};
		//Primitives are not supported		
		Integer[] nums= {10,20,30,40};		
		String[] str= {"a","b","c"};
		
		fun1(str);		
		fun1(nums);
				
	}

}
