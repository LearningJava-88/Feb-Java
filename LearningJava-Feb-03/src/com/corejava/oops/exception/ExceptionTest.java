package com.corejava.oops.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	
	
	static int a =0;
	static int b =0;
	
	
	public static void main(String[] args) {
		
		int g = a/2;
		
		System.out.println("Divin" + g);
		
		try {
			FileInputStream in  = new FileInputStream(new File("fdf"));
		} catch (FileNotFoundException e) {
			System.out.println("Did not keep the file to run");
			e.printStackTrace();
		}
		finally {
			System.out.println("In Finally");
		}
		
	}

}
