package com.pattern.singleton;

import java.io.Serializable;

/**
 * Bill pugh solution. Inner class to create singleton.
 */
public class ThreadSafeSerializedSafeSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private ThreadSafeSerializedSafeSingleton() {
	}

	private static class SingletonHelper {
		private static final ThreadSafeSerializedSafeSingleton instance = new ThreadSafeSerializedSafeSingleton();
	}

	public static ThreadSafeSerializedSafeSingleton getInstance() {
		return SingletonHelper.instance;
	}

	/**
	 * This method will be invoked when you will de-serialize the object. Inside
	 * this method, you must return the existing instance to ensure single instance
	 * application wide.
	 */
	protected Object readResolve() {
		return getInstance();
	}

}
