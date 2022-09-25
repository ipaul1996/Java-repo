package com.Third;

import java.util.HashMap;

public class Demo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		
		
		hm.put(10, "del");
		hm.put(20, "mum");
		hm.put(30, "che");
		hm.put(40, "del");
		hm.put(null, "pun");
		hm.put(null, "chandigarh");
		
		System.out.println(hm);

	}

}
