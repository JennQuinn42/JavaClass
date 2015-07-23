package com.java.slidefundamentals;

import java.util.Scanner;

public class NameApp {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		String name = "";
		String reverseName = "";
		
		/*System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");
		System.out.println("Jenn Quinn");*/
		
		
		
		System.out.print("Please enter your name: ");
		name = scan.next();
		
		for(int i = 0; i < name.length(); ++i){
			reverseName += name.charAt((name.length() - (i+ 1))); 
		}
		
		for(int i = 0; i < 100; ++i){
			System.out.println((i + 1) + ") " + reverseName);
		}
		
	}//end main
}//end class
