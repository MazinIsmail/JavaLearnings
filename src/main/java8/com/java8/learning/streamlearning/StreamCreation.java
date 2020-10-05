package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamCreation {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");

		// Using Collection
		Stream<String> stream = list.stream();

		/**
		 * Create stream from an array: The Stream.of() and Arrays.stream() are two
		 * commonly used methods for creating a sequential stream from a specified
		 * array. Both these methods returns a Stream when called with a non-primitive
		 * type T.
		 */
		/**
		 * 
		 * Create a stream from specified values Stream.of(T…t) method can be used to
		 * create a stream with the specified t values, where t are the elements. This
		 * method returns a sequential Stream containing the t elements.
		 */
		Stream<Integer> streamOf = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Get the array
		String[] arr = new String[] { "a", "b", "c" };
		// Create stream from an array using Arrays.stream()
		Stream<String> streamOfArray = Arrays.stream(arr);

		// Create stream from an array using Stream.empty()
		Stream<String> streamEmpty = Stream.empty();

		/*
		 * Create a Stream using Stream.builder()
		 * 
		 * The builder() method is used when the desired type should be additionally
		 * specified in the right part of the statement, otherwise the build() method
		 * will create an instance of the Stream.
		 */
		// Create stream using Stream builder()
		Stream.Builder<String> builder = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> streamBuilder = builder.add("a").add("b").add("c").build();

		/**
		 * Create an infinite Stream using Stream.iterate()
		 * 
		 * The iterate() method returns an infinite sequential ordered Stream produced
		 * by iterative application of a function f to an initial element seed.
		 */
		// Get the seed value
		int seedValue = 2;
		// Get the limit for number of terms
		int limitTerms = 5;

		/**
		 * Returns an infinite sequential ordered Stream produced by iterative
		 * application of a function f to an initial element seed,producing a Stream
		 * consisting of seed, f(seed), f(f(seed)), etc.
		 */
		Stream.iterate(seedValue, (Integer n) -> n * n).limit(limitTerms).forEach(System.out::println);

		/**
		 * Create an infinite Stream using Stream.generate() method
		 * 
		 * The generate() method accepts a Supplier for generating elements and the
		 * resulting stream is infinite. So to restrict it, specify the desired size or
		 * the generate() method will work until it reaches the memory limit.
		 */
		// Get the limit for number of terms
		int limitTermsGenerate = 5;
		Stream.generate(Math::random).limit(limitTermsGenerate).forEach(System.out::println);

		/**
		 * Create stream from a Pattern using Predicate
		 * 
		 * In java 8, the Predicate asPredicate() method of Pattern creates a predicate
		 * boolean-valued function that is used for pattern matching.
		 */
		List<String> listStrings = Arrays.asList("Geeks", "For", "Geek", "GeeksForGeeks", "A Computer Portal");

		// Get the pattern
		Pattern pattern = Pattern.compile("^G");
		list.stream().filter(pattern.asPredicate()).forEach(System.out::println);

		/**
		 * Create stream from Iterator
		 * 
		 * Iterators, in Java, are used in Collection Framework to retrieve elements one
		 * by one. Spliterator is the key to create the sequential stream. Hence in this
		 * method also, Spliterator is used. But in this method, the source of
		 * Spliterator is set to an Iterable created from the Iterator. So first the
		 * Iterable is created from the Iterator. Then the Spliterator is passed to the
		 * stream() method directly as Iterable.spliterator().
		 */
		// Get the Iterator
		Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
		// Convert the iterator into a Spliterator
		Spliterator<String> spliterator = Spliterators.spliteratorUnknownSize(iterator, Spliterator.NONNULL);
		// Convert spliterator into a sequential stream
		Stream<String> streamSupport = StreamSupport.stream(spliterator, false);
		// Iterate list first to last element
		Iterator<String> it = streamSupport.iterator();
		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		/**
		 * Create stream from Iterable
		 * 
		 * Iterable interface is designed keeping in mind and does not provide any
		 * stream() method on its own. Simply it can be passed into
		 * StreamSupport.stream() method, and get a Stream from the given Iterable
		 * object. It is easier to turn an Iterable into a Stream. Iterable has a
		 * default method spliterator(), which can be used to get a Spliterator
		 * instance, which can be in turn then converted to a Stream.
		 * 
		 * Note: The Iterable is not a instance of Collection, this method internally
		 * calls StreamSupport.stream() to get a sequential Stream from Spliterator else
		 * it simply calls Collection.stream() method.
		 */
		Iterable<String> iterable = Arrays.asList("a", "b", "c");
		// Convert the iterator into a Stream
		stream = StreamSupport.stream(iterable.spliterator(), false);
		// Iterate list first to last element
		it = stream.iterator();

		// Iterate stream object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
