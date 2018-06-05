package com.inheritance;

public class InheritanceCar {
	double speed;
	String model;
	public InheritanceCar()
	{
		System.out.println("car cons called");
	}
	public InheritanceCar(double speed)
	{
		this.speed=speed;
		System.out.println("one args cons");
	}
	public InheritanceCar(double speed,String model)
	
	{
		this(speed);
		this.speed=speed;
		this.model=model;
		System.out.println("two args cons");
	}
	public void brake()
	{
		System.out.println("brake is called");
	}
	public String getModel()
	{
		return model;
	}
	public double getSpeed()
	{
		return speed;
	}

}
