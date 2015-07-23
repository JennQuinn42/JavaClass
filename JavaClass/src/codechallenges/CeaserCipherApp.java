/*
 * Created by Peter 
 */

package codechallenges;

import java.util.Scanner;

public class CeaserCipherApp {

	public static void main(String[] args) {

		CeaserCipherApp ca = new CeaserCipherApp();

		ca.runMenu();
	}

	//prompt user for initial menu
	public void runMenu(){
		
		Scanner scan = new Scanner(System.in);
		boolean isRunning = true;
		//move menu down into the do-while loop so the menu gets redisplayed each time
		System.out.println("---Encryption App---");
		System.out.println("1)Encrypt text");
		System.out.println("2)Decrypt text");
		System.out.println("3)Quit");
		System.out.print("Choose an option: ");
		do{
			String userOption = scan.nextLine();

			switch(userOption){
			case "1" : encryption(); break;//run encrypt text method
			case "2" : decryption();break;//run decrypt text method
			case "3" : isRunning = false;break;//run quit method
			default: System.out.print("Enter a valid option: ");
			}
		}while(isRunning);
	}

	public void encryption(){
		//set up the char array with chars from 32 to 126 (size of 158 elements)
		char[] alphabet = new char[127];
		for(int i = 33;i <=126 ;++i){ //32 was meant to be inclusive
			alphabet[i] = (char) i;
		}
		
		//get shift number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a shift number 25 or lower: ");
		int shiftNum = scan.nextInt();
		//get shift direction
		System.out.println("Enter shift direction L/R: ");
		String shiftDir = scan.next();  //What about using shiftDir.toUpperCase() 
										//so you don't need the OR down in your if statements
		//get encryption text
		System.out.println("Enter message for encryption:");
		Scanner scanEnc = new Scanner(System.in);
		String inputForEnc = scanEnc.nextLine();
		
		if(shiftDir.contains("l")||shiftDir.contains("L")){
			for(int i = 0;i < inputForEnc.length();++i){
				int charMap = inputForEnc.charAt(i);//get int of chat 
				System.out.print(alphabet[charMap + shiftNum]);//consider a String and 
												//concatenating the next char to it 
			}//shifting in the wrong direction. 
		}else{
			if(shiftDir.contains("r")||shiftDir.contains("R")){
				for(int i = 0;i < inputForEnc.length();++i){
					int charMap = inputForEnc.charAt(i);//get int of chat 
					System.out.print(alphabet[charMap - shiftNum]);
				}
			}//what if it contains something other than L/l or R/r
		}


	}
	
	public void decryption(){//consider having encryption and decryption in the same method.
		//set up the char array with chars from 32 to 126 (size of 158 elements)
		char[] alphabet = new char[127];
		for(int i = 33;i <=126 ;++i){
			alphabet[i] = (char) i;
		}
		
		//get shift number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the shift number 25 or lower: ");
		int shiftNum = scan.nextInt();
		//get shift direction
		System.out.println("Enter the shift direction L/R: ");
		String shiftDir = scan.next();
		//get encryption text
		System.out.println("Enter text to be decrypted:"); //what about decrypting the String you 
														//encrypted earlier?
		Scanner scanEnc = new Scanner(System.in);
		String inputForEnc = scanEnc.nextLine();
		
		if(shiftDir.contains("l")||shiftDir.contains("L")){
			for(int i = 0;i < inputForEnc.length();++i){
				int charMap = inputForEnc.charAt(i);//get int of chat 
				System.out.print(alphabet[charMap + shiftNum]);
			}
		}else{
			if(shiftDir.contains("r")||shiftDir.contains("R")){
				for(int i = 0;i < inputForEnc.length();++i){
					int charMap = inputForEnc.charAt(i);//get int of chat 
					System.out.print(alphabet[charMap - shiftNum]);
				}
			}
		}


	}


}//end encryption