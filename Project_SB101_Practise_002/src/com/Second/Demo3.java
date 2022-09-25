package com.Second;

import java.util.LinkedHashMap;

public class Demo3 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Student> lhm = new LinkedHashMap<>();
		
		 lhm.put("Maharastra",new Student(10,"Ganesh",950));        
		 lhm.put("Tamilnadu",new Student(12,"Surya",850));        
		 lhm.put("Telangana",new Student(15,"Venkat",920));        
		 lhm.put("Haryana",new Student(16,"Dinesh",910));        
		 lhm.put("Kerla",new Student(18,"Srinu",880)); 
		 
		 System.out.println(lhm); //Insertion order is maintained

	}

}
