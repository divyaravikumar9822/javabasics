package com.obj.subs;

public class Car {
	double speed=100.0;
	int regNum=65454;
	String model="ford";
public  Car()
{
 System.out.println("empty cons called");
}
public Car(double speed)
{
     this.speed=speed;
System.out.println("speed is implemented");
}
public void getSpeed() {
}
}
