package com.jenn.slideprimatives;

//import java.util.Scanner;

public class OperatorApp {

	//private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		OperatorApp oa = new OperatorApp();
		oa.runApp();
	}
	
	private void runApp(){
		String name;
		int age;
		boolean isAlive;
		char gender;
		
		name ="Jenn";
		age = 27;
		isAlive = true;
		gender = 'f';
		
		System.out.println("Name is " + name + ", my age is " + age
					+ ", my gender is " + gender + ". Am I alive? " + isAlive);
	}

}
