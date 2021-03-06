package com.jenn.codeforces;

import java.util.Scanner;

public class CombinationApp {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CombinationApp ca = new CombinationApp();
		ca.runProgram();
	}

	private void runProgram(){
		//		int[] currentStateInt;
		//		int[] lockAnswerInt;
		int numRingsOnLock = 0;
		int numRotations = 0;
		String currentState = "";
		String lockAnswer = "";

		System.out.println("How many rings are on the lock?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again");
		}
		numRingsOnLock = scan.nextInt();
		//		currentStateInt = new int[numRingsOnLock];
		//		lockAnswerInt = new int[numRingsOnLock];


		System.out.print("What is the current combination on the lock: ");
		currentState = scan.next();

		System.out.print("What is the correct combination for the lock: ");
		lockAnswer = scan.next();

		//		for(int i = 0; i < numRingsOnLock; ++i){
		//			currentStateInt[i] = currentState.charAt(i);
		//			lockAnswerInt[i] = lockAnswer.charAt(i);
		//		}

		for(int i = 0; i < numRingsOnLock; i++){
			int currentNum = Character.getNumericValue(currentState.charAt(i));
			int answerNum = Character.getNumericValue(lockAnswer.charAt(i));

//			if(currentNum < answerNum){
//				currentNum += 10;
//			}
			if(currentNum < 5 && answerNum > 5 && currentNum != 0)
			{
				currentNum += 10;
			}
			numRotations += Math.abs(currentNum - answerNum);
		}

		System.out.println("You must move " + numRotations + " number of times.");
	}

}
