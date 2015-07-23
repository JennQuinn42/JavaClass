package com.jenn.bookExercises;

public class SuperExampleApp {

	public static void main(String[] args){
		SuperExampleApp sa = new SuperExampleApp();
		sa.runApp();
	}
	
	public void runApp(){
		ChildClass cc1 = new ChildClass();
		ChildClass cc2 = new ChildClass("test");
		//System.out.println(cc1.className());
		System.out.println(new ChildClass().className());
	}

}
