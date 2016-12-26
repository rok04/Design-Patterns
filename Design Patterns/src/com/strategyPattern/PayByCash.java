package com.strategyPattern;

public class PayByCash implements PaymentStrategy{
	
    String Name ;
    
	public PayByCash(String name) {
		super();
		Name = name;
	}

	@Override
	public long pay(double ammount) {
	System.out.println("Paying by Cash " );
	System.out.println("No Discount");
	return (long) ammount;
		
	}

}
