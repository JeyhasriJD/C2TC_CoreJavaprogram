package com.tnsif.day7.overriding;

public class OverridingDemo {
	
	public static void main(String[] args) {
		RBI rbi;

		rbi = new SBI();
		System.out.println("SBI INTREST: "+rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println("ICICI INTREEST: "+rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println("HDFC INTREST: "+rbi.getRateOfInterest());

	}

}
