package com.poly;

public class PoliceCar extends Car {
	@Override
	public void brake() {
		super.brake();
		System.out.println("Police car brake");
	}
	public static void main(String[] args) {
		Car c=new Car();
		Car c1=new SportsCar();
		Car c2=new PoliceCar();
		c.brake();
		c1.brake();
		c2.brake();
	}

}
