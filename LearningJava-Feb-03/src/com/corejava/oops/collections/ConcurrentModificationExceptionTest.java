package com.corejava.oops.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionTest {
	

	public static void main(String[] args) {
		
		List<String> t = new ArrayList<>();
        
		t.add("abc");
		t.add("abc1");
		t.add("abc2");
		t.add("abc3");
		
		HashMap<String,String> p = new HashMap<>();
		
		Iterator<String> it = t.iterator();
		
		/*
		 * while(it.hasNext()) {
		 * 
		 * System.out.println("In while loop : "+it.next());
		 * 
		 * t.add("abc4"); }
		 */
		
		p.put("a1", "abc1");
		p.put("a2", "abc2");
		p.put("a3", "abc3");
        
		Iterator m = p.entrySet().iterator();
		
		while(m.hasNext()) {
			
			System.out.println("In While Loop : "+m.next());
			//iterator remove method will not throw any concurrent modification exception 
			
			m.remove();
            //but if you directly remove any thing from the collection (here it is map)then it will throw error
			p.put("b3", "hjk");
		}
		
		
	}

}
