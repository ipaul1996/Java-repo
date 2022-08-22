package com.Day7;

public class Demo5 {
	
	public static String reverseString(String originalString) {
		
		String result = "";
		
		char[] chr = originalString.toCharArray();
		
//		System.out.println(chr);
		
		for(int i = chr.length-1; i >= 0; i--) {
			result += chr[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(reverseString("Asmita"));
	}

}
