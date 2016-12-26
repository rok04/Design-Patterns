package com.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {

	List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ShopingCart() {
		items = new ArrayList<Item>();

	}

	private double Total() {
		double total = 0;
		for (Item l : items) {
			total += l.Price;

		}
		return total;
	}

	public long Pay(PaymentStrategy strategy) {
		System.out.println("Total Expense is \n " + Total());
		long totalPayment = strategy.pay(Total());
		return totalPayment;

	}

}
