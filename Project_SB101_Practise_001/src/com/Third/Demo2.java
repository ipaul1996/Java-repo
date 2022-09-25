package com.Third;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Kolkata");
		lhs.add("Mumbai");
		lhs.add("Pune");
		lhs.add("Bangalore");
		lhs.add("Kolkata"); //Duplicate
		
		System.out.println(lhs); //Insertion order is maintained
		
		for(String s : lhs) {
			System.out.println(s);
		}
		
		Iterator<String> itr = lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
