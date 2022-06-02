package com.se.foodcart;

public class Food {
 
	private int id;
	private String item;
	private float price;
	@Override
	public String toString() {
		return "Food [id=" + id + ", item=" + item + ", price=" + price + "]";
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(int id, String item, float price) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
