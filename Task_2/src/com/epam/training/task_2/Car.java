package com.epam.training.task_2;

import java.util.List;

public class Car {
	private Engine engine = new Engine();
	private List<Wheel> wheels;
	private String model;
	private float fuel;

	public Car() {
		this.fuel = 0;
	}

	public Car(String model) {
		this.model = model;
		this.fuel = 0;
	}

	public Car(Engine engine, List<Wheel> wheels, String model) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.model = model;
		this.fuel = 0;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public void getModel() {
		System.out.print(model);
	}

	public void fillUp() {
		fuel = 1;
	}

	public void go() {
		if (engine.isRunnig()) {
			if (checkWheels()) {
				System.out.println("We are driving");
			} else {
				System.out.println("Wheels down");
			}
		} else {
			System.out.println("Engine not started");
		}
	}

	public boolean StartE() {
		boolean run;
		run = engine.Run(fuel);
		return run;
	}

	public void replaceWheel(Wheel spare) {
		for (int i = 0; i < wheels.size(); i++) {
			if (wheels.get(i).isFlatTire()) {
				wheels.remove(i);
				wheels.add(spare);
			}
		}
	}

	public void pumpUpWh() {
		for (int i = 0; i < wheels.size(); i++) {
			if (!wheels.get(i).isFlatTire()) {
				wheels.get(i).pumpUp();
			} else {
				System.out.println("the wheel is punctured");
			}
		}
	}

	public boolean checkWheels() {
		boolean w = true;
		for (int i = 0; i < wheels.size(); i++) {
			if (!wheels.get(i).isPumpedUp()) {
				w = false;
			}
		}
		return w;

	}

	public void punchW() {
		wheels.get((int) (Math.random() * 4)).punch();
	}

}
