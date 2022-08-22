package com.day15;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		
		for(int x : l1) {  //auto-boxing occurs here
			System.out.println(x);
		}
		
		l1.add(null);
		l1.add(null);
		l1.add(20);
		
		for(Integer x : l1) {  //no auto-boxing, here if we take int x we will NullPointerException
			System.out.println(x);
		}
	}

}
