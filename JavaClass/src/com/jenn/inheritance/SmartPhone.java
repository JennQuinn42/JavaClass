package com.jenn.inheritance;

public class SmartPhone extends SmartDevice {

	//state
	private String phoneNumber;
	
	//constructor
	public SmartPhone(String manu, String model, String phoneNo){
		super(manu, model);
		this.phoneNumber = phoneNo;
	}
	
	public String toString(){
		String output = super.toString();
		output += "\nPhone number for this device is " + this.phoneNumber;
		return output;
	}
	
}
