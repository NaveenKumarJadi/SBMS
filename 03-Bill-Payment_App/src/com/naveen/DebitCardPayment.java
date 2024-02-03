package com.naveen;

public class DebitCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic
		return "Payment Successful through Debit Card";
	}

}
