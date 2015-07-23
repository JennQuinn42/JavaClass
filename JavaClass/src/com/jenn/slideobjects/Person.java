package com.jenn.slideobjects;

public class Person {
	
	private String name = "Jane";
	private int age = -1;
	
	public Person(){
		this("Jane", 0);
	}

	public Person(String name, int age){
		this.setAge(age);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
