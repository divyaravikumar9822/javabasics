package com.shapes;

public class TwoDimensionalShape extends Shapes {
	double length=5.0;
	double breadth=4.0;
	
	@Override
	public void Dimensions(int length, int breadth) {
		System.out.println("method");
		super.Dimensions(length, breadth);
	}

}
