package com.corejava.oops.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Exception {
	
	static int a = 1;
	static int b = 0;
	static int c = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int k;
		
		FileInputStream m = new FileInputStream(new File("C:\\Users\\Learning\\Training\\Batch-Feb-03\\Sch_DXC-248-Java-B13 (1).xlsx"));
		
		
		try {
		k = a/b;
		File t = new File("c");
		//select * from emp; SQLEXception e
		}
		catch(ArithmeticException e) {
		System.out.println("Divide by zero error");	
		}
		finally {
			System.out.println("In Finally");
		}
		
		
		
		k = b/c;//value b = 1
		throw new ArithmeticException("Value of b cannot be 1");
		
		
	}

}
