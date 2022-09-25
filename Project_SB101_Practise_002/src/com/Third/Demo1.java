package com.Third;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
	
	public static void main(String[] args) {
		
		TreeMap<Student, String> tm = new TreeMap<>(new StudentMarksComp());
		
		 tm.put(new Student(10,"Ganesh",950),"Maharastra");         
		 tm.put(new Student(12,"Surya",850),"Tamilnadu");         
		 tm.put(new Student(15,"Venkat",920),"Telangana");         
		 tm.put(new Student(16,"Dinesh",910),"Haryana");        
		 tm.put(new Student(18,"Srinu",880),"Kerla"); 
		 
		 System.out.println(tm);
		 
		 
		 Set<Map.Entry<Student, String>> set = tm.entrySet();
		 
		 for(Map.Entry<Student, String> s : set) {
			 
			 System.out.println("Name of the state is : " + s.getValue());		 
			 Student s1 = s.getKey();
			 
			 System.out.println("Name of the student is : " + s1.getName());
			 System.out.println("Roll number of the student is : " + s1.getRoll());
			 System.out.println("Marks of the student is : " + s1.getMarks());
			 
			 System.out.println("***************************************");
			 
		 }
	}

}
