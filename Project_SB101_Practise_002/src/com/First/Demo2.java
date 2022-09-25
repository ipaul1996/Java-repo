package com.First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2 {
	
	public static void sayHello() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 20, 20);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list);
		Collections.reverse(list);	//It reverses the list	
		System.out.println(list);
				
		Collections.replaceAll(list, 10, 5);
		System.out.println(list);
		
		List<Student> list1 = Arrays.asList(
				new Student(1, "N1", 85),
				new Student(2, "N2", 75),
				new Student(3, "N3", 66)
				);
		
		Collections.sort(list1, new StudentComparator());
		System.out.println(list1);
		
//		Collections.synchronizedList(list1); It will synchronize the list
	
		System.out.println(Collections.frequency(list, 20)); //No.of times 20 occurs in the List
		
		
		List<Integer> list2 = Arrays.asList(10, 20, 30);
		List<Integer> list3 = Arrays.asList(2, 5, 7);
		
		
		Collections.copy(list3, list2); //Copying from list2 to list3. Both should have same size.
		System.out.println(list3); //[10, 20, 30]
		
		
		List<Integer> list4 = new ArrayList<>();
		Collections.addAll(list4, 40,50,60);
		System.out.println(list4);
		
	}

}
