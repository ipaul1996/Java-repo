package com.Second;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
	
	public static void fun1(List<? super Integer> list) {
	
//	We can execute this method by passing List of 	Integers or any List of super class objects	
	
		System.out.println("inside fun1...");
		
		for(Object obj:list) {
			System.out.println(obj);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		List<Number> nlist= Arrays.asList(10,20,30,40);
		
		List<Object> olist= Arrays.asList(10,20,30,40);
		
		List<Double> dlist= Arrays.asList(10.55,20.44,30.33,40.33);
		
		
		
		fun1(olist);
		fun1(nlist);
		fun1(ilist);
		
		//fun1(dlist); //CE
		
	}

}
