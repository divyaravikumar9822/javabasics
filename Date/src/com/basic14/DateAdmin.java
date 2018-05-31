package com.basic14;

public class DateAdmin {
	public static void main(String[] args) {
		Date d1=new Date();
		d1.setDay(31);
		d1.setMonth(5);
		d1.setYear(2018);
		d1.displayDate();
		Date d2=new Date(1,6,2018);
		d2.displayDate();
	}

}
