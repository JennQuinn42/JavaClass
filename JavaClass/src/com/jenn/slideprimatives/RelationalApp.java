package com.jenn.slideprimatives;

import java.util.Scanner;

public class RelationalApp {
	
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		RelationalApp ra = new RelationalApp();
		ra.runApp();

	}
	
	private void runApp(){
		
		char unicode = 0;
		
		for(int i = 21; i <162; ++i){
			unicode = (char) i;
			System.out.print(unicode + " ");
			if((i-1)%10 == 0){
				System.out.println("");
			}
		}//end print in set of 10 loop
		
		unicode = 'A';
		char alpha = 'a';
		
		for(int i = 0; i < 26; ++i){
			int answer = Character.compare(unicode, alpha);
			System.out.print(unicode + " vs " + alpha + " = " + answer + "\n");
			unicode++;
			alpha++;
		}
	}

}
