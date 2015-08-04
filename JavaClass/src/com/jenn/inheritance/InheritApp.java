package com.jenn.inheritance;

public class InheritApp {

	public static void main(String[] args){
		InheritApp ia = new InheritApp();
		ia.runApp();
	}

	public void runApp(){
		Person member = new Person("Eliza Doolittle");

		this.talk(member);

		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Emmy");

		this.talk(cat1);
		this.talk(cat2);

		Dog pet1 = new Dog();
		Dog pet2 = new Dog("Mouse");
		this.talk(pet1);
		this.talk(pet2);
		
		Duck bird = new Duck("Donald");
		Duck bird2 = new Duck("Daffy");
		this.talk(bird);
		this.talk(bird2);
		
		
		this.moveIt(member);
		this.moveIt(cat1);
		this.moveIt(pet2);
		
	}//end runApp

	private void talk(Animal being){
		being.makeNoise();
	}
	
	private void moveIt(Animal being){
		being.move();
	}
	
}//end InheritApp
