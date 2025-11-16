package com.tnsif.day8.interafces.functionalinterface.example;

public class Executor {

	public static void main(String[] args) {
		
		 Message M1 = (name)->{ System.out.println("Welcome: " + name);
		 return name; };
	     
		 M1.Greetings("MohanKumar");


	}

}
