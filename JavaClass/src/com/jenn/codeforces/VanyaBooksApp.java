package com.jenn.codeforces;

import java.util.Scanner;

public class VanyaBooksApp {

	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		VanyaBooksApp va = new VanyaBooksApp();
		va.runProgram();
	}
	
	private void runProgram(){
		String numDigits = "";
		int numBooks = 0;
		
		System.out.print("How many books do you need to label: ");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.println("Invalid number, please try again.");
		}
		numBooks = scan.nextInt();
		
		for(int i = 1; i <= numBooks; ++i ){
			numDigits += i;
		}
		
		System.out.println("You will need " + numDigits.length() + " digits.");
	}
}
