package com.tnsif.inheritanceactiviy;

public class Executor {

	public static void main(String[] args) {
		
		Person P = new Person("Mohan",21,"Villupuram");
		System.out.println(P); 
		
		Student S = new Student("Mohan",21,"Villupuram",121,"mohan","TNSIF");
		System.out.println(S); 

		Teacher T = new Teacher("Tamizh",31,"Villupuram",121,"SENIOR TEACH","MORNIG");
		System.out.println(T); 
	}

}
