package codechallenges;
/**
 * 
 * Class to search for and enter eircodes and addresses
 * 
 */

import java.util.Scanner;

public class EircodeApp {


	//		System.out.println("Hello World!");

	//Set up relating [] to store the eircode and corresponding addressses
	private StringBuilder[] eircode = {new StringBuilder("D02 Y006"),new StringBuilder("D04 C932"),
			new StringBuilder("D15 XR2R"),new StringBuilder("D03 RR27"),
			new StringBuilder("D24 H510"),new StringBuilder("D02 XE81"),
			new StringBuilder("D02 P656"),new StringBuilder(""),
			new StringBuilder(""),new StringBuilder("")};
	private StringBuilder[] addresses = {new StringBuilder("5 Merrion Square North, Dublin 2"),
			new StringBuilder("10 Burlington Road, Dublin 4"),
			new StringBuilder("Dunsink Observatory, Dunsink Lane, Dublin 15"),
			new StringBuilder("26 Kincora Road, Clontarf, Dublin 3"),
			new StringBuilder("Partas 4A Brookfield Enterprise Centre, Dublin 24"),
			new StringBuilder("Hodges Figgis, 56-58 Dawson Street, Dublin 2"),
			new StringBuilder("Central Bank of Ireland, Dame Street, Dublin 2"),
			new StringBuilder(""),new StringBuilder(""),
			new StringBuilder("")};
	private boolean arrayFull = false;

	public static void main(String[] args) {
		EircodeApp ea = new EircodeApp();
		ea.runApp();
	}

	private void runApp(){

		boolean runMenu = true;
		int choice = -1;

		while(runMenu){

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			System.out.println("What would you like to do:");
			System.out.println("1) Search by eircode");
			System.out.println("2) Search by address");
			System.out.println("3) Search by Dublin postcode");
			System.out.println("4) Enter custom eircode and address");
			System.out.println("5) Quit");

			//choice = getUserInput();


			while(!scan.hasNextInt()){
				scan.nextLine();
				System.out.println("Invalid input, please try again");
			}

			choice = scan.nextInt();

			switch (choice){
			case 1: searchCode();break;
			case 2: searchAddress();break;
			case 3: searchPostalCode();break;
			case 4: insertEircode();break;
			case 5: runMenu = false;break;
			default: 
				System.out.println("Invalid option, please try again: ");
				System.out.println();
				break;
			}

		}
	}


	private void searchCode(){
		//ask user and get their required eircode
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		scan.reset();
		System.out.println("Please Enter Eircode: ");

		StringBuilder eircodeInput= new StringBuilder("");

		//		while(scan.hasNext()){
		//			eircodeInput += scan.next();
		//		}

		eircodeInput.append(scan.nextLine());

		//		System.out.println("You have entered: " + eircodeInput);

		myUppercase(eircodeInput);

		//Remove the spaces from the user input
		myRemoveSpace(eircodeInput);

		//If eircode is 7 characters long, add a space as the new 4th index
		if(eircodeInput.length() == 7){
			eircodeInput.insert(3, " ");
		}

		//Check if eircode is too small or too large
		if(eircodeInput.length() < 7 || eircodeInput.length() > 8){
			System.out.println(eircodeInput + " is not a valid eircode.");
		}else{

			int elementFound = -1;

			//check if eircode is in our []
			for(int i = 0; i < eircode.length; i++){

				if(myEquals(eircodeInput,eircode[i])){

					elementFound = i;
					break;
				}
			}

			//if it's not found
			if(elementFound == -1){
				System.out.println("Sorry, eircode not found.");
			}else{//if it's found
				System.out.println(eircodeInput + " is " +addresses[elementFound]);
			}
		}

		//scan.close();

		System.out.println();

	}//end search by code

	private void searchAddress(){
		Scanner scan = new Scanner(System.in);
		StringBuilder userSearch = new StringBuilder("");
		int elementFound = -1;

		System.out.println("What address are you looking for? ");
		userSearch.append(scan.nextLine());

		//		System.out.println("You have entered: " + eircodeInput);

		myUppercase(userSearch);

		//Remove the spaces from the user input
		myRemoveSpace(userSearch);

		for(int i = 0; i < addresses.length; i++){

			if(addresses[i].toString().toUpperCase().contains(userSearch)){
				System.out.println(addresses[i]);
				elementFound = i;
				//break;
			}
		}

		if(elementFound == -1){
			System.out.println("Sorry, address not found.");
		}
		System.out.println();
	}//end searchAddress

	private void searchPostalCode(){
		StringBuilder userInput = new StringBuilder("");
		StringBuilder address = new StringBuilder("");
		Scanner scan = new Scanner(System.in);

		System.out.println("What Dublin postcode do you want to find the addresses for?");
		userInput.append(scan.nextLine());
		
		myUppercase(userInput);

		//Remove the spaces from the user input
		myRemoveSpace(userInput);

		if(userInput.toString().startsWith("DUBLIN")){
			userInput.replace(0, 6, "D");
		}

		if(userInput.length() == 2){
			userInput.insert(1, "0");

		for(int i = 0; i < eircode.length; ++i){
			if(eircode[i].toString().startsWith(userInput.toString())){
				address.append("\n" + addresses[i]);
			}
		}

		if(address.equals("")){
			System.out.println("Could not find any addresses for that postcode.");
		}
		else{
			System.out.println(userInput + " contains the addresses:");
			System.out.println(address);
		}

		System.out.println();
		}
	}//end searchPostalCode

	private void insertEircode(){
		Scanner scan = new Scanner(System.in);
		StringBuilder userInput = new StringBuilder("");

		enterCode:
			if(arrayFull){
				System.out.println("Sorry can only add three custom eircodes.");
			}
			else{
				System.out.println("What is the new eircode you want to add?");
				userInput.append(scan.nextLine());

				myUppercase(userInput);
				for(int i = 0; i < eircode.length; ++i){
					if(myEquals(userInput,eircode[i])){
						System.out.println("That eircode already exists");
						break enterCode;
					}
				}

				Scanner scan2 = new Scanner(System.in);

				for(int i = 6; i < eircode.length; ++i){
					if(myEquals(eircode[i], new StringBuilder(""))){

						System.out.println("What address is that?");
						StringBuilder userAddress = new StringBuilder(scan2.nextLine());

						for(int j = 0; j < eircode.length; ++j){
							if(myEquals(userAddress, addresses[j])){
								System.out.println("That address already exists");
								break enterCode;
							}
						}

						eircode[i] = userInput;
						addresses[i] = userAddress;

						System.out.println("Address has been added to the database.");
						break;
					}
				}

				if(!myEquals(eircode[eircode.length - 1], new StringBuilder(""))){
					arrayFull = true;
				}
			}
		System.out.println();
	}//end insertEircode.
	
	private void myUppercase(StringBuilder mySb){
		for(int i = 0; i < mySb.length();++i){
			if(mySb.charAt(i) > 91){
				char lowercase = mySb.charAt(i);
				mySb.deleteCharAt(i);
				mySb.insert(i, (char)(lowercase-32));
				//mySb.replace(i, i+1, Character.toString((char)(mySb.charAt(i)-32)));
			}	
		}	
	}//end of myUppercase 
	
	private void myRemoveSpace(StringBuilder myRms){
		for(int i=0;i<myRms.length();++i){
			if(myRms.charAt(i) == ' '){
				myRms.deleteCharAt(i);
				i--;
			}
		}
	}//end myRemoveSpace
	
	private boolean myEquals(StringBuilder mySb1, StringBuilder mySb2){
		boolean equals = false;
		
		if(mySb1 != mySb2 && mySb1.length() == mySb2.length()){
			for(int i = 0; i < mySb1.length(); ++i){
				if(mySb1.charAt(i) != mySb2.charAt(i)){
					equals = false;
					break;
				}
				else{
					equals = true;
				}
			}
		}//end if not the same object and the same length
		
		return equals;
	}//end myEquals

}//end class