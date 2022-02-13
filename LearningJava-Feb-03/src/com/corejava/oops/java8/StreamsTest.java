package com.corejava.oops.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsTest {

	public static void main(String[] args) {
		
		List<String> test = new ArrayList<String>();
		
		test.add("ONE");
		test.add("TWO");
		test.add("THREE");
		test.add("FOUR");
		
//		Method reference to static method – Class::staticMethodName
		
		Optional<Integer> g= IntStream.range(1, 5).boxed().reduce(Math::max);
		g.ifPresent(s->System.out.println(s));
		
//		Method reference to instance method from instance – ClassInstance::instanceMethodName

		System.out.println(test.stream().count());
		test.stream().map(p->p.toLowerCase()).forEach(System.out::println);
		
		
		List<String> strings = Arrays.asList("abc", "def", "rty");
			 
//	Method reference to instance method from class type – Class::instanceMethodName
			List<String> t = strings
			    .stream()
			    .map(String::toUpperCase)
			    .collect(Collectors.toList());
			
			System.out.println("test : " + t);
		
//		Reference to constructor – Class::new


			List<Integer> integers = IntStream
			        .range(1, 5).boxed()
			        .collect(Collectors.toCollection( ArrayList::new ));
			 
//			Optional<Integer> max = integers.stream().reduce(Math::max); 
            System.out.println("Value : " + integers);		
            
		
		
	}
	
}
