package com.jenn.inheritance;

public class InheritApp {

	public static void main(String[] args){
		InheritApp ia = new InheritApp();
		ia.runApp();
	}
	
	public void runApp(){
		Person member = new Person();
		
		System.out.println(member + " says");
		System.out.print("\""); 
		talk(member);
		System.out.println("\"");
	}//end runApp
	
	private void talk(Person member){
		member.makeNoise();
	}
	
}//end InheritApp
