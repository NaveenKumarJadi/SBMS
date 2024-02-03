package com.naveen;

public class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic
		return "Payment Successful through Credit Card";
	}

}
