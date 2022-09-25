package com.Second;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(2, "Two");
		
		System.out.println(hm.get(1)); //one
		System.out.println(hm.get(2)); //Two
		
		hm.remove(1);
		System.out.println(hm); //{2=Two}
		
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		
		System.out.println(hm.size()); //4
		
		System.out.println(hm.containsKey(3)); //true
		System.out.println(hm.containsKey(7)); //false
		
		System.out.println(hm.containsValue("three")); //true
		System.out.println(hm.containsValue("FIVE"));  //false
		
		Set<Integer> s = hm.keySet();
		System.out.println(s); //[2, 3, 4, 5]
		
		for(Integer i : s) {
			System.out.println(i);
		}
		
		Collection<String> c = hm.values();
		System.out.println(c); //[Two, three, four, five]
		
		for(String c1 : c) {
			System.out.println(c1);
		}
		
		Set<Map.Entry<Integer, String>> es = hm.entrySet();
		System.out.println(es); //[2=Two, 3=three, 4=four, 5=five]
		
		for(Map.Entry<Integer, String> e : es) {
			System.out.println(e.getKey()+ "=" + e.getValue());
		}
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.putAll(hm); //All the entries of hm are being copied to hm1
		System.out.println(hm1); //{2=Two, 3=three, 4=four, 5=five}
		
		hm.clear();
		System.out.println(hm); //{}
		
		

	}

}
