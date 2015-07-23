package com.jenn.slideprimatives;

import java.util.Scanner;

public class CharApp {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		CharApp ca = new CharApp();
		ca.runApp();
	}
	
	private void runApp(){
//		String name = "Jenn Quinn";
//		char currentChar = name.charAt(5);
//		
//		System.out.println(currentChar);
		
		String userName = "";
		
		System.out.print("Please enter a name: ");
		userName = scan.nextLine();
		
		for(int i = 0; i < userName.length(); ++i){
			System.out.println(userName.charAt(i));
		}
		
		
	}

}
