package com.del.Entity;

public class Delivery {
		
	private int id;
	private String goods;
	private int  price;

	public Delivery() {
	}

	public Delivery(int id, String goods, int price) {

		this.id = id;
		this.goods = goods;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}