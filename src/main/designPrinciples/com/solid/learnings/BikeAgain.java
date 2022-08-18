package com.solid.learnings;

interface Driving {
	public void drive();
}

interface Stops {
	public void stop();
}

interface Refueling {
	public void refuel();
}

interface Opening {
	public void openDoors();
}

public class BikeAgain implements Driving, Stops, Refueling {
	public void drive() {
	}

	public void stop() {
	}

	public void refuel() {
	}
}
