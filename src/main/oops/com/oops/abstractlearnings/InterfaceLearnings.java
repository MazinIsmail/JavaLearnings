package com.oops.abstractlearnings;

/**
 * An interface in Java is a blueprint of a class. It has static constants and
 * abstract methods. It is used to achieve abstraction and multiple inheritance
 * in Java.
 * 
 * It cannot be instantiated just like the abstract class.
 * 
 * Since Java 8, we can have default and static methods in an interface.
 * 
 * Since Java 9, we can have private methods in an interface.
 * 
 * It provides total abstraction; means all the methods in an interface are
 * declared with the empty body, and all the fields are public, static and final
 * by default.
 * 
 * The Java compiler adds public and abstract keywords before the interface
 * method. Moreover, it adds public, static and final keywords before data
 * members.
 * 
 * A class extends another class, an interface extends another interface, but a
 * class implements an interface.
 * 
 * An interface which has no member is known as a marker or tagged interface,
 * for example, Serializable ,Cloneable, Remote, etc. They are used to provide
 * some essential information to the JVM so that JVM may perform some useful
 * operation. More about it in "com.markableinterfaces.learning".
 * 
 */
// instead of class keyword you will use interface keyword.
public interface InterfaceLearnings {

	// adds public, static and final
	int a = 0;

	// adds public and abstract
	void print();
}

// implements for interface implementation
class ImplementationInterface implements InterfaceLearnings {

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}
}
