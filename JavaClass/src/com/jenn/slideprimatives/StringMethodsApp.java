package com.jenn.slideprimatives;

import java.util.Scanner;

public class StringMethodsApp {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		StringMethodsApp sa = new StringMethodsApp();
		sa.runApp();

	}
	
	private void runApp(){
		
		String input = "";
		
		System.out.println("What do you want to say?");
		input = scan.nextLine();
		
		System.out.println("Do you want to:");
		System.out.println("1) Input a String?");
		System.out.println("2) Search the String?");
		System.out.println("3) Add to a String?");
		System.out.println("4) Quit?");
		
//		System.out.println(input);
//		System.out.println(input.length());
//		input = input.concat(" world");
//		
//		System.out.println(input);
//		System.out.println(input.length());
		
	}

}
