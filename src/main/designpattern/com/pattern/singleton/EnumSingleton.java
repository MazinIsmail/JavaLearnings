package com.pattern.singleton;

/**
 * Reflection can be used to destroy singleton implementation approaches. To
 * overcome this situation with Reflection we can use Enum Singleton. The
 * drawback is that the enum type is somewhat inflexible; for example, it does
 * not allow lazy initialization.
 */
public enum EnumSingleton {
	INSTANCE;

	public static void doSomething() {

		// do something
	}
}