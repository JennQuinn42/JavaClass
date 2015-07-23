package com.jenn.slideobjects;

import java.util.Scanner;

public class MethodMan {
	
	String name;
	int age;
	double heightMetres;
	Scanner scan = new Scanner(System.in);
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeightMetres() {
		return heightMetres;
	}

	public void setHeightMetres(float heightMetres) {
		this.heightMetres = heightMetres;
	}

	public double getFutureHeight(){
		double futureHeight = 0.0F;
		double currentHeight;
		
		if(this.age == 3){
			currentHeight = this.getHeightMetres();
		}
		else{
			return this.getHeightMetres();
		}
		
		futureHeight = currentHeight * 2;
		
		return futureHeight;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	public static void main(String[] args) {
		MethodMan ma = new MethodMan();
		ma.runApp();
	}
	
	private void runApp(){
		System.out.print("Please enter a name:");
		this.setName(scan.next());
		System.out.print("Please enter their age:");
		this.setAge(scan.nextInt());
		System.out.print("Please enter their height in metres:");
		this.setHeightMetres(scan.nextFloat());
		
		double futureHeight = this.getFutureHeight();
		
		if(this.getHeightMetres() == futureHeight){
			System.out.printf(this.getName() + " is " + this.getAge() 
			+ " and has a height of %2.2f metres.", this.getHeightMetres());
		}
		else{
			System.out.printf(this.getName() + " is " + this.getAge() 
			+ " and currently has a height of %2.2f metres."
			+ "They will likely grow up to be %2.2f metres.",this.getHeightMetres(), futureHeight );
			
			futureHeight = futureHeight * 39.370;
			
			System.out.printf("That would be %2.2f" + futureHeight + " in inches.");
			
		}
		
	}

}
