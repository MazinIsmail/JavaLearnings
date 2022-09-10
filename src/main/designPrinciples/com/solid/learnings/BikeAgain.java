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

class CarAgain implements Driving, Stops, Refueling, Opening {

	@Override
	public void openDoors() {
		// TODO Auto-generated method stub

	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

}
