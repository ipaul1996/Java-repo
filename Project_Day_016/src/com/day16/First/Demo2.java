package com.day16.First;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Demo2 {
	
	public static List<String> removeDuplicateFromList(List<String> cities) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(cities);
		
		return new ArrayList<> (lhs);
	}

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("kolkata");
		cities.add("mumbai");
		cities.add("delhi");
		cities.add("kolkata");
		
		System.out.println(cities);
		
		List<String> result = removeDuplicateFromList(cities);
		
		System.out.println(result);
	}

}
