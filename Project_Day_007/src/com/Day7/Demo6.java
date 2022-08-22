package com.Day7;

public class Demo6 {
	
	public static String reverseString(String originalString) {
		
		StringBuilder sb = new StringBuilder("");
		
		char[] chr = originalString.toCharArray();
		
		
		for(int i = chr.length-1; i >= 0; i--) {
			sb.append(chr[i]);
		}
		
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		
		System.out.println(reverseString("Asmita"));
		
	}

}
