package com.jenn.slideobjects;

public class PrimApp {

	public static void main(String[] args){
		PrimApp pa = new PrimApp();
		pa.runApp();
	}
	
	private void runApp(){
		byte numByte = 42;
		short numShort =1337;
		int numInt = 9658230;
		long numLong = 15072015L;
		float numFloat = 12.345F;
		double numDouble = 1234.56789;
		boolean bool = false;
		char alpha = '*';
		
		System.out.println(numByte);
		System.out.println(numShort);
		System.out.println(numInt);
		System.out.println(numLong);

		System.out.println(numFloat);
		System.out.println(numDouble);
		System.out.println(bool);
		System.out.println(alpha);

		System.out.println(numByte*numShort*numInt*numLong);
		
		byte numByte2 = (byte)(numByte * numByte);
		
		System.out.println(numByte2);
	}
	
}
