package com.corejava.oops.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> t = new CopyOnWriteArrayList();
		
		t.add("asd");
		t.add("asd1");
		t.add("asd11");
	
		Iterator h = t.iterator();
		
		while(h.hasNext()) {
			System.out.println("In While Loop : "+h.next());
			t.add("ry");
		}
		System.out.println("FInal Size after addition : " +t.size());
		
	}
	
}
