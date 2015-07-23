package com.jenn.slideprimatives;

public class ContinueApp {

	public static void main(String[] args) {
		
		ContinueApp ca = new ContinueApp();
		ca.runApp();
		
	}

	private void runApp(){
		
		for(int i = 1; i < 101; i++){
			if((i%2) != 0 ){
				continue;
			}
			System.out.println(i);
		}//end odd printout continue
		
		for(int i = 1; i < 101; i++){
			if((i%2) != 0 ){
				continue;
			}
			System.out.println(i);
		}//end even printout continue
		
		for(int i = 1; i < 101; i +=2){
//			if((i%2) != 0 ){
//				continue;
//			}
			System.out.println(i);
		}//end odd printout no continue
		
		for(int i = 1; i < 101; i +=2){
//			if((i%2) != 0 ){
//				continue;
//			}
			System.out.println(i);
		}//end even printout no continue
	}
	
}
