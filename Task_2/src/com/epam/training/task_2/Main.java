package com.epam.training.task_2;

//Create an object of the class Auto, using the class of the wheel, the motor. Method: go, fill up,
//Change the wheel, turn on the console of the car brand
public class Main {
	public static void main(String[] args) {

		Car bmw = Fabric.getCar();

		bmw.pumpUpWh();
		bmw.fillUp();
		bmw.StartE();
		// bmw.punchW();
		// bmw.pumpUpWh();
		bmw.go();

	}
}
