package com.sealed.learnings;

/**
 * CreditCard is declared as final, which means no other class can extend
 * CreditCard. CreditCard is declared as final, which means no other class can
 * extend CreditCard.
 */
public final class CreditCard implements PaymentMethod {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of $" + amount);
	}
}
