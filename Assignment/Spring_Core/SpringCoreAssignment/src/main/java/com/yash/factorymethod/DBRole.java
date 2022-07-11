package com.yash.factorymethod;

public class DBRole implements Role{

	public DBRole() {
		System.out.println("DBRole class Object create...");	
	}
	
	public void role() {
		System.out.println("Interaction with DataBase... ");
		
	}

}
