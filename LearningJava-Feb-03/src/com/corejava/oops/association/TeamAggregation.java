package com.corejava.oops.association;

import java.util.ArrayList;
import java.util.List;

public class TeamAggregation {
	
	static List<PlayerAgg>  agg;
	
	public static void main(String[] args) {
		
		PlayerAgg g = new PlayerAgg();
		g.setName("Name");
		agg = new ArrayList<>();
		agg.add(g);
		
		
		
	}
	
	
 	
}
