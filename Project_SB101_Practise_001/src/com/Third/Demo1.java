package com.Third;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Kolkata");
		hs.add("Mumbai");
		hs.add("Pune");
		hs.add("Bangalore");
		hs.add("Kolkata"); //Duplicate
		
		System.out.println(hs);
		
		for(String s : hs) {
			System.out.println(s);
		}
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
