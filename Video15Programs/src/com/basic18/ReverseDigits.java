package com.basic18;

public class ReverseDigits {
	public int revDigit(int n)
	{
		int result=0;
		int rem;
		while(n>0)

	{
			rem=n%10;
			n=n/10;
			result=result*10+rem;
			}
		return result;
	}
	public static void main(String[] args) {
		ReverseDigits r =new ReverseDigits();
		System.out.println(r.revDigit(4356));
	}

}
