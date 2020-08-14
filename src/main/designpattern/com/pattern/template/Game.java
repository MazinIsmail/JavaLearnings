package com.pattern.template;

/**
 * Abstract Class contains the templateMethod() which should be made final so
 * that it cannot be overridden. This template method makes use of other
 * operations available in order to run the algorithm but is decoupled for the
 * actual implementation of these methods. All operations used by this template
 * method are made abstract, so their implementation is deferred to subclasses.
 */
public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// template method
	public final void play() {

		// initialize the game
		initialize();

		// start game
		startPlay();

		// end game
		endPlay();
	}
}
