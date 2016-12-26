package com.StrategyPattern;

public class PayByOnline implements PaymentStrategy {

	String Name;
	String BankName;
	String CardNo;
	String CardType;

	public PayByOnline(String name, String bankName, String cardNo, String cardType) {
		super();
		Name = name;
		BankName = bankName;
		CardNo = cardNo;
		CardType = cardType;
	}

	@Override
	public long pay(double ammount) {
		System.out.println("Paying by Online !!");
		System.out.println("Total discount is 15% ");
		return (long) ((long) ammount * (.85));

	}

}
