package com.Third;

import java.util.Objects;

public class Student {
	
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

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks);
	}

	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		if(this.getMarks() == s1.getMarks()) 
			return true;
		else 
			return false;
	}
	
	
	
	
	

}

