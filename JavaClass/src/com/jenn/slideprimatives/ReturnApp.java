package com.jenn.slideprimatives;

import java.util.Scanner;

public class ReturnApp {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ReturnApp ra = new ReturnApp();
		ra.runApp();

	}

	private void runApp(){
		int num = 0;

		System.out.print("What number do you want to check: ");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.print("Invalid number, please try again: ");
		}

		num = scan.nextInt();

		System.out.println("Is " + num + " an even number?");
		System.out.println(isEven(num));
		System.out.println("Is " + num + " a prime number?");
		System.out.println(isPrimeNum(num));
		
	}

	private boolean isEven(int num){
		return ((num % 2) == 0);
	}

	private boolean isPrimeNum(int num){

		if(num == 1 || num == 2 || num ==3 || num == 5 || num == 7){
			return true;
		}
		else if((num % 2) == 0){
			return false;
		}
		else if((num % 3) == 0){
			return false;
		}
		else if((num % 5) == 0){
			return false;
		}
		else if((num % 7) == 0){
			return false;
		}
		else{
			return true;
		}
	}

}
