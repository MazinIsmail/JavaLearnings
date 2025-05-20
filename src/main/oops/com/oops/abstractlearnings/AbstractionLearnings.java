package com.oops.abstractlearnings;

/**
 * Abstraction is a process of hiding the implementation details and showing
 * only functionality to the user. Shows only essential things to the user and
 * hides the internal details, for example, sending SMS where you type the text
 * and send the message.
 * 
 * Two ways to achieve abstraction in java: -
 * 
 * Abstract class (0 to 100%)
 * 
 * Interface (100%)
 * 
 * 
 * An abstract class must be declared with an abstract keyword. It can have
 * abstract and non-abstract methods. It cannot be instantiated. It can have
 * constructors and static methods also. It can have final methods which will
 * force the subclass not to change the body of the method.
 * 
 * Shape is the abstract class, and its implementation is provided by the
 * Rectangle and Circle classes.
 * 
 * cannot be instantiated
 * cannot be instantiated
 * cannot be instantiated
 * 
 */
public abstract class AbstractionLearnings {

	private int age;

	public AbstractionLearnings() {
		super();
	}

	public AbstractionLearnings(int age) {
		super();
		this.age = age;
	}

	abstract void run();

	public static void main(String[] args) {
		// Cannot instantiated
		// AbstractionLearnings abstractionLearnings = new AbstractionLearnings();
	}
}
