package com.java.slidefundamentals;

import java.util.Random;

public class ArrayApp {

	private static final int PASS_MARK = 63;

	public static void main(String[] args) {

		Random ran = new Random();
		int[] score = new int[20];
		String[] names = new String[20];
		int total = 0;
		int failed = 0;
		int[] grade = new int[4];
		String student = "";
		//int position = 0; 

		names[0] = "Kevin";
		names[1] = "Connor";
		names[2] = "Marcos";
		names[3] = "Peter";
		names[4] = "Joe";
		names[5] = "Jenn";
		names[6] = "Art";
		names[7] = "Sam";
		names[8] = "Seamus";
		names[9] = "Greg";
		names[10] = "Mick";
		names[11] = "Craig";
		names[12] = "Marie";
		names[13] = "Colm";
		names[14] = "James";
		names[15] = "Mubasher";
		names[16] = "Thomas";
		names[17] = "Sam";
		names[18] = "Chris";
		names[19] = "Alex";

		for(int i = 0; i < score.length; i++){
			int scores = (ran.nextInt(50) + 1);
//			if(scores< 50){
//				scores = 100 - scores;
//			}
			if(scores < 25){
				scores += 50;
			}
			else{
				scores *= 2;
			}
			score[i] = scores;

		}//end initalise []


		int maxNum = score[0];
		int minNum = score[0];

		System.out.println("Name\t\tExam Result");
		System.out.println("");

		for(int i = 0; i < score.length; i++){
			if(names[i].length() < 8){
				System.out.println(names[i] +"\t\t\t" + score[i]);
			}
			else{
				System.out.println(names[i] +"\t\t" + score[i]);
			}

			total += score[i];

			if(score[i] < PASS_MARK){
				failed++;
				student += names[i] + ", ";
			}

			if(minNum > score[i]){
				minNum = score[i];
			}

			if(maxNum < score[i]){
				maxNum = score[i];
			}

			if(score[i] > 84){
				grade[0]++;
			}
			else if(score[i] > 63){
				grade[1]++;
			}
			else if(score[i] > 54){
				grade[2]++;
			}
			else{
				grade[3]++;
			}
		}//end print all elements of []

		float mean = ((float) total) / score.length;
		student = student.substring(0, (student.length()-2));
		student += ".";

		System.out.println("The total sum of the grades is " + total);
		System.out.println("The average result was " + mean);
		System.out.println("The lowest result was " + minNum);
		System.out.println("The highest result was " + maxNum);
		System.out.println(failed + " people failed their exam");
		System.out.println(grade[0] + " people got A's");
		System.out.println(grade[1] + " people got B's");
		System.out.println(grade[2] + " people got C's. Too bad that's a fail.");
		System.out.println("The people who failed were:\n" + student);

	}//end main

}//end class
