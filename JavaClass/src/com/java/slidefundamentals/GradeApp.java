package com.java.slidefundamentals;

import java.util.Scanner;

public class GradeApp {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String [] arg){
		String grade = "";
		String result = "";
		System.out.print("Please enter a grade>: ");
		grade = scan.next();
		
		
		grade = grade.toLowerCase();
		
		switch(grade){
		case "a" : result = "85-100"; break;
		case "b" : result = "70-84"; break;
		case "c" : result = "55-69"; break;
		case "d" : result = "40-54"; break;
		default : result = "fail"; break;
		}
		
		if(result.equals("fail")){
			System.out.println("Your student has failed");
		}
		else{
		System.out.println("Your student got a result between " + result);
		}
		
	}//end main
}//end class
