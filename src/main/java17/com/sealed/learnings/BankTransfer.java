package com.sealed.learnings;

/**
 * other classes are free to extend BankTransfer
 */
public non-sealed class BankTransfer implements PaymentMethod {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing bank transfer payment of $" + amount);
	}
}