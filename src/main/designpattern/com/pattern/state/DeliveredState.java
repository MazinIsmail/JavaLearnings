package com.pattern.state;

public class DeliveredState implements PackageState {

	private static DeliveredState deliveredStateInstance = new DeliveredState();

	private DeliveredState() {
	}

	public static DeliveredState getDeliveredStateInstance() {
		return deliveredStateInstance;
	}

	@Override
	public void next(Package pkg) {
		pkg.setState(ReceivedState.getReceivedStateInstance());
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(OrderedState.getOrderedStateInstance());
	}

	@Override
	public void printStatus() {
		System.out.println("Package delivered to post office, not received yet.");
	}
}
