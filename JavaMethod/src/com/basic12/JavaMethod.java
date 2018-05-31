package com.basic12;

public class JavaMethod {
	public static void main(String args[])
	{
		int a=10,b=20;
		int c=  minValue(a,b);
		System.out.println("Minimum value="+c);
	}
		public static int minValue(int a,int b)
		{
			int min;
			if(a>b)
			min=b;
			else
				min=a;
			return min;
		}
}
		
		
		
		
		
	


