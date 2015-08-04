package com.jenn.inheritance;

public class Cat extends Animal {

	//state
	private static final String SOUND = "Purrrr";
	
	//constructors
	public Cat(){
		this("You");
	}
	
	public Cat(String name){
		super(name, Cat.SOUND);
	}

	@Override
	public void sleep() {
		System.out.println("Cat is snoring...");	
	}
	
	
}//end class
