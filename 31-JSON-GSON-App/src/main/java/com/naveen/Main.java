package com.naveen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Order order = new Order();
		
		order.setOrderId(101);
		order.setOrderBy("Ramu");
		order.setOrderStatus("CONFIRMED");
		order.setBillAmt(1345.00);
		
		
//		Java object to json format
		Gson gson = new Gson();
		String json = gson.toJson(order);
		System.out.println(json);
		
		
//		json format to java object
		Order od = gson.fromJson(new FileReader(new File("order.json")), Order.class);
		System.out.println(od);
		
	}
}
