package com.First;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Alok");
		al.add("Shyam");
		al.add("Rohan");
		al.add("Ramesh");
		al.add("Ramesh");
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("Ramesh")); //Method of List Interface. It will return an 													index value where the first occurrence of 													the specified element
		
//		Traversing the List type of collection elements one by one:
//		Normal for loop
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
//		Enhanced for loop
		for(String s : al) {
			System.out.println(s);
		}
		
//		Using Iterator
//		Here reverse Iteration is not possible
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(1);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(30);
		al1.add(null);
		al1.add(0, 5); //Method of List Interface, add element at a specific index.
		al1.set(1, 2); //Method of List Interface, replace element at specific index
		
//		for(int i : al1) {
//			System.out.println(i);
//		}
//		Here we may get a NullPointerException if the ArrayList contains any null value
		
		for(Integer i : al1) {
			System.out.println(i);
		}
//		Here we will not get any NullPointerException
		
		int x = 10;
		Integer y = Integer.valueOf(x); //boxing
		int z = y.intValue(); //Unboxing
		
		int u = 100;
		Integer v = u; //auto-boxing
		int w = v;  //auto-unboxing
		
		
		System.out.println(al.contains("Ramesh")); //true
		System.out.println(al.contains("Akash"));  //false
			
	}
	
	
	
}
