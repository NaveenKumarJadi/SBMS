package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception{

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		BillCollector bc = context.getBean("billCollector", BillCollector.class);
		bc.collectPayment(4000.00);
		
	}
}



/*
Output:

-> using setter Injection:
setPayment() :: executed
Injected :: com.naveen.UpiPayment
Payment Successful through UPI


-> using Constructor Injection:
BillCollector :: Param Constructor
Injected :: com.naveen.UpiPayment
Payment Successful through UPI


-> If we use constructor in every class and using setter and constructor injection at a time: 
CreditCardPayment :: Constructor
DebitCardPayment :: Constructor
UpiPayment :: Constructor
Feb 03, 2024 10:24:20 PM org.springframework.core.LocalVariableTableParameterNameDiscoverer inspectClass
WARNING: Using deprecated '-debug' fallback for parameter name resolution. Compile the affected code with '-parameters' instead or avoid its introspection: com.naveen.BillCollector
BillCollector :: Param Constructor
Injected :: com.naveen.UpiPayment
Payment Successful through UPI

*/















