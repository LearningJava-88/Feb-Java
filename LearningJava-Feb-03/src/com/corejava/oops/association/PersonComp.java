package com.corejava.oops.association;

import java.util.ArrayList;
import java.util.List;

public class PersonComp {

	private static List<CompositionAddress> addr;

	public List<CompositionAddress> getAddr() {
		return addr;
	}

	public void setAdd(List<CompositionAddress> add) {
		this.addr = add;
	}
	
	public static void main(String[] args) {
		
		CompositionAddress agg = new CompositionAddress();
		
		agg.setAddress("address");
		
		addr = new ArrayList<>();
		
		addr.add(agg);
		
	}
 	
}
