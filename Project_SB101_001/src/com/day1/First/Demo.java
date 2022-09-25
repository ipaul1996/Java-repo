package com.day1.First;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		
		Set<String> set = new HashSet<> (list);
		
//		for(String s : list) {			
//			System.out.println(s);			
//		}
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		Index support is not available to hashset so we can't use for loop. We can use enhanced 		for loop.
//		for(String s : set) {			
//			System.out.println(s);			
//		}
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
//			if(s.equals("c")) itr.remove();
			System.out.println(s);
		}
		
		ListIterator<String> ltr = list.listIterator();
		
		while(ltr.hasNext()) {
			String s = ltr.next();
			System.out.println(s);
		}

	}

}
