package com.pattern.state;

/**
 * The state pattern is a behavioral design pattern. The state pattern is also
 * known as objects for states. A state allows an object to alter its behavior
 * when its internal state changes. There shall be a separate concrete class per
 * possible state of an object.
 * 
 * When to use state pattern? In any application, when we are dealing with an
 * object which can be in different states during it’s life-cycle and how it
 * processes incoming requests (or make state transitions) based on it’s present
 * state – we can use the state pattern.
 * 
 * If we do not use the state pattern in such case, we will end up having lots
 * of if-else statements which make the code base ugly, unnecessarily complex
 * and hard to maintain. State pattern is used to provide a systematic and
 * lose-coupled way to achieve this through Context and State implementations.
 * State pattern allows the objects to behave differently based on the current
 * state, and we can define state-specific behaviors within different classes.
 * 
 * Always try to make state objects singletons.
 * 
 * Advantages of State Design Pattern:-
 * 
 * With State pattern, the benefits of implementing polymorphic behavior are
 * evident, and it is also easier to add states to support additional behavior.
 * 
 * In the State design pattern, an object’s behavior is the result of the
 * function of its state, and the behavior gets changed at runtime depending on
 * the state. This removes the dependency on the if/else or switch/case
 * conditional logic.
 * 
 * We can encapsulate the logic in dedicated classes, apply the Single
 * Responsibility Principle and Open/Closed Principle, have cleaner and more
 * maintainable code.
 * 
 * Disadvantages:-
 * 
 * Because we have a clear separate State classes with some logic the number of
 * classes grows up.
 * 
 * 
 * Example: Package can be ordered, delivered and received, therefore we're
 * going to have three states and the context class.
 */
public class StateDesignPattern {

	public static void main(String[] args) {
		Package pkg = new Package();
		pkg.printStatus();
		pkg.nextState();

		pkg.printStatus();
		pkg.nextState();

		pkg.printStatus();
		pkg.nextState();

		pkg.printStatus();
	}
}
