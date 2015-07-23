package com.jenn.slideprimatives;

import java.util.Scanner;

public class IndexApp {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		IndexApp ia = new IndexApp();
		ia.runApp();

	}

	private void runApp(){
		//String name = "Jenn Quinn";
		String userInput = "";
		String searchString = "";
		char searchChar = 0;

		System.out.print("Please enter a String: ");
		userInput = scan.nextLine();


		System.out.print("What are you searching for?");
		searchString = scan.nextLine();

		if(searchString.length() <2){
			searchChar = searchString.charAt(0);
		}

		if(searchChar != 0){
			System.out.println(userInput.indexOf(searchChar));
		}
		else{
			System.out.println(userInput.indexOf(searchString));
		}
	}

}
