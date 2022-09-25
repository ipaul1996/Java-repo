package com.Third;

import java.util.HashSet;

public class Demo3 {

	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student(1, "N1", 10));
		hs.add(new Student(2, "N2", 12));
		hs.add(new Student(3, "N3", 12));
		
		System.out.println(hs.size()); //2

	}

}
