
package com.java.slidefundamentals;

public class Helicopter {
	
	//state
	private String purpose; //Transport, Medivac, Attack, Recon
	private int maxCrew;
	private int maxPassenger;
	private double maxAltitude;
	private double currentAltitude;
	private static double FEET_TO_METERS = 3.280D;
	
	//behaviour
	public Helicopter(String purpose, int maxPassanger, 
					  int maxCrew, double maxAltitude, double currentAltitude){
		
		this.purpose = purpose;
		this.maxCrew = maxCrew;
		this.maxPassenger = maxPassanger;
		this.maxAltitude = maxAltitude;
		this.currentAltitude = maxAltitude;
		
	}//end constructor
	
	public void setCurrentAltitude(double newAltitude){
		if(newAltitude > maxAltitude){
			System.out.println("Heliopcter cannont fly that high, please pick a new altitude");
			return;
		}
		this.currentAltitude = newAltitude;
	}
	
	public double getCurrentAltitude(){
		return this.currentAltitude;
	}//end getCurrentAltitude
	
	public double getCurrentAltitudeInMeters(){
		return(this.getCurrentAltitudeInMeters() / FEET_TO_METERS);
	}
	
}
