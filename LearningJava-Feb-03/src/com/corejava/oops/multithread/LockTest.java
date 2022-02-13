package com.corejava.oops.multithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {
	
	private Lock lock ;
	private int counter = 0;
	
	
	LockTest(Lock lock){
		
		this.lock = lock;
	}


	@Override
	public void run() {
		
		System.out.println("In run method obtaining the Lock ....");
		lock.lock();
		counter++;
		counter = counter*20;
		System.out.println("Counter : "+counter);
        sum1();
		lock.unlock();
		
		sum1();
		
	}
	
	public void sum1() {
		int t =10;
		lock.lock();
		System.out.println("In sum 1 locked : " +t);
		t=t+19;
		sum2(t);
	}
	
	public void sum2(int a) {
		a=a+2;
		System.out.println("In sum2 method will unlock now : "+a);
		lock.unlock();
	}
	
	public static void main(String[] args) {
		
		LockTest test = new LockTest(new ReentrantLock());
		Thread t = new Thread(test);
		t.start();
		
		LockTest test1 = new LockTest(new ReentrantLock());
		Thread t1 = new Thread(test);
		t1.start();
		
		
		
		
		
		
		
	}
	

}
