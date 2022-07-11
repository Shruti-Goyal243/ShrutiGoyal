package com.yash.injectstudentdetails;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/yash/injectstudentdetails/applicationContext.xml");
		StudentDetails studentDetails=(StudentDetails)ctx.getBean("studentDetails");
		System.out.println(studentDetails.getStudents());
		Map<String,Double> students= studentDetails.getStudents();
		students.entrySet()
		  .stream()
		  .sorted(Map.Entry.<String, Double>comparingByKey())
		  .forEach(System.out::println);
	}
}
