package com.poly;

public class SportsCar extends Car {
	@Override
	public void brake() {
		super.brake();
		System.out.println("Sports car brake ");
	}

}
