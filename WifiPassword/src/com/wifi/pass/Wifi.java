package com.wifi.pass;

import java.util.Scanner;

public class Wifi {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roomNo=sc.nextInt();
        String lastName=sc.next();
        Wifi W=new Wifi();
        W.createWifiPin(roomNo, lastName);

}
	public static void createWifiPin(int roomNo, String lastName) {
			int hunValue=roomNo%100;
			int tensValue=hunValue/10;	
		String lastChar=lastName.substring(lastName.length()-1);
		int hunValue1=roomNo%10;
		char val[]= {')','!','@','#','$','%','^','&','*','('};
		int unitValue=roomNo/100;
		int total=unitValue+tensValue+hunValue1;
	int x=total%10;
	int y=total/10;
	int z=x+y;
	System.out.println(z+""+val[hunValue1]+lastChar+tensValue);
		
	}
	}
