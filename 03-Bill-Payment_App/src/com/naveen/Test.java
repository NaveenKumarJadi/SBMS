package com.naveen;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Setter Injection :: ");
    	BillCollector bc = new BillCollector();
//		Injecting CreditCardPayment obj into BillCollector (Setter Injection)
		bc.setPayment(new CreditCardPayment());
		bc.collectPayment(1400.00);
		

		System.out.println("Constructor Injection :: ");
//		Injecting DebitCardPayment obj into BillCollector (Constructor Injection)
		BillCollector bc1 = new BillCollector(new DebitCardPayment());
		bc1.collectPayment(1500.00);
		

		System.out.println("Field Injection :: (varibale is private) ");
//		Field Injection
		Class<?> clz = Class.forName("com.naveen.BillCollector");
		
		Field field = clz.getDeclaredField("payment");
		field.setAccessible(true);
		
		Object obj = clz.newInstance();
		field.set(obj, new DebitCardPayment()); // Injecting value to variable
		
		BillCollector bc2 = (BillCollector) obj;
		bc2.collectPayment(2000.00);
	
		
		System.out.println("OR");
//		dependent class object
		CreditCardPayment ccd = new CreditCardPayment();
		
//		target class Object
		BillCollector collector = new BillCollector();
		
//		injecting dependent cls obj into target cls obj
		collector.setPayment(ccd);
		collector.collectPayment(3000.00);
		
	}
}





/*
Output:

Setter Injection :: 
Payment Successful through Credit Card
Constructor Injection :: 
Payment Successful through Debit Card
Field Injection :: (varibale is private) 
Payment Successful through Debit Card
OR
Payment Successful through Credit Card

*/













