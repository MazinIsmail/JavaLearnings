package com.java9.safeVarargs;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 7 introduced the @SafeVarargs annotation to suppress the unsafe
 * operation warnings that arises when a method is having varargs (variable
 * number of arguments). The @SafeVarargs annotation can only be used with
 * methods (final or static methods or constructors) that cannot be overriden
 * because an overriding method can still perform unsafe operation on their
 * varargs (variable number of arguments).
 * 
 * It was included in Java7 and can only be applied on
 * 
 * Final methods
 * 
 * Static methods
 * 
 * Constructors
 * 
 * From Java 9, it can also be used with private instance methods.
 * 
 * The @SafeVarargs annotation can be applied only to methods that cannot be
 * overridden. Applying to the other methods will throw a compile time error.
 * 
 * SafeVarargs is like @SupressWarnings in that it allows us to declare that a
 * particular compiler warning is a false positive.
 * 
 * Note: If you try to compile the above code in Java 7 and Java 8, you will get
 * a compilation error because this enhancements is done in Java 9, prior to
 * java 9 – private methods are not allowed to be marked with this annotation.
 */
public class SafeVarargsLearnings {

	@SafeVarargs
	private void display(List<String>... products) {
		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
		SafeVarargsLearnings safeVarargsLearnings = new SafeVarargsLearnings();
		List<String> list = new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		safeVarargsLearnings.display(list);
	}
}
