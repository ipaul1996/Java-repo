package com.day16.First;

import java.util.TreeSet;

public class Demo3 {
	
	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student(5, "IP", 480));
		ts.add(new Student(1, "AB", 580));
		ts.add(new Student(4, "SK", 680));
		ts.add(new Student(3, "NP", 980));
		ts.add(new Student(2, "TG", 780));
		
		System.out.println(ts);
		
	}
	
	

}
