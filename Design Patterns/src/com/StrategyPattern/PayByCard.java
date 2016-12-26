package com.StrategyPattern;

import java.util.Date;

public class PayByCard implements PaymentStrategy {

	String cardNo;
	String Name;
	Date date;

	public PayByCard(String cardNo, String name, Date date) {
		super();
		this.cardNo = cardNo;
		Name = name;
		this.date = date;
	}

	@Override
	public long pay(double ammount) {
		System.out.println("Paying by Card ");
		System.out.println("Total Discount is 10% ");
		return (long) (ammount * 0.90);

	}

}
