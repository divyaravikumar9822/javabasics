package com.basic12;

public class AverageMethod {
	public static void main(String args[])
	{
	int a=98,b=79,c=76;
	int res= avgValue(a,b,c);
	System.out.println("Average="+res);

}
public static int avgValue(int a,int b,int c)
{
	int res = (a+b+c)/3;
	return res;
}
}