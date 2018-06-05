package com.sales;

import java.util.Scanner;

public class SalesPerson {
	public static void main(String args[])
	{
		int salary=0,n,sale;
	String[] sales = {"$200–299", "$300–399", "$400–499" ,"$500–599", "$600–699", "$700–799" ,"$800–899", "$900–999", "$1000"};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of employee");
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	System.out.println("Enter employee's sale amount");
	sale=sc.nextInt();
	if(sale!=0)
	    	 salary=(int) (200+.09*sale);
	System.out.println(salary);
	}
if(salary<300)
   System.out.println("Number of employees in $200–299 is:"+n);
else if(salary>300 && salary<=400)
	System.out.println("Number of employees in $300–399 is:"+n);
else if(salary>400 && salary<=500)
	System.out.println("Number of employees in $400–499 is:"+n);
else if(salary>500 && salary<= 600)
	System.out.println("Number of employees in $500–599 is:"+n);
else if(salary>600 && salary<=700)
	System.out.println("Number of employees in $600–699 is:"+n);
else if(salary>700 && salary <=800)
	System.out.println("Number of employees in $700–799 is:"+n);
else if(salary>800 && salary <=900)
	System.out.println("Number of employees in $800–899 is:"+n);
else if(salary>900 && salary <=1000)
	System.out.println("Number of employees in $900–999 is:"+n);
else if(salary>1000)
	System.out.println("Number of employees in $1000 is:"+n);
}
}

