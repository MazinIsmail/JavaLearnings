package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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
		System.out.println("count: " + count);

		/**
		 * anyMatch()
		 * 
		 * The Java Stream anyMatch() method is a terminal operation that takes a single
		 * Predicate as parameter, starts the internal iteration of the Stream, and
		 * applies the Predicate parameter to each element. If the Predicate returns
		 * true for any of the elements, the anyMatch() method returns true. If no
		 * elements match the Predicate, anyMatch() will return false.
		 */
		List<String> stringList = new ArrayList<String>();
		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		Stream<String> streamStringList = stringList.stream();
		boolean anyMatch = streamStringList.anyMatch((value) -> {
			return value.startsWith("One");
		});
		System.out.println("anyMatch: " + anyMatch);

		/**
		 * allMatch()
		 * 
		 * The Java Stream allMatch() method is a terminal operation that takes a single
		 * Predicate as parameter, starts the internal iteration of elements in the
		 * Stream, and applies the Predicate parameter to each element. If the Predicate
		 * returns true for all elements in the Stream, the allMatch() will return true.
		 * If not all elements match the Predicate, the allMatch() method returns false.
		 */
		stringList = new ArrayList<String>();
		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		stream = stringList.stream();
		boolean allMatch = stream.allMatch((value) -> {
			return value.startsWith("One");
		});
		System.out.println("allMatch: " + allMatch);

		/**
		 * noneMatch()
		 * 
		 * The Java Stream noneMatch() method is a terminal operation that will iterate
		 * the elements in the stream and return true or false, depending on whether no
		 * elements in the stream matches the Predicate passed to noneMatch() as
		 * parameter. The noneMatch() method will return true if no elements are matched
		 * by the Predicate, and false if one or more elements are matched.
		 */
		stringList = new ArrayList<String>();
		stringList.add("abc");
		stringList.add("def");
		stream = stringList.stream();
		boolean noneMatch = stream.noneMatch((element) -> {
			return "xyz".equals(element);
		});
		System.out.println("noneMatch: " + noneMatch);

		/**
		 * collect()
		 * 
		 * The Java Stream collect() method is a terminal operation that starts the
		 * internal iteration of elements, and collects the elements in the stream in a
		 * collection or object of some kind.
		 * 
		 * The collect() method takes a Collector (java.util.stream.Collector) as
		 * parameter.
		 * 
		 * Collectors.toList() simply collects all elements in the stream in a standard
		 * Java List
		 */
		stringList = new ArrayList<String>();
		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		stream = stringList.stream();
		List<String> stringsAsUppercaseList = stream.map(value -> value.toUpperCase()).collect(Collectors.toList());
		System.out.println("stringsAsUppercaseList: " + stringsAsUppercaseList);

		/**
		 * count()
		 * 
		 * The Java Stream count() method is a terminal operation which starts the
		 * internal iteration of the elements in the Stream, and counts the elements.
		 */
		stringList = new ArrayList<String>();
		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		stream = stringList.stream();
		count = stream.flatMap((value) -> {
			String[] split = value.split(" ");
			return (Stream<String>) Arrays.asList(split).stream();
		}).count();

		System.out.println("count: " + count);

		/**
		 * findAny()
		 * 
		 * The Java Stream findAny() method can find a single element from the Stream.
		 * The element found can be from anywhere in the Stream. There is no guarantee
		 * about from where in the stream the element is taken.
		 * 
		 * Notice how the findAny() method returns an Optional. The Stream could be
		 * empty - so no element could be returned. You can check if an element was
		 * found via the Optional isPresent() method.
		 */
		stringList = new ArrayList<String>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");
		stream = stringList.stream();
		Optional<String> anyElement = stream.findAny();
		System.out.println(anyElement.get());
	}
}
