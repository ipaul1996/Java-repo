package com.Five;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<>(new StudentMarksComp());
		
		ts.add(new Student(3, "N1", 99));
		ts.add(new Student(1, "N1", 95));
		ts.add(new Student(2, "N2", 100));
		ts.add(new Student(1, "N1", 95));
		
		System.out.println(ts);
		System.out.println(ts.size()); //3
		

	}

}
