package com.jenn.slideobjects;

public class ByValueApp {

	public static void main(String[] args) {
		ByValueApp ba = new ByValueApp();

		int num = 0;
		System.out.println("Main number is " + num);
		ba.changeNum(num);
		System.out.println("Main number is " + num);
	}
	
	private void changeNum(int number){
		System.out.println("Method number is " + number);
		++number;
		System.out.println("Method number is " + number);
	}

}
