package com.corejava.oops.multithread;

public class SynchronizedTest extends Thread{


	public void run() {
		System.out.println("In run method.."+Thread.currentThread().getName());
		SynchronizedTester t = new SynchronizedTester();
		
		t.sum1();
		SynchronizedTester.sum2();
		t.sum3();
		SynchronizedTester.sum4();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		SynchronizedTest t = new SynchronizedTest();
		t.start();
		
		SynchronizedTest t1 =new SynchronizedTest();
		t1.start();
		
		SynchronizedTest t2 =new SynchronizedTest();
		t2.start();
		
		SynchronizedTest t3 =new SynchronizedTest();
		t3.start();
		
		SynchronizedTest t4 =new SynchronizedTest();
		t4.start();
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
