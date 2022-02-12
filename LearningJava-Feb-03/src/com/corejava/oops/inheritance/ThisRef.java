package com.corejava.oops.inheritance;

public class ThisRef {
	
	int testVariable;
	int b;
	
	public ThisRef() {
		System.out.println("In empty constructor");
	}
	
	public ThisRef(int a , int b) {
		this();
       this.testVariable = a;
       
       this.b = b;
	}
	

	public static void main(String[] args) {
		
		ThisRef ref = new ThisRef(2, 3);
		
		System.out.println("THis ref : " + ref.testVariable);
		System.out.println("THis ref : " + ref.b);
		
	}
	
	
}
