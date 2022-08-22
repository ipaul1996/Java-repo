package com.day16.Second;

import java.util.TreeSet;

public class Demo {
	
public static void main(String[] args) {
	
//		StudentMarksComp smc = new StudentMarksComp();	
//		TreeSet<Student> ts = new TreeSet<>(smc);
	
		TreeSet<Student> ts = new TreeSet<>(new StudentMarksComp());
		
		ts.add(new Student(5, "IP", 480));
		ts.add(new Student(1, "AB", 580));
		ts.add(new Student(4, "SK", 680));
		ts.add(new Student(3, "NP", 980));
		ts.add(new Student(2, "TG", 780));
		
		System.out.println(ts);
		
	}

}
