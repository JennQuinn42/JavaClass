package com.jenn.slideprimatives;

public class Boxer {

	public static void main(String[] args){
		
		Boxer wa = new Boxer();
		wa.runApp();
		
	}//end main
	
	private void runApp(){
		
		boxingDay(26);
		
	}//end runApp
	
	boolean boxingDay(Integer box){
		Boolean isBox = true;
		Short num = 360;
		
		if(isBox){
			System.out.println(++num);
		}
				
		return !isBox;
	}//end boxingDay
	
}
