package com.java8.learning.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Functional composition is a technique to combine multiple functions into a
 * single function which uses the combined functions internally. You can compose
 * individual functions (typically one or more Java Lambda Expressions) into a
 * single function yourself, but Java also comes with built-in support for
 * functional composition to make the job easier for you.
 * 
 * The functional composition support comes in the shape of default and static
 * methods in the functional interfaces.
 */
public class FunctionalComposition {
	public static void main(String[] args) {
		Predicate<String> startsWithA = (text) -> text.startsWith("A");
		Predicate<String> endsWithX = (text) -> text.endsWith("x");

		Predicate<String> startsWithAAndEndsWithX = (text) -> startsWithA.test(text) && endsWithX.test(text);
		startsWithAAndEndsWithX = startsWithA.and(endsWithX);

		String input = "A hardworking person must relax";
		boolean result = startsWithAAndEndsWithX.test(input);
		System.out.println(result);

		Predicate<String> composed = startsWithA.or(endsWithX);
		result = composed.test(input);
		System.out.println(result);

		System.out.println();
		/**
		 * The Java Function compose() method composes a new Function instance from the
		 * Function instance it is called on, and the Function instance passed as
		 * parameter to the compose() method.
		 */
		Function<Integer, Integer> multiply = (value) -> value * 2;
		Function<Integer, Integer> add = (value) -> value + 3;

		/**
		 * The Function returned by compose() will first call the Function passed as
		 * parameter to compose(), and then it will call the Function which compose()
		 * was called on.
		 */
		Function<Integer, Integer> addThenMultiply = multiply.compose(add);
		Integer result1 = addThenMultiply.apply(3);
		System.out.println("result1: " + result1);

		/**
		 * The Java Function andThen() method works opposite of the compose() method. A
		 * Function composed with andThen() will first call the Function that andThen()
		 * was called on, and then it will call the Function passed as parameter to the
		 * andThen() method.
		 */
		Function<Integer, Integer> multiply1 = (value) -> value * 2;
		Function<Integer, Integer> add1 = (value) -> value + 3;
		Function<Integer, Integer> multiplyThenAdd = multiply1.andThen(add1);
		Integer result2 = multiplyThenAdd.apply(3);
		System.out.println("result2: " + result2);

		// calling a.andThen(b) is actually the same as calling b.compose(a)
	}
}
