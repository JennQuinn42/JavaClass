package com.jenn.codeforces;

import java.util.Scanner;

public class ZeroAndOneApp {

	private String binaryInput ="";
	private Scanner scan = new Scanner(System.in);
	private String newBinary = "";

	public static void main(String[] args) {
		ZeroAndOneApp za = new ZeroAndOneApp();
		za.runApp();

	}

	private void runApp(){
		System.out.println("What is the binary string you wish to shorten?");
		binaryInput = scan.next();

		findAdjacent0And1(binaryInput);


		System.out.println(binaryInput.length());
		if(binaryInput.length() != 0){
			System.out.println("Remaining binary string is: " + binaryInput);
		}

	}

	private void findAdjacent0And1(String binary){
		//int[] numbers = new int[binary.length()];


		for(int i = 0; i < (binary.length() - 1); ++i){

			//numbers[i] = Character.getNumericValue(binary.charAt(i));
			int num1 = Character.getNumericValue(binary.charAt(i));
			int num2 = Character.getNumericValue(binary.charAt(i + 1));

			int sum = num1 + num2;

			if((sum %2) == 0 ){
				newBinary += binary.charAt(i);
			}
			else{
				i++;
			}
		}//end for loop
		newBinary += binary.charAt((binary.length() - 1));
		binaryInput = newBinary;
	}

}
