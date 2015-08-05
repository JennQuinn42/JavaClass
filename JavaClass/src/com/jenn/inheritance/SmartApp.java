package com.jenn.inheritance;

import java.util.ArrayList;

public class SmartApp {

	public static void main(String[] args) {
		SmartApp sa = new SmartApp();
		sa.runApp();
	}
	
	private void runApp(){
		ArrayList<SmartDevice> devices = new ArrayList<SmartDevice>(10);
		
		for(int i = 0; i < 10; ++i){
			if(i < 5){
				devices.add(new SmartTablet("Amazon", "Kindle Fire", ("a25" + i + "c85g")));
			}else{
				devices.add(new SmartPhone("HTC", "Desire 610", ("085718698" + i)));
			}
		}//end initialise devices
		
		for(SmartDevice device: devices){
			System.out.println(device);
		}
	}

}
