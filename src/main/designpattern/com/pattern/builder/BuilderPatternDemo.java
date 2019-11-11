package com.pattern.builder;

/**
 * Builder design pattern is a creational design pattern like Factory Pattern
 * and Abstract Factory Pattern. The builder pattern, as name implies, is an
 * alternative way to construct complex objects.
 * 
 * The number of lines of code increase at least to double in builder pattern,
 * but the effort pays off in terms of design flexibility and much more readable
 * code. The parameters to the constructor are reduced and are provided in
 * highly readable method calls.
 * 
 * Builder pattern also helps minimizing the number of parameters in constructor
 * and thus there is no need to pass in null for optional parameters to the
 * constructor.
 * 
 * You can force the immutability to the object once you are done with creation
 * of object.
 * 
 * Builder pattern is verbose and requires code duplication as Builder needs to
 * copy all fields from original class.
 * 
 * We should follow the naming convention and if the class name is Computer then
 * builder class should be named as ComputerBuilder.
 * 
 * You might be thinking that we can mitigate the issue by calling a no-arg
 * constructor and then setting up the account via setter methods instead.
 * However, that leaves us open to another issue – what happens if a developer
 * forgets to call a particular setter method? We could end up with an object
 * that is only partially initialized, and again, the compiler wouldn't see any
 * problems with it.
 * 
 * Example:-
 * 
 * java.lang.StringBuilder#append() [Unsynchronized class]
 * 
 * java.lang.StringBuffer#append() [Synchronized class]
 * 
 * java.nio.ByteBuffer#put() (also on CharBuffer, ShortBuffer, IntBuffer,
 * LongBuffer, FloatBuffer and DoubleBuffer)
 * 
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Lokesh", "Gupta").age(30).phone("1234567").address("Fake address 1234")
				.build();

		System.out.println(user1);

		User user2 = new User.UserBuilder("Jack", "Reacher").age(40).phone("5655")
				// no address
				.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Super", "Man")
				// No age
				// No phone
				// no address
				.build();

		System.out.println(user3);
	}

}
