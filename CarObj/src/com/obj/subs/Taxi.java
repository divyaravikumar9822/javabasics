package com.obj.subs;

public class Taxi extends Car{
         public Taxi()
         {
        	 System.out.println("taxi called");
         }
         @Override
        public void getSpeed() {
        super.getSpeed();
        }
         
         public static void main(String[] args) {
			Car c1=new Taxi();
			Car c2=new Car(160.9);
			System.out.println(c1.model);
			System.out.println(c1.regNum);
			System.out.println(c1.speed);
			System.out.println(c1 instanceof Taxi);
		}
}
