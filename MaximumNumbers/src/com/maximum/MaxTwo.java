package com.maximum;

import java.util.Scanner;


public class MaxTwo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		MaxTwo m=new MaxTwo();
		m.printTwoMaxNumbers(arr); 
		}
	
	public void printTwoMaxNumbers(int[] arr) {
		int firstMax=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i:arr)
		{
		if(firstMax<i)
		{
			secMax=firstMax;
			firstMax=i;
		}
		else if(secMax<i)
		{
			secMax=i;
		}
		}
		System.out.println("firstMax"+firstMax);
		System.out.println("secMax"+secMax);
	

}
}

