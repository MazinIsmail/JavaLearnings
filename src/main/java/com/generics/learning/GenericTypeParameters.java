package com.generics.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Type Parameters
 * 
 * The type parameters naming conventions are important to learn generics
 * thoroughly. The common type parameters are as follows:
 * 
 * T - Type
 * 
 * E – Element (used extensively by the Java Collections Framework, for example
 * ArrayList, Set etc.)
 * 
 * K – Key (Used in Map)
 * 
 * N - Number
 * 
 * V – Value (Used in Map)
 * 
 * S,U,V etc. – 2nd, 3rd, 4th types
 * 
 * Wildcard in Java Generics:-
 * 
 * The ? (question mark) symbol represents the wildcard element. It means any
 * type. If we write <? extends Number>, it means any child class of Number,
 * e.g., Integer, Float, and double. Now we can call the method of Number class
 * through any child class object.
 * 
 * We can use a wildcard as a type of a parameter, field, return type, or local
 * variable. However, it is not allowed to use a wildcard as a type argument for
 * a generic method invocation, a generic class instance creation, or a
 * supertype.
 * 
 * Upper Bounded Wildcards: The purpose of upper bounded wildcards is to
 * decrease the restrictions on a variable. It restricts the unknown type to be
 * a specific type or a subtype of that type. Syntax: List<? extends Number>
 * 
 * Unbounded Wildcards: The unbounded wildcard type represents the list of an
 * unknown type such as List<?>. This approach can be useful in the following
 * scenarios: - When the given method is implemented by using the functionality
 * provided in the Object class. When the generic class contains the methods
 * that don't depend on the type parameter.
 * 
 * Lower Bounded Wildcards: The purpose of lower bounded wildcards is to
 * restrict the unknown type to be a specific type or a supertype of that type.
 * It is used by declaring wildcard character ("?") followed by the super
 * keyword, followed by its lower bound. Syntax List<? super Integer>
 */
public class GenericTypeParameters {

	public static void main(String[] args) {
		System.out.println("upperBoundedWildcardExample:-");
		upperBoundedWildcardExample();
		System.out.println();
		System.out.println("unboundedWildcardExample:-");
		unboundedWildcardExample();
		System.out.println();
		System.out.println("lowerBoundWildcardExample:-");
		lowerBoundWildcardExample();
	}

	private static Double upperBounded(ArrayList<? extends Number> num) {
		double sum = 0.0;
		for (Number n : num) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}

	public static void upperBoundedWildcardExample() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		System.out.println("displaying the sum= " + upperBounded(l1));
		ArrayList<Double> l2 = new ArrayList<Double>();
		l2.add(30.0);
		l2.add(40.0);
		System.out.println("displaying the sum= " + upperBounded(l2));
	}

	public static void unboundedWildcardExample() {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		System.out.println("displaying the Integer values");
		unbounded(l1);
		List<String> l2 = Arrays.asList("One", "Two", "Three");
		System.out.println("displaying the String values");
		unbounded(l2);
	}

	public static void unbounded(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

	public static void lowerBoundWildcard(List<? super Integer> list) {
		for (Object n : list) {
			System.out.println(n);
		}
	}

	public static void lowerBoundWildcardExample() {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		System.out.println("displaying the Integer values");
		lowerBoundWildcard(l1);
		List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
		System.out.println("displaying the Number values");
		lowerBoundWildcard(l2);
	}
}
