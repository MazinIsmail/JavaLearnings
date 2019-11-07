package com.pattern.state;

public class OrderedState implements PackageState {

	private static OrderedState orderedStateInstance = new OrderedState();

	private OrderedState() {
	}

	public static OrderedState getOrderedStateInstance() {
		return orderedStateInstance;
	}

	@Override
	public void next(Package pkg) {
		pkg.setState(DeliveredState.getDeliveredStateInstance());
	}

	@Override
	public void prev(Package pkg) {
		System.out.println("The package is in its root state.");
	}

	@Override
	public void printStatus() {
		System.out.println("Package ordered, not delivered to the office yet.");
	}
}