package com.jenn.slideobjects;

public class StringBuilderApp {

	public static void main(String[] args){
		StringBuilderApp sa = new StringBuilderApp();
		sa.runApp();
	}
	
	private void runApp(){
		StringBuilder sentence = new StringBuilder("Hello World");
		int index = sentence.length();
		StringBuilder word = new StringBuilder(" Dia dhuit");
		System.out.println(sentence.append(word));
		System.out.println(sentence);
		
		sentence.insert(index, 55);
		
		System.out.println(sentence + "" + word);
		
		sentence.deleteCharAt(index);
		sentence.deleteCharAt(index);
		
		System.out.println(sentence);
		
		for(int i = 0; i < sentence.length(); ++i){
			if(i%2 !=0){
				sentence.deleteCharAt(i);
			}
		}
		
		System.out.println(sentence);
	}
	
}
