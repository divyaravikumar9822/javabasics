package com.inheritance;

public class Taxi extends InheritanceCar {
	public Taxi()
	{

		System.out.println("taxi cons called");

}
	public Taxi(int speed)
	{
		
		System.out.println("one arg is called");
	}
	public static void main(String[] args) {
		Taxi t1=new Taxi(40);
	t1.brake();
	t1.getModel();
	}
}
