package com.java.slidefundamentals;

public class Lawnmower {
	//state
	private boolean engineOn = false;
	public enum engineType{MOTOR, ELECTRIC, HYBYRID, NONE};
	private String colour;
	
	//behaviour
	
	public void turnEngineOn(){
		System.out.println("Turning engine on ...");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.engineOn = true;
	}//emd turnEngineON
	
	public void turnEngineOff(){
		System.out.println("Turning engine off ...");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.engineOn = false;;
	}//end turnEngineOff
	
	public boolean isEngineOn(){
		return this.engineOn;
	}//end isEngineOn
	
	public void setEngine(){
		
	}
}
