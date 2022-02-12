package com.corejava.oops;

public class AccessModifiers1 {
	
	public static void main(String[] args) {
		
		
		AccessModifiers test = new AccessModifiers();
		/*
		 * System.out.
		 * println("You cannot directly access a private variable of some other class here :"
		 * test.var1); You can access private viariabe only through a getter and setter
		 * without private access You can access other vairables here test.var3
		 * test.var2 test.var4
		 */
		System.out.println("In Access Modifiers class : "+test.var2);
		System.out.println("In Access Modifiers class : "+test.var3);
		System.out.println("In Access Modifiers class : "+test.var4);
		System.out.println("In Access Modifiers1 : "+test.getVar1());
		System.out.println("In Access Modifiers1 : "+test.getVar2());
		System.out.println("In Access Modifiers1 : "+test.getVar3());
		System.out.println("In Access Modifiers1 : "+test.getVar4());
	}

}
