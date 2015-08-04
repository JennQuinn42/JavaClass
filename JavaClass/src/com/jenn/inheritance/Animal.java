package com.jenn.inheritance;

public abstract class Animal {

	//state 
	private String name;
	private String sound;
	
	public Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	//behaviousd
	public void makeNoise(){
		System.out.println(this.name + " says " + this.sound);
	}
	
	public String toString(){
		return this.name;
	}
	
}//end class
