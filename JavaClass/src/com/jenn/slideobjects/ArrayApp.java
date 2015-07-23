package com.jenn.slideobjects;

import java.util.Random;

public class ArrayApp {

	public static void main(String[] args){
		ArrayApp aa = new ArrayApp();
		aa.runApp();
	}
	
	private void runApp(){
		Random rand = new Random();
		int[] scores = new int[10];
		int totalScores = 0;
		int maximumScores = 0;
		int minimumScores = 0;
		
		for(int i = 0; i < scores.length; ++i){
			scores[i] = (rand.nextInt(101)+1);
		}
		
		maximumScores = scores[0];
		minimumScores = scores[0];
		
		for(int i : scores){
			System.out.println(i);
			totalScores += i;
			
			if(i < maximumScores){
				maximumScores = i;
			}
			if(i < minimumScores){
				minimumScores = i;
			}
		}//end go through each element
		
		float average = (float) totalScores / (float) scores.length;
		
		System.out.println("The total of all the scores is " + totalScores);
		System.out.println("The average of all the socres is " + average);
		System.out.println("The maximum score was " + maximumScores);
		System.out.println("The minimum score was " + minimumScores);
	}
	
}
