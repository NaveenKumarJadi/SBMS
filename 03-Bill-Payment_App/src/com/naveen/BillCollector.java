package com.naveen;

public class BillCollector {

	private IPayment payment;
	
//	setter injection
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public BillCollector() {
//		non-parameterized/default Constructor
	}
	
//	Parameterized Constructor
	public BillCollector(IPayment payment) {
		this.payment = payment;
	}
		
	public void collectPayment(double amount)
	{
		String status = payment.pay(amount);
		
		System.out.println(status);
	}
}
