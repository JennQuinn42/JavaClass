package com.java.slidefundamentals;

import javax.print.attribute.standard.MediaSize.Engineering;

public class lawnmowerApp {

	public static void main(String [] args){
		Lawnmower lawnmower = new Lawnmower();
		System.out.println("Is the engine on? " + lawnmower.isEngineOn());

		lawnmower.turnEngineOn();
		System.out.println("Is the engine on? " + lawnmower.isEngineOn());
		
		lawnmower.turnEngineOff();
		System.out.println("Is the engine on? " + lawnmower.isEngineOn());
		
		
		
	}//end main method
}//end lanmower app
