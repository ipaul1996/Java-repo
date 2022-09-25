package com.day1.Second;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;



public class Demo2 {

	public static void main(String[] args) {
		
		Queue<Student> q = new PriorityQueue<>(new StudentMarksComp());
		
		q.offer(new Student(5, "N1", 95));
		q.offer(new Student(6, "N2", 90));
		q.offer(new Student(7, "N3", 85));
		
		System.out.println(q); //Objects are not sorted
		
		Student s;
		while((s = q.poll()) != null) {
			System.out.println(s); //We will get the objects as sorted manner as per sorting 									 									logic described in StudentMarksComp class.
		}
		
		
		Queue<Student> q1 = new LinkedList<>();
		
		q1.offer(new Student(5, "N1", 95));
		q1.offer(new Student(6, "N2", 90));
		q1.offer(new Student(7, "N3", 85));
		
//		for(Student s1 : q1) {
//			System.out.println(s1); //Here we will get the objects in FIFO order.
//		}
		
		Iterator<Student> itr = q1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
