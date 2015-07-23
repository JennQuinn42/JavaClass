package com.jenn.slideobjects;

public class ByReferenceApp {

	public static void main(String[] args){
		ByReferenceApp ba = new ByReferenceApp();
		Car myCar = new Car();
		System.out.println("Model type is " + myCar.getModel());
		ba.changeCar(myCar);
		System.out.println("New model type is " + myCar.getModel());
	}
	
	private void changeCar(Car car){
		car.setModel("Veyron");
	}
}
