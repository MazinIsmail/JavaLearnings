package com.solid.learnings;

public interface Vehicle {
	public void drive();

	public void stop();

	public void refuel();

	public void openDoors();
}

class Bike implements Vehicle {

	// Can be implemented
	public void drive() {
	}

	// Can be implemented
	public void stop() {
	}

	// Can be implemented
	public void refuel() {
	}

	// Can not be implemented
	public void openDoors() {
	}
}
