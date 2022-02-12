package com.corejava.oops.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		List<String>  test = new ArrayList<>();
		
		test.add("Tester");  //0
		test.add("Teste1r");  //1
		test.add("Tester2");   //2
		test.add("Testerw2");  //3
		//test.size value here is 4 
		
		
		for(int i=0;i<test.size();i++) {
			
			System.out.println("In For Loop :" +test.get(i));
			
		}
		
		for(String a : test) {
			
			System.out.println("In Enhanced for loop : "+a);
			
		}
		
		Iterator it = test.iterator();
		
		while(it.hasNext()) {
			System.out.println("In While Loop :" + it.next());
			
		}
		
		
		
		
		
		
	}
	
}
