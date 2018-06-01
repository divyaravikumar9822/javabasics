package com.basic19;

public class Rectangle {
	double side;
	double length;
	double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
if(length>0.0&&length<20.0)
	this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width<0.0&&width>20.0)
		this.width = width;
	}
	public Rectangle(double side)
	{
		this.side=side;
	}
	public Rectangle(double length,double width)
	{
		this.length=length;
this.width=width;
	}
	public double findArea()
	{
		return length*width;
	}
	public double findPerimeter()
	{
		return 2*(length*width);
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(2,4);
		Rectangle r2=new Rectangle(2,2);
	r1.findArea();
	r2.findPerimeter();
	System.out.println(r1.findArea());
	System.out.println(r1.findPerimeter());
	
	
	
	
	
	
	}

}
