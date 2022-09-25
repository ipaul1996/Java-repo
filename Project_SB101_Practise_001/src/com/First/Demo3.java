package com.First;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo3 {

	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<>();
		
		ls.add("hello");
		ls.add("Hi");
		ls.add("Hum");
		
		System.out.println(ls);
		
		Vector<Integer> vc = new Vector<>();
		Stack<Integer> st = new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		
//		All the followings are possible
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		List<String> list3 = new Vector<>();
		List<String> list4 = new Stack<>();

	}

}
