package com.jenn.slideprimatives;

import java.util.Scanner;

public class StateApp {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		StateApp sa = new StateApp();
		sa.beginApp();

	}

	public void beginApp(){
		int age = 0;
		int choice = 0;
		String name = "";

		/*System.out.println("Original Age is " + age);
		//age++;
		System.out.println("With post-increment " + age++);
		//age--;
		System.out.println("With post-decrement " + age--);

		System.out.println("New starting point is " + age);		
		System.out.println("With pre=increment " + ++age);
		System.out.println("With pre-decrement " + --age);

		System.out.println("Final age is " + age);*/

		/*if(age > 18 && age < 200){	//I could also switch this condition with the one below
			System.out.println("Congratulations your age is " + age);
		}//end if
		else if(age > 200){
			System.out.println("You can't be " + age);
		}
		else{
			System.out.println("I'm sorry you are not over 18");
		}*/

		//System.out.println("You picked " + choice);
		do{
			System.out.println("Please make a choice:");
			System.out.println("1) Enter your name: ");
			System.out.println("2) Enter your age: ");
			System.out.println("3) Quit");
			choice = scan.nextInt();
			
			if(choice == 1){
				System.out.println("Please enter your name.");
				name = scan.next();
			}
			else if(choice == 2){
				System.out.println("Please enter your age.");
				age = scan.nextInt();
			}
			else if(choice == 3){
				System.out.println("You want to quit. Are you mad?");
			}
			else{
				System.out.println("You picked an invalid option. Please pick again");
			}
			
			if(!name.equals("") && age != 0){
				System.out.println("Your name is " + name + " and your age is "
									+ age);
				age = 0;
				name = "";
			}
		}while(choice != 3);
	}//end beginApp

}//end class