package com.Fourth;

import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tm = new TreeSet<>();
		
		tm.add(100);
		tm.add(25);
		tm.add(32);
		tm.add(11);
		
		System.out.println(tm); //[11, 25, 32, 100]
		
		TreeSet<Employee> tm1 = new TreeSet<>();
		
		tm1.add(new Employee(1, "n1", 10500));
		tm1.add(new Employee(2, "n2", 10600));
		tm1.add(new Employee(3, "n3", 10700));
		tm1.add(new Employee(4, "n4", 10700));
		tm1.add(new Employee(5, "n5", 10800));
		
		System.out.println(tm1.size()); //4
		

	}

}
