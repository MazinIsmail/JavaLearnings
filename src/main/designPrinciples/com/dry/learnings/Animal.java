package com.dry.learnings;

/**
 * Both a Cat and a Dog need to eat food, but they speak differently. Since
 * eating food is a common functionality for them, we can abstract it into a
 * parent class such as Animal and then have them extend the class. Instead of
 * both classes implementing the same functionality of eating food.
 */
public class Animal {
	public void eatFood() {
		System.out.println("Eating food...");
	}
}

class Cat extends Animal {
	public void meow() {
		System.out.println("Meow!!!");
	}
}

class Dog extends Animal {
	public void woof() {
		System.out.println("Woof!!!");
	}
}
