package com.jenn.inheritance;

public abstract class SmartDevice {

	//state
	private String manufacturer;
	private String model;
	
	//constructor
	public SmartDevice(String manu, String model){
		this.manufacturer = manu;
		this.model = model;
	}
	
	public String toString(){
		return this.manufacturer + " " + this.model;
	}
	
	
}
