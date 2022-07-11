package com.yash.injectnamestobean;

import org.springframework.stereotype.Component;

@Component("nameClass")
public class NameClass {
	
	private String name1;
	private String name2;
	private String name3;
	private String name4;
	private String name5;
	
	public NameClass() {
		System.out.println("Object Created Name Class...");
	}
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public String getName4() {
		return name4;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public String getName5() {
		return name5;
	}
	public void setName5(String name5) {
		this.name5 = name5;
	}

	@Override
	public String toString() {
		return "NameClass [name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + ", name5="
				+ name5 + "]";
	}
	
	
	
}
