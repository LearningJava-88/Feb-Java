package com.corejava.oops.inheritance;

import java.util.List;

public class SuperRef  extends ClassParent {
	
	
	String st = "Testing"; //String Pool
	String st1 = new String("Testing"); // Heap  memory
	String st2 = "Testing"; // refer to the same value in string pool 
	
	
	
	SuperRef(){
		super(20,30);
		System.out.println("In Empty Contructor..");
	}

	public static void main(String[] args) {
		
		SuperRef ref = new SuperRef();
		
	}

	
}
