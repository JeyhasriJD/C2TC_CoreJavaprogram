package com.tnsif.day8.interafces.functionalinterface;

public class Executor {
	
	public static void main(String[] args) {
		
		Calculate c1 = new Calculate(){
			public void calculateTesting(int a , int b) {
				
				System.out.println("Addition:"+(a+b));
				
			}
			
		};
		
		c1.calculateTesting(10,20);
		
		Calculate c2 = new Calculate() {
			
public void calculateTesting(int a , int b) {
				
				System.out.println("Subraction:"+(a-b));
				
			}
			
		};
		c2.calculateTesting(20,10);
	}
	
	// LAMBDA EXPRESSION
	Calculate C3 = (n,m)->{System.out.println("Multiply"+(n*m));};

	Calculate C4 = (n,m)->{System.out.println("Divide"+(n/m));};
}
