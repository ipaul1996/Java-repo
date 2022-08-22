package com.day16.First;

import java.util.LinkedHashSet;

public class Demo1 {
	
	public String removeDuplicateFromString(String original) {
		
		char[] chr = original.toCharArray();
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		
		for(char ch : chr) {		
			lhs.add(ch);			
		}
		
		StringBuilder s = new StringBuilder("");
		
		for(char ch1 : lhs) {
			s.append(ch1);
		}
		
		return s.toString();
		
	}

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
		System.out.println(d1.removeDuplicateFromString("AAkAsh"));
	}

}
