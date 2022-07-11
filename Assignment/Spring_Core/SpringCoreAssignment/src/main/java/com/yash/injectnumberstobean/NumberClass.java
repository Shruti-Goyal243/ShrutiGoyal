package com.yash.injectnumberstobean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("numberClass")
public class NumberClass{
	public NumberClass()
	{
		System.out.println("Object Created Number Class...");
	}
	
	private List<Integer> numbers=new ArrayList<>();

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	} 
	
	
}
