package com.corejava.oops.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	
	static List<String> t = new ArrayList<>();
	
	HashMap p;
	
	
	public static void main(String[] args) {
		
		t.add("DEVELOPER");
		t.add("TESTER");
		t.add("AWS1");
		
		for(String s : t) {
			
			System.out.println("In Enhanced for loop :" +s);
			
		}
		
		Iterator it = t.iterator();
		
		while(it.hasNext()) {
             System.out.println("In while loop : "+it.next());			
		}
		
		for(int i=0;i<t.size();i++) {
			
			System.out.println("In For loop "+t.get(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
   
}
