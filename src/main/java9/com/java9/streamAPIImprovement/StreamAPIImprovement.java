package com.java9.streamAPIImprovement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIImprovement {
	public static void main(String[] args) {

		streamTakeWhileMethod();

		streamDropWhileMethod();

		streamOfNullableMethod();

		streamIterateMethod();
	}

	/**
	 * Stream Iterate Method
	 * 
	 * A new overloaded method iterate is added to the Java 9 stream interface. This
	 * method allows us to iterate stream elements till the specified condition.
	 * 
	 * It takes three arguments, seed, hasNext and next.
	 */
	private static void streamIterateMethod() {
		Stream.iterate(1, i -> i <= 10, i -> i * 3).forEach(System.out::println);
	}

	/**
	 * The ofNullable() method is a static method of Stream class that returns a
	 * sequential Stream containing a single element if non-null, otherwise returns
	 * an empty. Java 9 has introduced this method to avoid NullPointerExceptions
	 * and also avoid null checks of streams. The main objective of using the
	 * ofNullable() method is to return an empty option if the value is null.
	 */
	private static void streamOfNullableMethod() {
		System.out.println("streamOfNullableMethod:-");
		System.out.println("ofNullable: ");
		int count = (int) Stream.ofNullable(5000).count();
		System.out.println("count: " + count);
		System.out.println("ofNullable: ");
		count = (int) Stream.ofNullable(null).count();
		System.out.println("count: " + count);

		String str = null;
		// prints nothing in the console
		Stream.ofNullable(str).forEach(System.out::println);
		str = "Mazin Ismail";
		Stream.ofNullable(str).forEach(System.out::println);
	}

	/**
	 * Stream dropWhile() Method
	 * 
	 * Stream dropWhile method returns result on the basis of order of stream
	 * elements.
	 * 
	 * Ordered stream: It returns a stream that contains elements after dropping the
	 * elements that match the given predicate.
	 * 
	 * Unordered stream: It returns a stream that contains remaining elements of
	 * this stream after dropping a subset of elements that match the given
	 * predicate.
	 */
	private static void streamDropWhileMethod() {
		List<Integer> list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println("streamDropWhileMethod: " + list);
	}

	/**
	 * Stream takeWhile() Method
	 * 
	 * Stream takeWhile method takes each element that matches its predicate. It
	 * stops when it get unmatched element. It returns a subset of elements that
	 * contains all matched elements, other part of stream is discarded.
	 */
	private static void streamTakeWhileMethod() {
		System.out.println("streamTakeWhileMethod:- ");
		List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());

		// This example returns an empty list because it fails at first list element,
		// and takewhile stops here.
		System.out.println(list);

		list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list);
	}
}
