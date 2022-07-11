package com.yash.averageusingpostconstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	
	public static void main(String[] args) {
		try {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yash/averageusingpostconstruct/applicationContext.xml");
			AverageNumber averageNumber=(AverageNumber)ctx.getBean("averageNumber");
			System.out.println(averageNumber.averageOfNumber());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
