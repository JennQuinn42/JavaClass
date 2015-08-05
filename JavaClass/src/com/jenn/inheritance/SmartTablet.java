package com.jenn.inheritance;

public class SmartTablet extends SmartDevice {
	
	//state
	private String wifiPassword;
	
	//constructor
	public SmartTablet(String manu, String model, String wifi){
		super(manu, model);
		this.wifiPassword = wifi;
	}
	
	public String toString(){
		String output = super.toString();
		output += "\nWiFi password for this device is " + this.wifiPassword;
		return output;
	}
	
}
