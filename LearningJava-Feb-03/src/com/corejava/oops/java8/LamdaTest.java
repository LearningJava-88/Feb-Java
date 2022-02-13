package com.corejava.oops.java8;

public class LamdaTest {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable(){
			public void run() {
				System.out.println("In Anonymous runnable method ");
			}
		}).start();;
	
		InterfaceFunctional1 t1 = (e,f) -> {
			
			System.out.println("In Lamda InterfaceFunctional1 java class : "+(e+f));
		};

		InterfaceFunctional t = () -> 4;
		
		InterfaceFunctional2<Integer,Integer,Integer> t2 = (g,h) -> {
			int p = g+h;
			return p;
		};
		
		System.out.println("Functional Interface : "+t.someValues());
	    t1.sum(20,30);
	    t2.someFunction(2, 3);
	}
	
	//(parameter list) -> lambda body
//	() -> System.out.println("Dummy statement");
	//Multiple lines then we have semi colon after brackets
	/*
	 * () -> { int  a = 9; return a;};
	 */

}
