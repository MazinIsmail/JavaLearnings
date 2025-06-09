package com.sealed.learnings;

/**
 * Sealed interfaces and classes allow to define explicit boundaries for
 * inheritance, preventing unexpected classes from being part of the hierarchy.
 * 
 * The permits clause explicitly lists the classes that are allowed to implement
 * this interface.
 * 
 * 
 * All subclasses of a sealed interface or class must declare their role in the
 * hierarchy using one of the following modifiers:
 * 
 * final - Prevents further subclassing.
 * 
 * sealed - Allows controlled extension by specific subclasses.
 * 
 * non-sealed - Allows unrestricted extension.
 */
public sealed interface PaymentMethod permits CreditCard, PayPal, BankTransfer {
	void processPayment(double amount);

}
