package com.corejava.oops.multithread;

public class ThreadTest extends Thread{

	int var1 = 10;
	String var2 = "I am a String";
	static String var3 = "Static Variable ";
	static int var4 = 4;
	
	public static void main(String[] args) {
		
		ThreadTest test = new ThreadTest();
		
		test.start();
		
		ThreadTest test1 = new ThreadTest();
		ThreadTest test2 = new ThreadTest();
		
		test1.start();
		test2.start();
		
	}
	
	public void run() {
		ThreadTest.var3 = ThreadTest.var3 + "Plus ";
		System.out.println("In run method : "+Thread.currentThread().getName());
		System.out.println("In run method : "+ThreadTest.var3);
		System.out.println("In run method : "+ThreadTest.var4++);
		
	}
	
	
}
