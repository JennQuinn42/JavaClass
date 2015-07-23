package com.jenn.slideobjects;

public class PersonApp {

	public static void main(String[] args) {
		Person me = new Person();
		Person you = new Person("John", 26);
				
		System.out.println(me.getName() + " is " + me.getAge());
		
		me.setAge(27);
//		you.setAge(26);
//		you.setName("John");
		
		System.out.println(me.getName() + " is " + me.getAge());
		System.out.println(you.getName() + " is " + you.getAge());

	}

}
