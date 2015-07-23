package com.jenn.slideprimatives;

import java.util.Scanner;

public class ArithmeticApp {

	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArithmeticApp aa = new ArithmeticApp();
		aa.runApp();

	}

	private void runApp(){
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Please enter two numbers seperated by a space:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(performOperators(num1, num2));
		
	}
	
	private String performOperators(int num1, int num2){
		String answers = "The sum of the numbers are: ";
		answers += (num1 + num2);
		
		answers += "\nThe first number subtracted by the second is ";
		answers += (num1 - num2);
		
		answers += "\nThe second number subtracted by the first is ";
		answers += (num2 - num1);

		answers += "\nThe numbers multiplied together are ";
		answers += (num1 * num2);
		
		answers += "\nThe first number divided by the second is ";
		answers += (num1 / num2);
		
		answers += "\nThe second number divided by the first is ";
		answers += ((float)num2 / num1);
		
		answers += "\nThe first number modulo the second is ";
		answers += (num1 % num2);
		
		answers += "\nThe second number modulo the first is ";
		answers += (num2 % num1);
		
		return answers;
	}
	
}
