package com.yash.injectlistofitem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"com/yash/injectlistofitem/applicationContext.xml");
			Items items=(Items)ctx.getBean("items");
			System.out.println(items.getItems());
			//Ascending Order
			List<Item> ascendingOrderList=items.getItems().stream().sorted((e1,e2)->e1.getItemName().compareTo(e2.getItemName())).distinct().collect(Collectors.toList());
			System.out.println(ascendingOrderList);
			
			//Descending Order
			List<Item> descendingOrderList=items.getItems().stream().sorted((e1,e2)->e2.getItemName().compareTo(e1.getItemName())).distinct().collect(Collectors.toList());
			System.out.println(descendingOrderList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
