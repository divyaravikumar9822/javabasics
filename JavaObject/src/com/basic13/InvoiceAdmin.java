package com.basic13;

public class InvoiceAdmin {
	public static void main(String[] args) {
	Invoice invoice1=new Invoice();
	invoice1.setQuantity(5);
	invoice1.setPrice(100);
	invoice1.setPartDescription("divya");
	System.out.println(invoice1.getQuantity());
	System.out.println(invoice1.getInvoiceAmount());
	System.out.println(invoice1.getPartDescription());


}
}
