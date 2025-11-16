package com.tnsif.constructorexample;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		
		Student s2 = new Student();
		
		s2.setSid(101);
		s2.setName("HUNTER");
		
		System.out.println(s2);
		
		Student s3 = new Student(101,"MAJA");
		System.out.println(s3);
		
		

	}

}
