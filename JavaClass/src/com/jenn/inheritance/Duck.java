package com.jenn.inheritance;

public class Duck extends Animal {
	
	//state
	private static final String SOUND = "Quack";
	
	//constructors
	public Duck(String name){
		super(name, Duck.SOUND);
	}
}
