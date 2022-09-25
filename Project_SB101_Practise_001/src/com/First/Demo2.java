package com.First;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(1);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(30);
		
		
//		ArrayList to Object Array Conversion
		Object[] or = al1.toArray();
		
		for(Object o : or) {		
			int i = (Integer) o;
			System.out.println(i);
		}
		
		System.out.println(al1.isEmpty()); //false
		al1.clear(); //Removes all the elements from the array list
		System.out.println(al1.isEmpty()); //true
		
		al1.add(20);
		al1.add(30);
		al1.add(50);
		
		al1.remove(0); //Remove based on index
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(0);
		al2.add(1);
		
		al1.addAll(al2); //Appends all the elements of al2 at the end of al1
		System.out.println(al1);
		
		String[] s = (String[]) al1.toArray();
		

	}

}
