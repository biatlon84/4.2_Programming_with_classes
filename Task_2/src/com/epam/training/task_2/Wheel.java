package com.epam.training.task_2;

public class Wheel {
	private boolean pumpedUp;
	private boolean flatTire;

	public Wheel() {
		super();
		this.flatTire = false;
		this.pumpedUp = false;
	}

	public boolean isFlatTire() {
		return flatTire;
	}

	public void punch() {
		this.flatTire = true;
		this.pumpedUp = false;
	}

	public boolean isPumpedUp() {
		return pumpedUp;
	}

	public void pumpUp() {
		if (!flatTire) {
			pumpedUp = true;
		} else {
			pumpedUp = false;
		}
	}
}
