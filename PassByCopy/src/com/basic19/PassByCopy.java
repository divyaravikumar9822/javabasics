
package com.basic19;

public class PassByCopy {  
		 int data=50;  
		  
		 void change(PassByCopy p)
		 {  
		 p.data=p.data+100;
		 }  
		    public static void main(String args[]){  
		    	PassByCopy p=new PassByCopy();
		System.out.println("before change "+p.data);  
		   p.change(p);
		   System.out.println("after change "+p.data);  
}

}