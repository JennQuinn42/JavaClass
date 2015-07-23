package com.jenn.slideprimatives;

import java.util.Scanner;

public class BreakApp {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		BreakApp ba = new BreakApp();
		ba.runProgram();
	}

	private void runProgram(){

		int userNum = -1;

		System.out.print("What number are you looking for between 1 and 100? ");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again: ");
		}

		userNum = scan.nextInt();

		double i = 1.0;
		//for(double i = 1.0; i < 101.0; ++i){
			for(double c = 0.0; c < 1001.0; ++c){
				//i = i c;

				if(userNum == i){
					System.out.println("Found " + i);
					break;
				}
				else{
					System.out.println(i);
				}
				i += 0.001;
				i = (double) Math.round(i * 100000) / 100000;
			}//end inner for
		//}//end outter for
	}

}
