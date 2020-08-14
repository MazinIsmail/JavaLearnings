package com.pattern.template;

/**
 * Concrete Class implements all the operations required by the templateMethod
 * that were defined as abstract in the parent class. There can be many
 * different Concrete Classes. In our case it is 'Football' and 'Cricket'.
 */
public class Football extends Game {

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}
