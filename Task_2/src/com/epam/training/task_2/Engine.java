package com.epam.training.task_2;

public class Engine {
	private boolean runnig = false;

	public Engine(boolean runnig, float fuel) {
		super();
		if (runnig == true) {
			this.Run(fuel);
		} else {
			this.runnig = false;
		}
	}

	public Engine() {
		super();
	}

	public boolean isRunnig() {
		return runnig;
	}

	public boolean Run(float fuel) {
		if (fuel > 0.005) {
			this.runnig = true;
		} else {
			this.runnig = false;
		}
		return runnig;
	}

}
