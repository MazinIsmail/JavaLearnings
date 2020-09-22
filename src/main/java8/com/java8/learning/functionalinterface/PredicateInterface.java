package com.java8.learning.functionalinterface;

import java.util.function.Predicate;

/**
 * The Java Predicate interface, java.util.function.Predicate, represents a
 * simple function that takes a single value as parameter, and returns true or
 * false.
 */
public class PredicateInterface {

	/*
	 * Predicate functional interface definition looks:
	 * 
	 * public interface Predicate { boolean test(T t); }
	 */

	public static void main(String[] args) {
		Predicate<Integer> predicate = (value) -> value != null;
		boolean result = predicate.test(1);
		System.out.println(result);

		Predicate<Integer> greaterThanTen = (i) -> i > 10;
		// Creating predicate
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
		boolean resultCheck = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(resultCheck);
		// Calling Predicate method
		boolean resultCheck2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(resultCheck2);
	}
}
