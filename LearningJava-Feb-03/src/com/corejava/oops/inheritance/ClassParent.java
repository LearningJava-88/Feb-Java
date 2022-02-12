package com.corejava.oops.inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassParent {
	
	int first = 0;
	int second = 0;
	
	//new CLassParent()
	ClassParent(){
		System.out.println("In Class Parent construtor");
	}
	
	//new ClassParent(2,3);
	ClassParent(int a, int b){
		
		System.out.println("In Parameterized Constructor...");
		this.first = a;
		this.second = b;
	}
	
	 void method_1() throws FileNotFoundException{
		 FileInputStream t = new FileInputStream(new File(""));
		System.out.println("In Method 1 of Class Parent");
	}
	
	void method_2() {
		System.out.println("In Method 2 of Class Parent");
	}

}
