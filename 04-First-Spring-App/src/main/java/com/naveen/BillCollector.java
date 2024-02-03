package com.naveen;

public class BillCollector {

	private IPayment payment;
	
//	setter injection
	public void setPayment(IPayment payment) {
		System.out.println("setPayment() :: executed");
		this.payment = payment;
	}
	
	public BillCollector() {
//		non-parameterized/default Constructor
	}
	
//	Parameterized Constructor
	public BillCollector(IPayment payment) {
		System.out.println("BillCollector :: Param Constructor");
		this.payment = payment;
	}
		
	public void collectPayment(double amount)
	{
		System.out.println("Injected :: " + payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}
}
