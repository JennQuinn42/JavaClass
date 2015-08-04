package com.jenn.inheritance;

public class Dog extends Animal{

	//state
	private static final String SOUND = "Woof";
	
	//constructors
	public Dog(){
		this("Gaspode");
	}
	
	public Dog(String name){
		super(name, Dog.SOUND);
	}

	@Override
	public void sleep() {
		System.out.println("Dog is dreaming...");
		
	}

}//end class
