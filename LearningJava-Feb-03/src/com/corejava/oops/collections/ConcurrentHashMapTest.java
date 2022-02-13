package com.corejava.oops.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String,String> t = new ConcurrentHashMap();
		
		t.put("a1","rtt");
		t.put("a2","rtt");
		t.put("a3","rtt");
		
		
		Iterator m = t.keySet().iterator();
		
		while(m.hasNext())
		{
			System.out.println("In While Loop : "+m.next());
			
			t.put("a4", "errt");
		}
	}
	
}
