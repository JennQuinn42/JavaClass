package com.jenn.bookExercises;

public class ParentClass {

	public ParentClass(){
		System.out.println("ParentClass Constructor");
	}
	
	public ParentClass(String string){
		System.out.println("ParentClass Constructor " + string);
	}
	
	public String className(){
		return " ParentClass ";
	}
}
