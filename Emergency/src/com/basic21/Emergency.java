package com.basic21;

public class Emergency {
	String name;
	int number;
	String address;
	String location;
	static String Type;
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return Type;
	}
	
	public String setType(String Type) {
		Emergency.Type=Type;
		return Type;
	}
	
	public String display()
	{
	 switch(Type)
	{
		case "injury":
			return "ambulance";
		case "fire":
		         return "fireengine";
		case "murder":
			return "police";
		 default:
			return "nomessage";
	}
	}
			
	 public static void main(String args[]) {
		 Emergency e2=new Emergency();
		 
		 e2.setName("divya");
		 e2.setNumber(787436644);
		 e2.setAddress("shree street");
		 e2.setLocation("tiruchengode");
		 e2.setType("injury");
		 e2.display();
		 System.out.println(e2.getName());
		 System.out.println(e2.getNumber());
		 System.out.println(e2.getAddress());
		 System.out.println(e2.getLocation());
		 System.out.println(e2.getType());
		 System.out.println("the method is"+e2.display());
		 
	 }
	
	

}
