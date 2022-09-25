package com.day1.Second;

import java.util.Comparator;

public class StudentMarksComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getMarks() > s2.getMarks() ? +1 : -1;
	
	}

}
