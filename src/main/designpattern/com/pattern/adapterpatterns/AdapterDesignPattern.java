package com.pattern.adapterpatterns;

/**
 * The adapter design pattern is a structural design pattern that allows two
 * unrelated/uncommon interfaces to work together. In other words, the adapter
 * pattern makes two incompatible interfaces compatible without changing their
 * existing code.
 * 
 * The adapter pattern uses anti-corruption layer which allows communication
 * between different systems that don't share same semantics. It can serves as
 * adapter / facade layer that translate request from one subsystem to the other
 * subsystem. It protects the application design to be independent from outside
 * subsystem.
 */
public class AdapterDesignPattern {

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
