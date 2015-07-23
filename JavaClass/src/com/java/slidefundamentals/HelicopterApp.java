package com.java.slidefundamentals;

public class HelicopterApp {

	public static void main(String[] args) {
		
		Helicopter chopper = new Helicopter("Medivac", 2, 5, 250.0D, 0);
		System.out.println("Currant altitude is " + chopper.getCurrentAltitude());

		chopper.setCurrentAltitude(100.0D);
		System.out.println("Currant altitude is " + chopper.getCurrentAltitude());
		
		chopper.setCurrentAltitude(300.0D);
		System.out.println("Currant altitude is " + chopper.getCurrentAltitude());
		
		
		System.out.println("Current altidute in Meters are " + 
							chopper.getCurrentAltitudeInMeters());
			
	}//end main method

}//end class
