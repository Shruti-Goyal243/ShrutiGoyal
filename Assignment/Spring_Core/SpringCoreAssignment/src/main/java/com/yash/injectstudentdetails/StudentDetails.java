package com.yash.injectstudentdetails;

import java.util.HashMap;
import java.util.Map;

public class StudentDetails {
//	java.lang.String
	private Map<String, Double> students=new HashMap<>();

	public Map<String, Double> getStudents() {
		return students;
	}

	public void setStudents(Map<String, Double> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "StudentDetails [students=" + students + "]";
	}
	
	

}
