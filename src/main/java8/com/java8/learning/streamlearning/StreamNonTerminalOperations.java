package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Non-Terminal Operations:-
 * 
 * The non-terminal stream operations of the Java Stream API are operations that
 * transform or filter the elements in the stream. When you add a non-terminal
 * operation to a stream, you get a new stream back as result. The new stream
 * represents the stream of elements resulting from the original stream with the
 * non-terminal operation applied.
 */
public class StreamNonTerminalOperations {

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
		 * It is quite common to chain the calls to non-terminal operations on a Java
		 * Stream.
		 */
		stream = stringCollection.stream();
		Stream<String> stream1 = stream.map((value) -> {
			return value.toLowerCase();
		}).map((value) -> {
			return value.toUpperCase();
		}).map((value) -> {
			return value.substring(0, 3);
		});

		/**
		 * filter()
		 * 
		 * The Java Stream filter() can be used to filter out elements from a Java
		 * Stream. The filter method takes a Predicate which is called for each element
		 * in the stream. If the element is to be included in the resulting Stream, the
		 * Predicate should return true. If the element should not be included, the
		 * Predicate should return false.
		 */
		System.out.println("Start :: filter()");
		stream = stringCollection.stream();
		Stream<String> longStringsStream = stream.filter((value) -> {
			return value.length() > 3;
		});
		longStringsStream.forEach(System.out::println);
		System.out.println("End :: filter()");

		/**
		 * map()
		 * 
		 * The Java Stream map() method converts (maps) an element to another object.
		 * For instance, if you had a list of strings it could convert each string to
		 * lowercase, uppercase, or to a substring of the original string, or something
		 * completely else.
		 */
		System.out.println("Start :: map()");
		stream = stringCollection.stream();
		Stream<String> streamMapped = stream.map((value) -> value.toUpperCase());
		streamMapped.forEach(System.out::println);
		System.out.println("End :: map()");

		/**
		 * flatMap()
		 * 
		 * The Java Stream flatMap() methods maps a single element into multiple
		 * elements. The idea is that you "flatten" each element from a complex
		 * structure consisting of multiple internal elements, to a "flat" stream
		 * consisting only of these internal elements.
		 * 
		 * For instance, imagine you have an object with nested objects (child objects).
		 * Then you can map that object into a "flat" stream consisting of itself plus
		 * its nested objects - or only the nested objects. You could also map a stream
		 * of Lists of elements to the elements themselves. Or map a stream of strings
		 * to a stream of words in these strings - or to the individual Character
		 * instances in these strings.
		 * 
		 * Note that this example finishes with a call to forEach() which is a terminal
		 * operation. This call is only there to trigger the internal iteration, and
		 * thus flat map operation. If no terminal operation was called on the Stream
		 * chain, nothing would have happened. No flat mapping would actually have taken
		 * place.
		 */
		System.out.println("Start :: flatMap()");
		List<String> stringList = new ArrayList<String>();
		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		Stream<String> streamStringList = stringList.stream();
		streamStringList.flatMap((value) -> {
			String[] split = value.split(" ");
			Stream<String> streamLocal = (Stream<String>) Arrays.asList(split).stream();
			return streamLocal;
		}).forEach((value) -> System.out.println(value));
		System.out.println("End :: flatMap()");
		System.out.println();

		/**
		 * distinct()
		 * 
		 * The Java Stream distinct() method is a non-terminal operation that returns a
		 * new Stream which will only contain the distinct elements from the original
		 * stream. Any duplicates will be eliminated.
		 */
		stringList = new ArrayList<String>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");
		stream = stringList.stream();
		List<String> distinctStrings = stream.distinct().collect(Collectors.toList());
		System.out.println("distinctStrings :: " + distinctStrings);

		/**
		 * limit()
		 * 
		 * The Java Stream limit() method can limit the number of elements in a stream
		 * to a number given to the limit() method as parameter. The limit() method
		 * returns a new Stream which will at most contain the given number of elements.
		 */
		System.out.println("Start :: limit()");
		stream = stringList.stream();
		stream.limit(2).forEach(element -> {
			System.out.println(element);
		});
		System.out.println("End :: limit()");

		/**
		 * peek()
		 * 
		 * The Java Stream peek() method is a non-terminal operation that takes a
		 * Consumer (java.util.function.Consumer) as parameter. The Consumer will get
		 * called for each element in the stream. The peek() method returns a new Stream
		 * which contains all the elements in the original stream.
		 * 
		 * The purpose of the peek() method is, as the method says, to peek at the
		 * elements in the stream, not to transform them. Keep in mind that the peek
		 * method does not start the internal iteration of the elements in the stream.
		 * You need to call a terminal operation for that.
		 */
		System.out.println("Start :: peek()");
		stream = stringList.stream();
		// peek method does not start the internal iteration of the elements in the
		// stream. You need to call a terminal operation for that.
		Stream<String> streamPeeked = stream.peek((value) -> {
			System.out.println("value");
		});
		System.out.println("End :: peek()");
	}
}
