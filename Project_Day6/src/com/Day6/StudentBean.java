package com.Day6;

//6

public class StudentBean {
	
	private int roll;
	
	private String name;
	
	private int marks;
	
//	Zero-argument constructor
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}
	
	
//	Parameterized constructor
	
	public StudentBean(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

//	Let us define getter and setter methods for all private fields
	
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

}
