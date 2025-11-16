package com.tnsif.day6.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {

		System.out.println(Employee.companyName);
		Employee e = new Employee("Damian", 143);
		System.out.println(e);
		
		e = new Employee("Anyaa", 142);
		System.out.println(e);

	}

}