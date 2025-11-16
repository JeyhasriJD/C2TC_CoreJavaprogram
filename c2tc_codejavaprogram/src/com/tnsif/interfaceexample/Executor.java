package com.tnsif.interfaceexample;

public class Executor {

	public static void main(String[] args) {
		
		College s1 = new Student();
		
		s1.session();
		s1.exam();
		
		System.out.println("-------------");
		
		College t1 = new Trainer();
		
		t1.session();
		t1.exam();
		

	}

}
