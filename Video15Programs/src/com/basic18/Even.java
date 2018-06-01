package com.basic18;

public class Even {
	public boolean isEven(int a)
	{
		return a%2==0 ? true:false;
	}
	public static void main(String[] args) {
		Even e = new Even();
		e.isEven(10);
		System.out.println(e.isEven(10));
	}

}
