package com.pattern.adapterpatterns;

/**
 * The adapter design pattern is a structural design pattern that allows two
 * unrelated/uncommon interfaces to work together. In other words, the adapter
 * pattern makes two incompatible interfaces compatible without changing their
 * existing code.
 * 
 * 
 * two incompatible interfaces compatible without changing their existing code
 * two incompatible interfaces compatible without changing their existing code
 * two incompatible interfaces compatible without changing their existing code
 */
public class Main {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();
		ToyDuck toyDuck = new PlasticToyDuck();

		// Wrap a bird in a birdAdapter so that it
		// behaves like toy duck
		ToyDuck birdAdapter = new BirdAdapter(sparrow);

		System.out.println("Sparrow...");
		sparrow.fly();
		sparrow.makeSound();

		System.out.println("ToyDuck...");
		toyDuck.squeak();

		// toy duck behaving like a bird
		System.out.println("BirdAdapter...");
		birdAdapter.squeak();
	}

}
