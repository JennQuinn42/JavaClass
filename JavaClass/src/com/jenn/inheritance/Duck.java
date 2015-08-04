package com.jenn.inheritance;

public class Duck extends Animal {
	
	//state
	private static final String SOUND = "Quack";
	
	//constructors
	public Duck(String name){
		super(name, Duck.SOUND);
	}
	
	public void sleep(){
		System.out.println("Duck is sleeping...");
	}
	
	public void move(){
		System.out.println("Duck is waddling away...");
	}
}
