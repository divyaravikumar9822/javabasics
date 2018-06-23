package com.wifi.prp;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class WifiNew 
	{
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String roomNo=sc.next();
	        String name=sc.next();
	        WifiNew w=new WifiNew();
	        w.getWifi(roomNo, name);
	        
	    }
	    public void getWifi(String roomNo,String name)
	    {
	   char[] first=roomNo.toCharArray();
	        Arrays.sort(first);
	     String str=" ";
            if(name.length()%2==0)
             {
            	 str= "$";
            }
            else
            {
            	 str="#";
            }
            char[] a1=name.toCharArray();
            int middleChar=name.length()/2;
			System.out.println(first[first.length-1]+""+str+""+first[0]+""+a1[middleChar]);
}
	}
