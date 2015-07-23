package com.java.slidefundamentals;

public class Bank {
	
	private Person customer;
	private int numAccount;
	
	public int getNumAccounts(){
		return numAccount;
	}
	
	public void setNumAccounts(int newNumAccounts){
		if(newNumAccounts < 0){
			System.out.println("Please enter a valid number of accounts");
			return;
		}//end if
		numAccount = newNumAccounts;
	}//end setNumAccount
	
}//end class Bank