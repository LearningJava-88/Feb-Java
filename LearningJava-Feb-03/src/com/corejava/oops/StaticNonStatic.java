package com.corejava.oops;

/*
 * Understanding Static and Non Static 
 * Static is a class level thing which we dont need any access to object and we can access directly with the Class Name
 * Static block is also class level which will be executed first after the class is loaded
 * Non Static is at Object Level so non static methods can be called only after creating an object
 * Non Static Block will be executed when ever a new object is created
 * I am in static block
I am in non static block
I am in Contructor
I am non static variable : 1
I am non static variable : 3
In Main Method : 4
I am in static method
I am in non static method
I am in non static block
I am in Contructor
I am in non static block
I am in Contructor
I am in non static block
I am in Contructor
I am in non static block
I am in Contructor
I am in non static block
I am in Contructor
I am in non static block
I am in Contructor
I am non static variable : 1
I am non static variable : 3
In Main Method : 10

 * 
 * 
 * 
 */

public class StaticNonStatic {
	
		private int test_1 =1;
		private int test_2 =2;
		private static int test_3 =3;
		
		
	    StaticNonStatic() {
			
	    	System.out.println("I am in Contructor");
	    	test_3++;
	    	test_2++;
		}
		
	    
	    
	    static {
	    	
	    	System.out.println("I am in static block");
	    }
	    
	    {
	    	System.out.println("I am in non static block");
	    }
	    
	    
	    
	    
	    
		
		public static void main(String[] args) {
			
		
			
//			System.out.println("Non Static Variable access : " +test_2);
			
			StaticNonStatic prg1 = new StaticNonStatic();

			System.out.println("I am non static variable : "+prg1.test_1);
			System.out.println("I am non static variable : "+prg1.test_2);
			System.out.println("In Main Method : " + test_3);
			
			StaticNonStatic.testStatic();
			
			prg1.nonStatic();
			
			StaticNonStatic prg2 = new StaticNonStatic();
			StaticNonStatic prg3 = new StaticNonStatic();
			StaticNonStatic prg4 = new StaticNonStatic();
			StaticNonStatic prg5 = new StaticNonStatic();
			StaticNonStatic prg6 = new StaticNonStatic();
			StaticNonStatic prg7 = new StaticNonStatic();
			
			System.out.println("I am non static variable : "+prg7.test_1);
			System.out.println("I am non static variable : "+prg7.test_2);
			System.out.println("In Main Method : " + test_3);
			
			
			
		}
		
		
		public static void testStatic() {
			
			System.out.println("I am in static method");
		}
		
		public void nonStatic() {
			System.out.println("I am in non static method");
		}

}
