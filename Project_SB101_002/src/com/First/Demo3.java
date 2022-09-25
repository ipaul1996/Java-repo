package com.First;
import java.util.Arrays;
import java.util.List;

public class Demo3 {
		
	public static void fun1(List<? extends Number> list) {
		
		System.out.println("inside fun1...");
		
		for(Number i1:list) {
		
			System.out.println(i1);
		}
			
	}
	
	public static void main(String[] args) {

		List<Integer> ilist= Arrays.asList(10,20,30,40);
		
		fun1(ilist);
		
	}


}



