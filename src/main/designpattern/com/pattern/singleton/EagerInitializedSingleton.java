package com.pattern.singleton;

/**
 * Singleton pattern restricts the instantiation of a class and ensures that
 * only one instance of the class exists in the java virtual machine. Singleton
 * pattern is used for logging, drivers objects, caching and thread pool.
 * 
 * In eager initialization, the instance of Singleton Class is created at the
 * time of class loading.
 * 
 * Disadvantage:-
 * 
 * They violate the single responsibility principle: by virtue of the fact that
 * they control their own creation and lifecycle.
 * 
 * They inherently cause code to be tightly coupled. This makes faking them out
 * under test rather difficult in many cases.
 */

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
