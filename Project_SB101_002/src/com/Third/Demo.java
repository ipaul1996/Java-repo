package com.Third;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm=new HashMap<>();
		
		
		System.out.println(hm);
		
		System.out.println(hm.put(10, "del"));//null
		System.out.println(hm.put(10, "mum"));//del
		
		System.out.println(hm);// {10=mum}
		

	}

}
