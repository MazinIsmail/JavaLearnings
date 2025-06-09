package com.sealed.learnings;

/**
 * PayPal is a sealed class.
 * 
 * The permits clause restricts the extension of PayPal to only BusinessPayPal
 */
public sealed class PayPal implements PaymentMethod permits BusinessPayPal {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PayPal payment of $" + amount);
	}
}
