package com.strategyPattern;

import java.util.Date;

public class Main {
	public static void main(String[] args) {

		ShopingCart cart = new ShopingCart();
		Item item1 = new Item(1, 1000.00);
		Item item2 = new Item(2, 192.00);
		cart.addItem(item1);
		cart.addItem(item2);
	
		PaymentStrategy stretgy  = new PayByCard("12345677", "ABCD",new Date());
		PaymentStrategy strateg2  = new PayByCash("By Cash");
		
		System.out.println("Total Payment is "+cart.Pay(stretgy));
		System.out.println("\n\nTotal Payment is ");
		cart.Pay(strateg2);
		
		
		
	}
}
