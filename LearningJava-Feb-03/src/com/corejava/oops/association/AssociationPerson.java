package com.corejava.oops.association;

import java.util.ArrayList;
import java.util.List;

public class AssociationPerson {
	
	String name;
	static List<BankAccounts> accounts;
	
	
	public static void main(String[] args) {
		
		BankAccounts t = new BankAccounts();
        t.setName("Hello");
        accounts = new ArrayList<>();
        AssociationPerson obj = new AssociationPerson();
        
        obj.setAccounts(accounts);
        obj.setName("Someone");
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<BankAccounts> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<BankAccounts> accounts) {
		this.accounts = accounts;
	}

}
