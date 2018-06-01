package com.basic18;

public class Multiples {
	public static void main(String[] args) {
Multiples m=new Multiples();
		m.isMultiple(10,100);
		System.out.println(m.isMultiple(10,100));
	}
	public boolean isMultiple(int a,int b)
	{ 
		if(b%a==0)
			return true;
		else
			return false;
	}

}
