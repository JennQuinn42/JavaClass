package com.jenn.slideprimatives;

import java.util.Scanner;

public class CompoundApp {
	
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		CompoundApp ca = new CompoundApp();
		ca.runApp();
	}

	private void runApp(){
		int number = 42;
		System.out.println(number);
		number += 1;
		
		System.out.println("Incremented, the number is " + number);
		
		System.out.println("Please specify a new number: ");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.println("Invalid number please try again: ");
		}
		number = scan.nextInt();
		
		number -= 1;
		
		System.out.println("Decrimented that number is " + number);
		
	}

}
