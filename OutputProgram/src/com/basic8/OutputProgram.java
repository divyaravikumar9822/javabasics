package com.basic8;

public class OutputProgram {
	public static void main(String args[])
	{
		int x=1;
		int y;
		int total = 0;

		 while ( x <= 10 )
		 {
		 y = x * x;
		 System.out.println( y );
		 total += y;
		 ++x;
		 }
		 System.out.printf( "Total is %d\n", total );
		 } 
		 

	}


