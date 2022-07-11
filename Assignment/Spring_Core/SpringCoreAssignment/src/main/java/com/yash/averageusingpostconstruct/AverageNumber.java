package com.yash.averageusingpostconstruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

public class AverageNumber {

	List<Integer> listNumber = new ArrayList<Integer>();

	@PostConstruct
	public void numbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Integers : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			listNumber.add(sc.nextInt());
		}
		sc.close();
	}
	
	public double averageOfNumber()
	{
		return listNumber.stream().collect(Collectors.averagingDouble(n->n));
	}
	
	

}
