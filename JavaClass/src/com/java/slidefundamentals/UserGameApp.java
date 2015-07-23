package com.java.slidefundamentals;

import java.util.Scanner;

public class UserGameApp {

	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		UserGameApp ua = new UserGameApp();
		ua.runProgram();
	}

	private void runProgram(){
		boolean runProgram = true;
		
		do{
			System.out.print("How many lives do you want to have? (0 to quit)");
			int userLives = -1;
			
			while(!scan.hasNextInt()){
				scan.next();
				System.out.print("Invalid number, please try again: ");
			}
			
			userLives = scan.nextInt();
			
			if(userLives == 0){
				runProgram = false;
			}
			
			while(userLives > 0){
				System.out.println("Life " + userLives
									+". Let's play the game...");
				userLives--;
			}
			
			System.out.println("You have no lives left T.T /nGame Over");
			
		}while(runProgram);
	}
	
}
