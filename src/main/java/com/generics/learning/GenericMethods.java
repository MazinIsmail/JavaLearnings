package com.generics.learning;

/**
 * Generic Methods
 * 
 * You can write a single generic method declaration that can be called with
 * arguments of different types. Based on the types of the arguments passed to
 * the generic method, the compiler handles each method call appropriately.
 * 
 * All generic method declarations have a type parameter section delimited by
 * angle brackets (< and >) that precedes the method's return type ( < E > )
 * 
 * Each type parameter section contains one or more type parameters separated by
 * commas. A type parameter, also known as a type variable.
 * 
 * The type parameters can be used to declare the return type and act as
 * placeholders for the types of the arguments passed to the generic method,
 * which are known as actual type arguments.
 * 
 * Note that type parameters can represent only reference types, not primitive
 * types (like int, double and char).
 */
public class GenericMethods {

	public static void main(String args[]) {
		// Create arrays of Integer, Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		System.out.println("Array integerArray contains:");
		printArray(intArray);
		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);
		System.out.println("\nArray characterArray contains:");
		printArray(charArray);

		System.out.println();
		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, boundedTypeParameters(3, 4, 5));
		System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, boundedTypeParameters(6.6, 8.8, 7.7));
		System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
				boundedTypeParameters("pear", "apple", "orange"));
	}

	/**
	 * There may be times when you'll want to restrict the kinds of types that are
	 * allowed to be passed to a type parameter. For example, a method that operates
	 * on numbers might only want to accept instances of Number or its subclasses.
	 * This is what bounded type parameters are for.
	 * 
	 * Following example illustrates how extends is used in a general sense to mean
	 * either "extends" (as in classes) or "implements" (as in interfaces).
	 */
	public static <T extends Comparable<T>> T boundedTypeParameters(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
}
