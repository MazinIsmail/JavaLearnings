package com.java8.functionalProgrammingBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * In Java 8 Oracle made an effort to make functional programming easier, and
 * this effort did succeed to some extent.
 * 
 * Functional programming contains the following key concepts:-
 * 
 * Functions as first class objects: It means that function actually inherits
 * from Object. So that you can pass it around and work with it like with any
 * other object. In JavaScript, functions are first-class objects, because they
 * can have properties and methods just like any other object. In Java, methods
 * are not first class objects. The closest we get is Java Lambda Expressions.
 * 
 * Pure functions: A function is a pure function if:- 1. The execution of the
 * function has no side effects. 2. The return value of the function depends
 * only on the input parameters passed to the function.
 * 
 * Higher order functions: A function is a higher order function if at least one
 * of the following conditions are met:- 1. The function takes one or more
 * functions as parameters. 2. The function returns another function as result.
 * 
 * 
 * Pure functional programming has a set of rules to follow too:-
 * 
 * No state
 * 
 * No side effects
 * 
 * Immutable variables
 * 
 * Favour recursion over looping
 */
public class FunctionalProgrammingBasics {
	public static void main(String[] args) {

	}

	/**
	 * Here is an example of a pure function (method) in Java. Notice how the return
	 * value of the sum() function only depends on the input parameters. Notice also
	 * that the sum() has no side effects, meaning it does not modify any state
	 * (variables) outside the function anywhere.
	 * 
	 * No State:-
	 * 
	 * By "no state" is typically meant no state external to the function. A
	 * function may have local variables containing temporary state internally, but
	 * the function cannot reference any member variables of the class or object the
	 * function belongs to.
	 * 
	 * No Side Effects:-
	 * 
	 * Another rule in the functional programming paradigm is that of no side
	 * effects. This means, that a function cannot change any state outside of the
	 * function. Changing state outside of a function is referred to as a side
	 * effect.
	 * 
	 * State outside of a function refers both to member variables in the class or
	 * object the function, and member variables inside parameters to the functions,
	 * or state in external systems like file systems or databases.
	 * 
	 * Immutable Variables:-
	 * 
	 * A third rule in the functional programming paradigm is that of immutable
	 * variables. Immutable variables makes it easier to avoid side effects.
	 * 
	 * Favour Recursion Over Looping:-
	 * 
	 * A fourth rule in the functional programming paradigm is to favour recursion
	 * over looping. Recursion uses function calls to achieve looping, so the code
	 * becomes more functional.
	 * 
	 * Another alternative to loops is the Java Streams API. This API is
	 * functionally inspired.
	 * 
	 */
	public int sum(int a, int b) {
		return a + b;
	}

	/**
	 * Example of a non-pure function. Notice how the method add() uses a member
	 * variable to calculate its return value, and it also modifies the state of the
	 * value member variable, so it has a side effect.
	 */
	public class ObjectWithNonPureFunction {
		private int value = 0;

		public int add(int nextValue) {
			this.value += nextValue;
			return this.value;
		}
	}

	/**
	 * In Java, the closest we can get to a higher order function is a function
	 * (method) that takes one or more lambda expressions as parameters, and returns
	 * another lambda expression.
	 * 
	 * Notice how the createFactory() method returns a lambda expression as result.
	 * This is the first condition of a higher order function.
	 * 
	 * Notice also that the createFactory() method takes two instances as parameters
	 * which are both implementations of interfaces (IProducer and IConfigurator).
	 * Java lambda expressions have to implement a functional interface.
	 * 
	 * As you can see, all of the interfaces are functional interfaces. Therefore
	 * they can be implemented by Java lambda expressions - and therefore the
	 * createFactory() method is a higher order function.
	 */
	public class HigherOrderFunctionClass {

		public <T> IFactorySample<T> createFactory(IProducerSample<T> producer, IConfiguratorSample<T> configurator) {
			return () -> {
				T instance = producer.produce();
				configurator.configure(instance);
				return instance;
			};
		}
	}

	/**
	 * Example of a higher order function is the Collections.sort() method which
	 * takes a Comparator as parameter.
	 * 
	 * The Collection.sort() takes two parameters. The first parameter is a List and
	 * second parameter is a lambda (function). The lambda parameter is what makes
	 * Collections.sort() a higher order function.
	 */
	public void higherOrderExample() {
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Abc");
		list.add("BCD");
		Collections.sort(list, (String a, String b) -> {
			return a.compareTo(b);
		});
		System.out.println(list);

		/**
		 * Here is another example of a higher order function. This time it is a
		 * function that returns another function as result. Here is the Java higher
		 * order function example:
		 */
		Comparator<String> comparator = (String a, String b) -> {
			return a.compareTo(b);
		};

		// Because the reversed() method returns a lambda (function), the reversed()
		// method is considered a higher order function.
		Comparator<String> comparatorReversed = comparator.reversed();
		Collections.sort(list, comparatorReversed);
		System.out.println(list);
	}
}
