package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Stream API allows "streaming" of collections for dynamic processing.
 * Streams allow concurrent and parallel computation on data (using internal
 * iterations), to support database-like operations such as grouping and
 * filtering the data (similar to GROUP BY and WHERE clause in SQL). This allows
 * the developers to focus on "what data is needed" instead of "how data is
 * needed" since streaming hides the details of the implementation and provides
 * the result. This is done by providing predicates as inputs to functions
 * operating at runtime upon the streams of collections.
 * 
 * Java Stream API is for processing streams of objects - not bytes.
 * 
 * The Java Stream API provides a functional approach to processing collections
 * of objects. The Java Stream API was added in Java 8 along with several other
 * functional programming features.
 * 
 * Stream Processing:-
 * 
 * You can attach listeners to a Stream. These listeners are called when the
 * Stream iterates the elements internally. The listeners are called once for
 * each element in the stream. That way each listener gets to process each
 * element in the stream. This is referred to as stream processing.
 * 
 * The listeners of a stream form a chain. The first listener in the chain can
 * process the element in the stream, and then return a new element for the next
 * listener in the chain to process. A listener can either return the same
 * element or a new, depending on what the purpose of that listener (processor)
 * is.
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

		// Obtain a Stream. Calls the stream() method to obtain a Stream instance.
		Stream<String> stream = stringCollection.stream();

		/**
		 * Terminal and Non-Terminal Operations:-
		 * 
		 * The Stream interface has a selection of terminal and non-terminal operations.
		 * A non-terminal stream operation is an operation that adds a listener to the
		 * stream without doing anything else. A terminal stream operation is an
		 * operation that starts the internal iteration of the elements, calls all the
		 * listeners, and returns a result.
		 * 
		 * The call to the map() method of the Stream interface is a non-terminal
		 * operation. It merely sets a lambda expression on the stream which converts
		 * each element to lowercase.
		 * 
		 * The call to the count() method is a terminal operation. This call starts the
		 * iteration internally, which will result in each element being converted to
		 * lowercase and then counted.
		 */
		long count = stream.map((value) -> {
			return value.toLowerCase();
		}).count();

		/**
		 * Concatenate Streams
		 * 
		 * The Java Stream interface contains a static method called concat() which can
		 * concatenate two streams into one. The result is a new Stream which contains
		 * all of the elements from the first stream, followed by all of the elements
		 * from the second stream.
		 */
		List<String> stringList = new ArrayList<String>();
		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		Stream<String> stream1 = stringList.stream();
		List<String> stringList2 = new ArrayList<>();
		stringList2.add("Lord of the Rings");
		stringList2.add("Planet of the Rats");
		stringList2.add("Phantom Menace");
		Stream<String> stream2 = stringList2.stream();
		Stream<String> concatStream = Stream.concat(stream1, stream2);
		List<String> stringsAsUppercaseList = concatStream.collect(Collectors.toList());
		System.out.println(stringsAsUppercaseList);

		/**
		 * Create Stream From Array
		 * 
		 * The Java Stream interface contains a static method called of() which can be
		 * used to create a Stream from one or more objects.
		 */
		Stream<String> streamOf = Stream.of("one", "two", "three");

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
