package com.naveen.beans;

public class Car {
	
	private DieselEngine dieselEngine; 
	
	public void setDieselEngine(DieselEngine dieselEngine)
	{
		System.out.println("stDieselEngine() method executed...");
		this.dieselEngine = dieselEngine;
	}
	
	public Car() {
		System.out.println("Car :: 0-param Constructor");
	}

	public Car(DieselEngine dieselEngine) {
		System.out.println("Car :: param Constructor");
		this.dieselEngine = dieselEngine;
	}
	
	public void drive()
	{
		int start = dieselEngine.start();
		if(start >= 1) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Engine Failed To Start...");
		}
	}
}
