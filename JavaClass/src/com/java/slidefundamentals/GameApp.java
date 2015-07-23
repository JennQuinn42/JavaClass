package com.java.slidefundamentals;

import java.util.Scanner;

public class GameApp {

	private Scanner scan = new Scanner(System.in);

			public static void main(String[] args){

		GameApp ga = new GameApp();

		ga.runProgram();

	}//end main

	public void runProgram(){
		/*int numGames = 0;
		
		System.out.println("How many lives do you want to play with?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number. Please enter a number: ");
		}
		numGames = scan.nextInt();
		
		do{
			//play game
			System.out.println("Playing game " + numGames);
			--numGames;
		}while(numGames != 0);

		System.out.println("GAME OVER!");*/
		
		String userInput = "";
		int numToPrint = 0;

		System.out.println("What word do you want to display?");
		userInput = scan.nextLine();
		
		System.out.println("How many times do you want to display your input?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number. Please enter a number: ");
		}
		
		userInput = scan.nextLine();
		do{
			System.out.println(userInput);
			--numToPrint;
		}while(0 != numToPrint);
		
	}

}//end class
