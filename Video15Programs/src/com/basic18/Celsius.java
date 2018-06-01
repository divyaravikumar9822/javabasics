package com.basic18;

public class Celsius {
	 double fahrenheit;
	 double celsius;
	public void celsius(double degree)
	{
		degree=fahrenheit;
		celsius = 5.0 / 9.0 * ( fahrenheit - 32 ); 
		System.out.println("celsius="+celsius);
	
	}
	public void fahrenheit(double degree)
	{
		degree=celsius;
		fahrenheit = 5.0 / 9.0 * ( fahrenheit - 32 ); 
		System.out.println("fahrenheit="+fahrenheit);
	
	}
	public static void main(String[] args) {
		Celsius c1=new Celsius();
		c1.celsius(87);
	   c1.fahrenheit(65);
	     
		
	}
	

}
