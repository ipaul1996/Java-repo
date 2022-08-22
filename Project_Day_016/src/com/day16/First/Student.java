package com.day16.First;

public class Student implements Comparable<Student>{
	
	private int roll;
	private String name;
	private int marks;
	
	public Student() {
		
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

//	Sorting based on marks
//	@Override
//	public int compareTo(Object o) {
//		
//		Student s2 = (Student)o;
//		
//		if(this.getMarks() > s2.getMarks()) 
//			return +1;
//		else if(this.getMarks() < s2.getMarks())
//			return -1;
//		else
//			return 0;
//		
//	}
	
	
//	Sorting based on marks
	//Using generics
//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.getMarks() > s.getMarks()) 
//			return +1;
//		else if(this.getMarks() < s.getMarks())
//			return -1;
//		else
//			return 0;
//		
//	}
	
//	Sorting based on names
	@Override
	public int compareTo(Student s) {
		return this.getName().compareTo(s.getName());		
//		return s.getName().compareTo(this.getName()); //For reverse order
	}
	
	
//	Sorting based on marks and if same sort based on name
	//Using generics
//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.getMarks() > s.getMarks()) 
//			return +1;
//		else if(this.getMarks() < s.getMarks())
//			return -1;
//		else
//			return this.getName().compareTo(s.getName());
//		
//	}
	
//	@Override
//	public int compareTo(Student s) {
//		
//		if(this.getMarks() > s.getMarks()) 
//			return +1;
//		else 
//			return -1;       //Here objects with same marks will not be considered as duplicate
//		
	
//		return this.getMarks() > s.getMarks() ? +1 : -1;
	
//	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	
	

}

