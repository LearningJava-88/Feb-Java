package com.corejava.oops.multithread;

public class SynchronizedTester {
	
	public synchronized void sum1() {
		System.out.println("In Synchronized method sum1 "+Thread.currentThread().getName());
	}

	public synchronized static void sum2() {
		System.out.println("In Synchronized method sum2"+Thread.currentThread().getName());
	}


	public void sum3() {
		System.out.println("In method sum3"+Thread.currentThread().getName());
		synchronized(this) {
			System.out.println("In Synchronized block"+Thread.currentThread().getName());
		}
	}

	public static void sum4() {
		System.out.println("In method sum4"+Thread.currentThread().getName());
		synchronized(SynchronizedTest.class) {
			System.out.println("In Synchronized block"+Thread.currentThread().getName());
		}
	}

}
