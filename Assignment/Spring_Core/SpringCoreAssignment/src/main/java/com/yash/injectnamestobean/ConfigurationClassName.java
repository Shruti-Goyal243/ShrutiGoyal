package com.yash.injectnamestobean;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yash.injectnamestobean")
public class ConfigurationClassName {
	
	@Bean
	public NameClass nameClass()
	{
		NameClass nc=new NameClass();
		System.out.println("Bean class");
		nc.setName1("Akshay");
		nc.setName2("Aanand");
		nc.setName3("Shreya");
		nc.setName4("Shikhar");
		nc.setName5("Rishi");
		return nc;
	}

}
