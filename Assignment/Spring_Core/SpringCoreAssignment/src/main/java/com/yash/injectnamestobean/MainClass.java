package com.yash.injectnamestobean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.injectnumberstobean.ConfigurationClass;

public class MainClass {

	public static void main(String[] args) {
		String[] names = new String[5];
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClassName.class);

		NameClass nameClass = (NameClass) ctx.getBean("nameClass");
		System.out.println(nameClass);
		names[0] = nameClass.getName1();
		names[1] = nameClass.getName2();
		names[2] = nameClass.getName3();
		names[3] = nameClass.getName4();
		names[4] = nameClass.getName5();
		for (String name : names) {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
						|| name.charAt(i) == 'u') {
					System.out.println(name + " contains vowel");
					break;
				} else
					continue;
			}
		}

	}

}
