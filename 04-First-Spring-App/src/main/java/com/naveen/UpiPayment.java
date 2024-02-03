package com.naveen;

public class UpiPayment implements IPayment {

	public UpiPayment() {
		System.out.println("UpiPayment :: Constructor");
	}
	
	public String pay(double amount) {
		//logic
		return "Payment Successful through UPI";
	}

}
