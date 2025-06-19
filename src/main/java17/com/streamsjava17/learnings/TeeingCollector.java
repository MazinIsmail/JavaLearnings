package com.streamsjava17.learnings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java 12 introduced a new static method to Collectors interface which can
 * perform two different operations on collection and then merge the result.
 * 
 * Teeing collectors allow you to combine the results of two different
 * collectors into a single result. This is useful when you want to perform two
 * different operations on a stream and then combine the results into a single
 * result.
 * 
 */
public class TeeingCollector {
	public static void main(String[] args) {
		double mean = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(
				Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (sum, n) -> sum / n));

		System.out.println(mean);
	}
}
