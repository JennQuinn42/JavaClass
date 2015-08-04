package com.jenn.inheritance;

public class InheritApp {

	public static void main(String[] args){
		InheritApp ia = new InheritApp();
		ia.runApp();
	}

	public void runApp(){
		Person member = new Person();

		System.out.println(member + " says");
		System.out.print("\""); 
		talk(member);
		System.out.println("\"");

		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Emmy");

		System.out.print(cat1 + " says ");
		this.talk(cat1);

		System.out.print(cat2 + " says ");
		this.talk(cat2);

		Dog pet1 = new Dog();
		Dog pet2 = new Dog("Mouse");
		
		System.out.print(pet1 + " says ");
		this.talk(pet1);
		System.out.print(pet2 + " says ");
		this.talk(pet2);
		
	}//end runApp

	private void talk(Person member){
		member.makeNoise();
	}

	private void talk(Cat cat){
		cat.makeNoise();
	}
	
	private void talk(Dog dog){
		dog.makeNoise();
	}
	
}//end InheritApp
