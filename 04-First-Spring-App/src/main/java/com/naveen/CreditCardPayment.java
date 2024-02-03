package com.naveen;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}
	
	public String pay(double amount) {
		// logic
		return "Payment Successful through Credit Card";
	}

}
