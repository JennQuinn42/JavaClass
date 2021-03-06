package com.jenn.codeforces;

import java.util.Scanner;

public class ExamApp {

	Scanner scan = new Scanner(System.in);
	private static final int BEGIN = 1;

	public static void main(String[] args){

		ExamApp ea = new ExamApp();
		ea.runProgram();

	}//end main

	private void runProgram(){

		int numStudents = 0;
		int currentNum = 0;
		int potentialNum = 0;
		int endNum = 0;

		System.out.println("How many students are taking the exam?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Not a valid number. Please try again: ");
		}//end validation
		numStudents = scan.nextInt();
		endNum = numStudents;
		currentNum = BEGIN;



		while(true){
			if(currentNum != (numStudents / 2))
				System.out.print( currentNum + " ");

			if(currentNum == (numStudents / 2)){
				System.out.print(numStudents + " " + currentNum);
				break;
			}

			potentialNum = (currentNum - currentNum + 1);
			if(1 == potentialNum){
				System.out.print(--endNum + " ");
			}

			currentNum += BEGIN;
		}

	}//end run program

}//end class
