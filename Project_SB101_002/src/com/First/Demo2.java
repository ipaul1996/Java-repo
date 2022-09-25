package com.First;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	
public static void fun1(List<?> list) {
		
		System.out.println("inside fun1...");
		
		//we can access the values from the unbounded type by using Object class
		for(Object i1:list) {
		
			System.out.println(i1);
		}
		
		
	}
	
	public static void main(String[] args) {
		
	
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		List<String> slist= Arrays.asList("a","b","c","d");
		
		
		fun1(ilist);
		fun1(slist);
		
	}


}
