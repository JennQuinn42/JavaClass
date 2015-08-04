package com.jenn.inheritance;

public class Cat {

	//state
	private String name;
	
	//constructors
	public Cat(){
		this("You");
	}
	
	public Cat(String name){
		this.name = name;
	}
	
	//behaviour
	public void makeNoise(){
		System.out.println("Purrrrrr");
	}//end makeNoise
	
	public String toString(){
		return this.name;
	}
	
	
}//end class
