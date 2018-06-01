package com.basic22;

public class ReverseArray {
	public static void main(String args[]) {
		int arr[]= {3,4,5,2,33,24,2};
			for (int i= 0; i < arr.length; i++) {
		         System.out.print(arr[i] + " ");
		      } 
		      for (int i = 0; i < arr.length / 2; i++) {
		         int temp = arr[i];
		         arr[i] = arr[arr.length - 1 - i];
		         arr[arr.length - 1 - i] = temp;
		      } 
		      System.out.println("Array after reverse:");
		      for (int i = 0; i < arr.length; i++) {
		         System.out.print(arr[i] + " ");
		      } 
		
		
				
	
		
		
	}

}
