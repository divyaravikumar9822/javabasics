package com.basic18;

public class PerfectNumber {
	public void perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		
		System.out.println(sum);
			if(sum==num)
				System.out.println("num is perfect number");
				else
					System.out.println("num is not perfect number");
	}

	public static void main(String[] args) {
		PerfectNumber p=new PerfectNumber();
		p.perfect(28);
	}

}
