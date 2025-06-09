package com.sealed.learnings;

public final class BusinessPayPal extends PayPal {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Business PayPal payment of $" + amount);
	}
}
