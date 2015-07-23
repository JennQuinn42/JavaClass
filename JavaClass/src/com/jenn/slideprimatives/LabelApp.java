package com.jenn.slideprimatives;

public class LabelApp {

	@SuppressWarnings("unused")
	public static void main(String[] args){
		outer:
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Hello");
				continue outer;
			} //end inner for
			System.out.println("Outer for loop");
		}//end outer for
	
	System.out.println("Goodbye");
	}//end main

}
