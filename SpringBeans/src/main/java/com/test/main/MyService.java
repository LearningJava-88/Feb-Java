package com.test.main;

import java.util.Date;

public class MyService {
	
	private String abc;

	public void log(String msg){
		System.out.println(new Date()+"::"+msg);
	}

	public String getAbc() {
		return abc;
	}

	public void setAbc(String abc) {
		this.abc = abc;
	}
}
