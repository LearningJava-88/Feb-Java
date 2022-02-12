package com.corejava.oops;

public class TestAbstraction extends MyFourthProgram implements InterfaceTest {

	@Override
	public void updateData() {
       System.out.println("I am in Update Data");		
	}

	@Override
	public void retrieveData() {

		System.out.println("I am in retrieve Data");
	}

	@Override
	public void method_pl() {

		System.out.println("I am in method pl ");
	}

}
