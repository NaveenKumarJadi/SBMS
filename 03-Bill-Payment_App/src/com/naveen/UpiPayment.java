package com.naveen;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {
		//logic
		return "Payment Successful through UPI";
	}

}
