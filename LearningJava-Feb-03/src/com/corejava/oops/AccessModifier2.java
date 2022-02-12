package com.corejava.oops;

public class AccessModifier2 extends AccessModifiers {


	public static void main(String[] args) {
		AccessModifier2 test = new AccessModifier2();
		/*
		 * System.out.println("In Access Modifiers class : " +test.var1); private
		 * variable cannot be accessed from an extended class also We can access other
		 * using methods getters and setters We can access variables directly also like
		 * test.var2 test.var3 test.var4 etc
		 */
		
		System.out.println("In Access Modifiers class : "+test.var2);
		System.out.println("In Access Modifiers class : "+test.var3);
		System.out.println("In Access Modifiers class : "+test.var4);
		System.out.println("In Access Modifiers class : "+test.getVar1());
		System.out.println("In Access Modifiers class : "+test.getVar2());
		System.out.println("In Access Modifiers class : "+test.getVar3());
		System.out.println("In Access Modifiers class : "+test.getVar4());
}
	
}
