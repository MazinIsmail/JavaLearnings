package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The Stream API allows "streaming" of collections for dynamic processing.
 * Streams allow concurrent and parallel computation on data (using internal
 * iterations), to support database-like operations such as grouping and
 * filtering the data (similar to GROUP BY and WHERE clause in SQL). This allows
 * the developers to focus on "what data is needed" instead of "how data is
 * needed" since streaming hides the details of the implementation and provides
 * the result. This is done by providing predicates as inputs to functions
 * operating at runtime upon the streams of collections.
 */
public class StreamLearning {
	public static void main(String[] args) {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		// Filter accepts a predicate to filter all elements of the stream.
		stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);

		System.out.println();

		// Sorted is an intermediate operation which returns a sorted view of
		// the stream.
		stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);

		System.out.println();

		// The intermediate operation map converts each element into another
		// object via the given function.
		stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);

		System.out.println();

		// Various matching operations can be used to check whether a certain
		// predicate matches the stream.
		boolean anyStartsWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
		System.out.println(anyStartsWithA); // true
		boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
		System.out.println(allStartsWithA); // false
		boolean noneStartsWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));
		System.out.println(noneStartsWithZ); // true

		System.out.println();

		// Count is a terminal operation returning the number of elements in the
		// stream as a long.
		long startsWithB = stringCollection.stream().count();
		System.out.println(startsWithB); // 3

		System.out.println();

		// This terminal operation performs a reduction on the elements of the
		// stream with the given function. The result is an Optional holding the
		// reduced value.
		Optional<String> reduced = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
		// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
	}
}
