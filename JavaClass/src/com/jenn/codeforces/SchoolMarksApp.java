package com.jenn.codeforces;

import java.util.Scanner;

public class SchoolMarksApp {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		SchoolMarksApp sa = new SchoolMarksApp();
		sa.runProgram();

	}

	private void runProgram(){
		int numTests = 0;
		int completedTests = 0;
		int maxMarksAttainable = 0;
		int maxMarksWanted = 0;
		int leastMarksWanted = 0;
		int average = 0;
		int testsLeft = 0;
		boolean solution = true;

		System.out.println("How many tests are there to do?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again");
		}
		numTests = scan.nextInt();

		System.out.println("How many tests have you completed?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again");
		}
		completedTests = scan.nextInt();

		System.out.println("How many marks can you get per test?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again");
		}
		maxMarksAttainable = scan.nextInt();

		System.out.println("What is the max average marks you need");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again");
		}
		maxMarksWanted = scan.nextInt();

		System.out.println("What is the minimum average marks you need ?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again");
		}
		leastMarksWanted = scan.nextInt();

		int[] marksOfTests = new int[completedTests];

		System.out.println("Please enter the marks you got in each test.");

		for(int i = 0; i < completedTests; ++i){
			marksOfTests[i] = scan.nextInt();
			average += marksOfTests[i];
		}

		testsLeft = numTests - completedTests;
		//STUDY UP ON GREEDY ALGORITHMS

		int[] remainingTests = new int[testsLeft];

		for(int i = 0; i < remainingTests.length; ++i){
			remainingTests[i] = 1;
		}
		
		int index = 0;
		
		while(solution){
			double median=0.0;
			double sumOfMarks = 0;
			for(int i: remainingTests){
				median += i;
			}//end for

			sumOfMarks = median;
			median = (average + sumOfMarks)/numTests;

			if(median < leastMarksWanted || sumOfMarks > maxMarksWanted){
				remainingTests[index]  += 1;
			}
			else{
				break;
			}//check if in range

			if(remainingTests[index] > maxMarksAttainable){
				++index;
			}
			if(index > remainingTests.length){
				solution = false;
			}
		}

		if(solution){
			System.out.print("You need to get the grades: ");
			for(int i = 0; i < remainingTests.length;++i){
				System.out.print(remainingTests[i] + " ");
			}
		}
		else{
			System.out.println("You cannot achieve your goal");
		}

	}

}
