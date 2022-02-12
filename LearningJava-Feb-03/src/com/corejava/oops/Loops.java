package com.corejava.oops;

public class Loops {

	
	public static void main(String[] args) {
		
		 
		for(int i=0;i<10;i++) {

			System.out.println("In For Loop : " + i);
		}
		
		int j=0;
		
		while(j<10) {
			
			System.out.println("In While Loop  : " + j);
			j++;
		}
		
		int k=0;
		do {
			
			k++;
			System.out.println("In Do While Loop : " + k);
			
			
		}while(k<1);
		
		
		int test = 3;
		
		switch(test) {
			case 0:
				System.out.println("Its zero");
				break;
			case 3:
			    System.out.println("Its Three");
		        break;
		    default:
		        System.out.println("In Default");
		        break;
		}
		
	}
	
}
