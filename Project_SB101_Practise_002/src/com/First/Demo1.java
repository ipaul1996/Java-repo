package com.First;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		int[] arr1 = {55, 101, 125, 210, 25};
		int[] arr2 = {55, 101, 125, 210, 25};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);		
		System.out.println(Arrays.toString(arr1)); //[25, 55, 101, 125, 210]	
		System.out.println(Arrays.binarySearch(arr1, 125)); //3		
		System.out.println(Arrays.equals(arr1, arr2)); //true
		
		
//		Creating a List
		List<String> list = Arrays.asList("Delhi", "Mumbai", "Kolkata", "Chennai");
		System.out.println(list);
		
//		Arrays class is an utility class and belongs to java.util package

	}

}
