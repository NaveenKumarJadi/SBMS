package com.naveen;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}
	
	public String pay(double amount) {
		// logic
		return "Payment Successful through Debit Card";
	}

}
