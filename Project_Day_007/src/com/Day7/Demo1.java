package com.Day7;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a roll: ");
		int roll = sc.nextInt();
		
		System.out.println("Enter a name: ");
		String name = sc.next();
		
		System.out.println("Enter a marks: ");
		int marks = sc.nextInt();
		
		System.out.println("The Roll is: " + roll);
		System.out.println("The Name is: " + name);
		System.out.println("The Marks is: " + marks);

	}

}
