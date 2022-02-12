package com.corejava.oops.inheritance;

import java.io.FileNotFoundException;

public class CLassChild  extends ClassParent{

	int a = 9;
	
	void method_2() {
		System.out.println("Overriding the method 2 from parent");
	}
	
	void method_3() {
		System.out.println("In Method 3 CLass Child");
	}
	
	public static void main(String[] args) {
		
		
		CLassChild d = new CLassChild();
		
        System.out.println("In Class CHild : " +d.a);		
        System.out.println("In Class CHild : " +d.first);		
        System.out.println("In Class CHild : " +d.second);		
        try {
			d.method_1();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        d.method_2();
        d.method_3();
		
        
        ClassParent parent = new ClassParent();
        
        System.out.println("In Classs child with parent referring to its child : "+parent.first);
        System.out.println("In Classs child with parent referring to its child : "+parent.second);
        try {
			parent.method_1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        parent.method_2();        
        
        ClassParent parent_1 = new CLassChild();
        System.out.println("In Classs child with parent referring to its child : "+parent_1.second);
        System.out.println("In Classs child with parent referring to its child : "+parent_1.first);
        try {
			parent_1.method_1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        parent_1.method_2();
        
        
        
	}
	
}
