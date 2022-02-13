package com.corejava.oops.multithread;

public class RunnableTest implements Runnable{

	@Override
	public void run() {
		
		System.out.println("In run method of runnable : "+Thread.currentThread().getName());
	}

	
	public static void main(String[] args) {

		System.out.println("Inside Main");

		RunnableTest t = new RunnableTest();
		
        Thread test = new Thread(t);
        
        test.start();
        
        Thread[] th = new Thread[10];
        Thread[] tp = new Thread[10];
        
       
        for(int k=0;k<th.length;k++) {
        	th[k] = new Thread(t);
        	
        	tp[k] = new Thread(new RunnableTest());
        	
            th[k].start();   
            tp[k].start();
        }
		
	}
	
}
