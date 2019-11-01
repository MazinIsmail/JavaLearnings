package com.pattern.adapterpattern;

/**
 * The adapter design pattern is a structural design pattern that allows two
 * unrelated/uncommon interfaces to work together. In other words, the adapter
 * pattern makes two incompatible interfaces compatible without changing their
 * existing code.
 */
public class AdapterPatternDemo {

	public static void main(String args[]) {

		CreditCard targetInterface = new BankCustomer();

		targetInterface.giveBankDetails();

		System.out.print(targetInterface.getCreditCard());
	}

}
