package com.day1.Second;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<>();
		
		q1.add(10); //It will be added because all wrapper class objects and String object are 		comparable.
		q1.add(0);
		
		
		Queue<A> q = new PriorityQueue<>();
		
//		q.add(null); //NullPointerException	
//		q.add(new A()); //ClassCastException because A class object is not comparable. So, it 		will not be added in PriorityQueue.

		
	}

}
