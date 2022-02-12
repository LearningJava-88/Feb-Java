package com.corejava.oops.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		
		
		
//		ShortlistedStudents extends Student --Create a Class
		
		
		
		
	    HashMap<String, String> languages = new HashMap<>();
	    languages.put("Java", "Enterprise");
	    languages.put("Python", "Machine Learning");
	    languages.put("React", "UI Layer");
	    
	    
	    System.out.println("HashMap: " + languages);
	    

	    // create an object of Iterator
	    Iterator<Entry<String, String>> iterate1 = languages.entrySet().iterator();

	    // iterate through key/value mappings
	    System.out.print("Entries: ");
	    while(iterate1.hasNext()) {
	      System.out.print(iterate1.next());
	      System.out.print(", ");
	    }
	    
	    
	    
	    
	    
	    

	    // iterate through keys
	    Iterator<String> iterate2 = languages.keySet().iterator();
	    System.out.print("\nKeys: ");
	    while(iterate2.hasNext()) {
	      System.out.print(iterate2.next());
	      System.out.print(", ");
	    }

	    // iterate through values
	    Iterator<String> iterate3 = languages.values().iterator();
	    System.out.print("\nValues: ");
	    while(iterate3.hasNext()) {
	      System.out.print(iterate3.next());
	      System.out.print(", ");
	    }
	
	    
	    
	    
	    
	    
	    
	    
	
	
	// iterating through key/value mappings
    System.out.print("Entries: ");
    for(Entry<String, String> entry: languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
    
    
    
    

    // iterating through keys
    System.out.print("\nKeys: ");
    for(String key: languages.keySet()) {
      System.out.print(key);
      System.out.print(", ");
    }
    
    
    

    // iterating through values
    System.out.print("\nValues: ");
    for(String value: languages.values()) {
      System.out.print(value);
      System.out.print(", ");
    }
  }
	
	
	
	
	
	
	
	

}
