package com.jenn.inheritance;

public class Dog {

	//state
	private String name;
	
	//constructors
	public Dog(){
		this("Gaspode");
	}
	
	public Dog(String name){
		this.name = name;
	}
	
	//behaviour
	public void makeNoise(){
		System.out.println("Woof");
	}
	
	public String toString(){
		return this.name;
	}
	
	
}//end class
