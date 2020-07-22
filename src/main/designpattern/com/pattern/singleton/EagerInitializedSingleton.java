package com.pattern.singleton;

/**
 * Singleton pattern restricts the instantiation of a class and ensures that
 * only one instance of the class exists in the java virtual machine. Singleton
 * pattern is used for logging, drivers objects, caching and thread pool.
 * 
 * In eager initialization, the instance of Singleton Class is created at the
 * time of class loading.
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
