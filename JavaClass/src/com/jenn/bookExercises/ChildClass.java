package com.jenn.bookExercises;

public class ChildClass extends ParentClass {

	public ChildClass(){
		System.out.println("ChildClass Constructor");
	}
	
	public ChildClass(String string){
		super(string);
		System.out.println("ChildClass Constructor " + string);
	}
	
	public String className(){
		return "ChildClass ->" + super.className();
	}
	
}
