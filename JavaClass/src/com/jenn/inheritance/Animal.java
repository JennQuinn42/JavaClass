package com.jenn.inheritance;

public abstract class Animal {

	//state 
	private String name;
	public String getName() {
		return name;
	}

	private String sound;
	
	public Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	abstract public void sleep();
	
	//behaviour
	public void makeNoise(){
		System.out.println(this.name + " says " + this.sound);
	}
	
	public void move(){
		System.out.println(this.name + " is moving...");
	}
	
	public String toString(){
		return this.name;
	}
	
}//end class
