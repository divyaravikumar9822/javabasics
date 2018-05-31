package com.basic17;

public class EmployeeAdmin {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setName("divya");
		e1.setSalary(10000);
		Employee e2=new Employee();
		e2.setName("ravikumar");
		e2.setSalary(20000);
		System.out.println("Employee details="+e1.getName()+""+e1.getSalary());
		System.out.println("Employee details="+e2.getName()+""+e2.getSalary());
	}

}
