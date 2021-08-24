package com.epam.training.task_2;

import java.util.ArrayList;

public class Fabric {

	public static Car getCar() {
		Car c = new Car("BMW");

		c.setEngine(new Engine());

		ArrayList<Wheel> wh = new ArrayList<Wheel>();
		for (int i = 0; i < 4; i++) {
			wh.add(new Wheel());
		}

		c.setWheels(wh);
		return c;

	}

}
