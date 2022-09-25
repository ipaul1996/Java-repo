package com.Second;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		 HashMap<String, Student> hm = new HashMap<>();
		
		 hm.put("Maharastra",new Student(10,"Ganesh",950));        
		 hm.put("Tamilnadu",new Student(12,"Surya",850));        
		 hm.put("Telangana",new Student(15,"Venkat",920));        
		 hm.put("Haryana",new Student(16,"Dinesh",910));        
		 hm.put("Kerla",new Student(18,"Srinu",880)); 
		 
		 Set<String> states = hm.keySet();
		 
		 for(String state : states) {
			 System.out.println(state);
		 }
		 
		 Collection<Student> students = hm.values();
		 
		 for(Student s : students) {
			 System.out.println(s);
		 }

		 Set<Map.Entry<String, Student>> set = hm.entrySet();
		 
		 for(Map.Entry<String, Student> se : set) {
			 System.out.println("*****************************");
			 
			 System.out.println("Name of the State is " + se.getKey());
			 Student s = se.getValue();
			 
			 System.out.println("Name of the Student is: " + s.getName());
			 System.out.println("Roll Number of the Student is: " + s.getMarks());
			 System.out.println("Marks of the Student is: " + s.getRoll());
			 
			 System.out.println("*****************************");
			 
		 }
	}

}
