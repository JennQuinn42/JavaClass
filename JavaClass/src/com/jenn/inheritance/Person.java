package com.jenn.inheritance;

public class Person {

	//state
	private String name;
	
	//constructor
	public Person(){
		this("Jane Doe");
	}//end no-args constructor
	
	public Person(String name){
		this.name = name;
	}//end 1 args constructor 
	
	//behaviour
	public void makeNoise(){
		System.out.print("Hey!");
	}//end makeNoise
	
	public String toString(){
		return this.name;
	}//end over-ridden toString
		
}//end class
