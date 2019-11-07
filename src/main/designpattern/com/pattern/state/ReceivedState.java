package com.pattern.state;

public class ReceivedState implements PackageState {

	private static ReceivedState receivedStateInstance = new ReceivedState();

	private ReceivedState() {
	}

	public static ReceivedState getReceivedStateInstance() {
		return receivedStateInstance;
	}

	@Override
	public void next(Package pkg) {
		System.out.println("This package is already received by a client.");
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(DeliveredState.getDeliveredStateInstance());

	}

	@Override
	public void printStatus() {
		System.out.println("Package was received by client.");
	}

}