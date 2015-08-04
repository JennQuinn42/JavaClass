package com.jenn.inheritance;

public class Person extends Animal{

	//state
	private static final String SOUND = "Hey!"
;	
	//constructor
	public Person(){
		this("Jane Doe");
	}//end no-args constructor
	
	public Person(String name){
		super(name, Person.SOUND);
	}//end 1 args constructor 
		
	public void sleep(){
		System.out.println("Person going to sleep...");
	}
}//end class
