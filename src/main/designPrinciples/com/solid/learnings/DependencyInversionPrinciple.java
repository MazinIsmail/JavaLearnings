package com.solid.learnings;

/**
 * Dependency Inversion Principle
 * 
 * The Dependency Inversion Principle (DIP) states that high-level modules
 * should not depend upon low-level modules; they should depend on abstractions.
 * 
 * For example, you go to a local store to buy something, and you decide to pay
 * for it by using your debit card. So, when you give your card to the clerk for
 * making the payment, the clerk doesn't bother to check what kind of card you
 * have given. They will simply swipe it. So, in this example, you can see that
 * both you and the clerk are dependent on the credit card abstraction and you
 * are not worried about the specifics of the card. This is what a dependency
 * inversion principle is.
 * 
 * It allows a programmer to remove hardcoded dependencies so that the
 * application becomes loosely coupled and extendable.
 * 
 * Rely on abstractions (interfaces and abstract classes)
 */
public class DependencyInversionPrinciple {

	// For example check: FactoryPatternDemo
}
