package com.basic11;

public class ContinueBreak {
	public static void main(String args[])
	{
		int n;
		for ( n = 0; n < 7; ++n)
		{
		    System.out.println ("value="+n);
		    if (n == 2) {
		        continue;
		    }
		    System.out.println ("value printed 1");
		    if (n == 4) {
		        break;
		    }
		    System.out.println ("value printed 2");
		}
		System.out.println ("end of loop");
	}

}
