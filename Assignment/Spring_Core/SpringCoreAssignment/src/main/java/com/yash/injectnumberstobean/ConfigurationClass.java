package com.yash.injectnumberstobean;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages  = "com.yash.injectnumberstobean")
public class ConfigurationClass {
	
	@Bean
	public NumberClass numberClass()
	{
		NumberClass nc=new NumberClass();
		nc.setNumbers(Arrays.asList(12,38,43,224,64,42,67,54,90));
		return nc;
	}

}
