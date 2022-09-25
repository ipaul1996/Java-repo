package com.Fourth;

import java.util.Hashtable;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hs = new Hashtable<>();
//		HashTable does not allow any value for both key and value. HashTable is Synchronized.
		
		 hs.put(100,"Amit");     
		 hs.put(102,"Ravi");    
		 hs.put(101,"Vijay");     
		 hs.put(103,"Rahul");  
		 
		 for(Map.Entry<Integer,String> m : hs.entrySet()){      
			 System.out.println(m.getKey()+" "+m.getValue());     
		}

	}

}
