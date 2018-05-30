package com.basic5;

public class OtherOperator {
	public static void main(String args[])
	{
	int x=40;
	int y=20;
	//Relational operator
	 boolean result = x==y;
	System.out.println("x==y"+result);
	result=x>y;
	System.out.println("x>y"+result);
	result=x<y;
	System.out.println("x<y"+result);
    result= x!=y;
    System.out.println("x!=y"+result);
    result=x<=y;
    System.out.println("x<=y"+result);
    result=x>=y;
    System.out.println("x>=y"+result);
    //conditional operator
    if ((x > 8) && (y > 8)) {
    System.out.println("Both x and y are greater than 8");
    }
    if ((x > 10) || (y > 10)) {
    System.out.println("Either x or y is greater than 10");
    }
    
}

}