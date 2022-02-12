package com.corejava.oops.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassChildForInterface  implements InterfaceInheritance{

	int a = 8;
	int b = 7;
	
	@Override
	public void method5() {
		System.out.println("In Method 5");
	}

	@Override
	public void method6() {
		System.out.println("In Method 6");
	}
	
	public static void main(String[] args) {
		
		
		ClassChildForInterface child = new ClassChildForInterface();
		
		System.out.println("In CLass Child " + child.a);
		System.out.println("In CLass Child " + child.b);
        child.method5();
        child.method6();
        
        
        InterfaceInheritance parent = new ClassChildForInterface();
        
        parent.method5();
        parent.method6();
	}
	

}
