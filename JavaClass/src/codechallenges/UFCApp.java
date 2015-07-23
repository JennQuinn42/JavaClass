package codechallenges;

import java.util.Scanner;

import codechallenges.Fighter;

public class UFCApp {

	private static final double POUND_TO_KG = 2.2062262;

	public static void main(String[] args) {

		UFCApp app = new UFCApp();
		app.beginApp();

	}//end main

	public void beginApp(){
		Scanner scan = new Scanner(System.in);
		double userWeight = 0.0;
		int[] numFightersInCategory = new int[6];
		int numFighters = 0;
		int choice = 0;

		System.out.println("How many fighters do you have?");
		while(!scan.hasNextInt()){
			scan.next();
			System.out.println("Sorry that isn't a valid option, please try again");
		}
		numFighters = scan.nextInt();

		Fighter[] fighters = new Fighter[numFighters];
		
		System.out.println("");
		
		for(int i = 0; i < numFighters; i++){
			
			fighters[i] = new Fighter();

			System.out.print("1) Enter your fighter's weight in kg\n"
					+ "2) Enter your fighter's weight in lb's"
					+ "\nPlease select:");
			while(!scan.hasNextInt()){
				scan.next();
				System.out.println("Sorry that isn't a valid option, please try again");
			}
			choice = scan.nextInt();

			System.out.println("");
			System.out.print("Enter your fighter's weight: ");
			while(!scan.hasNextDouble()){
				scan.next();
				System.out.println("Sorry that isn't a valid option, please try again");
			}
				userWeight = scan.nextDouble();

			if(choice ==1){
				//left empty as if-else-if selection is done in kg
			}//end if weight is in kg
			else if(choice ==2){
				userWeight = userWeight / POUND_TO_KG;
			}//end convert

			fighters[i].setWeightInKg(userWeight);
			
			if (userWeight > 120){
				System.out.println("Sorry, your fighter cant compete");
				numFightersInCategory[0]++;
				fighters[i].setWeightClass("Invalid");
				break;
			}
			else if (userWeight > 93){
				System.out.println("You are Heavyweight");
				numFightersInCategory[1]++;
				fighters[i].setWeightClass("Heavyweight");
			}
			else if (userWeight > 84){
				System.out.println("You are Light Heavyweight");
				numFightersInCategory[2]++;
				fighters[i].setWeightClass("Light Heavyweight");
			}
			else if (userWeight > 77){
				System.out.println("You are Middleweight");
				numFightersInCategory[3]++;
				fighters[i].setWeightClass("Middleweight");
			}
			else if (userWeight > 70){
				System.out.println("You are Welterweight");
				numFightersInCategory[4]++;
				fighters[i].setWeightClass("Walterweight");
			}
			else if (userWeight > 66){
				System.out.println("You are Lightweight");
				numFightersInCategory[5]++;			
				fighters[i].setWeightClass("Lightweight");
			}
			else {
				System.out.println("Sorry, you cant compete");
				numFightersInCategory[0]++;
				fighters[i].setWeightClass("Invalid");
				break;
			}
			
			System.out.println("What is your fighter's name?");
			fighters[i].setName(scan.next());
			
			System.out.println("");
		}

		for(int i = 0; i < numFightersInCategory.length; i++){
			System.out.print("You have " + numFightersInCategory[i] + " fighters ");
			
			switch (i){
				case 0: 
					System.out.println("ineligible"); break;
				case 1: 
					System.out.println("competing in the Heavyweight division"); break;
				case 2: 
					System.out.println("competing in the Light Heavyweight division"); break;
				case 3: 
					System.out.println("competing in the Middleweight division"); break;
				case 4: 
					System.out.println("competing in the Welterweight division"); break;
				case 5: 
					System.out.println("competing in the Lightweight division"); break;
			}
		}
		
		for(int i = 0; i<numFighters; i++){
			System.out.println(fighters[i].toString());
		}
		scan.close();
	}

}//end class
