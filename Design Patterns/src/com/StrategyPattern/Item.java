package com.StrategyPattern;

public class Item {

	int id;
	double Price;

	public Item(int id, double Price) {
		this.id = id;
		this.Price = Price;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
