package com.entities;

public class Cosmetics {

	public Cosmetics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cosmetics(int item_id, String item_name, int item_price, String item_mfd, String item_doe) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_mfd = item_mfd;
		this.item_doe = item_doe;
	}
	private int item_id;
	private String item_name;
	private int item_price;
	private String item_mfd;
	private String item_doe;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_mfd() {
		return item_mfd;
	}
	public void setItem_mfd(String item_mfd) {
		this.item_mfd = item_mfd;
	}
	public String getItem_doe() {
		return item_doe;
	}
	public void setItem_doe(String item_doe) {
		this.item_doe = item_doe;
	}
	@Override
	public String toString() {
		return "Cosmetics [item_id=" + item_id + ", item_name=" + item_name + ", item_price=" + item_price
				+ ", item_mfd=" + item_mfd + ", item_doe=" + item_doe + "]";
	}
}
