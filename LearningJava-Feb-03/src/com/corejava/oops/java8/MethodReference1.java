package com.corejava.oops.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface methodref{
	
	void sum();
}

public class MethodReference1 {
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(3,4,5,6,7,1,9);
		
		Optional<Integer> t = integers.stream().reduce(Math::max);
		t.ifPresent(val->System.out.println(val));
		

		
		
	}
	
	

}
