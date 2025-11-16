package com.tnsif.constructorassignment;

public class CustomerDemo {

	public static void main(String[] args) {
		
		System.out.println("CUSTOMER DETAILS BOIZZ");
		
		Customer c1 = new Customer();
		 System.out.println(c1);

		 Customer c2 = new Customer();
			c2.setCId(144);
			c2.setCName("BHUVAN M");
			c2.setCCity("Pandruti");
			
		System.out.println(c2);
		
		Customer c3 = new Customer(143,"Gayan","Cuddalore");
		System.out.println(c3);
	}

}
