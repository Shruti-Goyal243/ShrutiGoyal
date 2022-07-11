package com.yash.mergetwoarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"com/yash/mergetwoarray/applicationContext.xml");
			Array1 array1 = (Array1) ctx.getBean("array1");
			Array2 array2 = (Array2) ctx.getBean("array2");

			int lengthOfMergedArray = array1.getArray1().length + array2.getArray2().length;
			Integer[] newMergerArray = new Integer[lengthOfMergedArray];

			int i = 0;
			// merge first array
			for (int a : array1.getArray1()) {
				newMergerArray[i] = a;
				i++;
			}
			// merge second array
			for (int a : array2.getArray2()) {
				newMergerArray[i] = a;
				i++;
			}

			List<Integer> listArray = Arrays.asList(newMergerArray);
			int maximumNumber = listArray.stream().max(Integer::compare).get();
			System.out.println(maximumNumber);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
