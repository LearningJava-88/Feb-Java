package com.corejava.oops.concepts;

import com.corejava.oops.AccessModifiers;

public class AccessModifier4 extends AccessModifiers{
	
	
	
	public static void main(String[] args) {
	
		AccessModifiers test = new AccessModifiers();
		
		
		System.out.println("In Access Modifiers : " + test.var2);
		/*
		 * System.out.println("In Access Modifiers : " + test.var1);
		 * System.out.println("In Access Modifiers : " + test.var3);
		 * System.out.println("In Access Modifiers : " + test.var4); You can only access
		 * a public access modifier from outside the package declaration So you will get
		 * compilation error for the three above However using getters and setters which
		 * are public you ca access them if you want to restrict you can change the
		 * access modifier there
		 */
		
		System.out.println("In Access Modifiers  : "+test.getVar1());
		System.out.println("In Access Modifiers  : "+test.getVar2());
		System.out.println("In Access Modifiers  : "+test.getVar3());
		System.out.println("In Access Modifiers  : "+test.getVar4());
		
		
	}

}
