package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Terminal Operations
 * 
 * The terminal operations of the Java Stream interface typicall return a single
 * value. Once the terminal operation is invoked on a Stream, the iteration of
 * the Stream and any of the chained streams will get started. Once the
 * iteration is done, the result of the terminal operation is returned.
 * 
 * A terminal operation typically does not return a new Stream instance. Thus,
 * once you call a terminal operation on a stream, the chaining of Stream
 * instances from non-terminal operation ends.
 */
public class StreamTerminalOperations {

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
		 * It is the call to count() at the end of the example that is the terminal
		 * operation. Since count() returns a long, the Stream chain of non-terminal
		 * operations (the map() calls) is ended.
		 */
		long count = stream.map((value) -> {
			return value.toLowerCase();
		}).map((value) -> {
			return value.toUpperCase();
		}).map((value) -> {
			return value.substring(0, 3);
		}).count();

		System.out.println(count);
	}
}
