package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

/**
 * In a parallel stream, the operations are executed in parallel and there are
 * two ways to create a parallel stream.
 * 
 * Using the parallelStream() method on a collection
 * 
 * Using the parallel() method on a stream
 * 
 * Stream implementation in Java is by default sequential unless until it is
 * explicitly mentioned in parallel. When a stream executes in parallel, the
 * Java runtime partitions the stream into multiple sub-streams. Aggregate
 * operations iterate over and process these sub-streams in parallel and then
 * combine the results.
 */
public class ParallelStreams {
	public static void main(String[] args) {
		int max = 1000000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}

		long count = values.parallelStream().sorted().count();
		System.out.println(count);

		IntStream range = IntStream.rangeClosed(1, 10);
		IntStream rangeParallel = range.parallel();
		System.out.println("Stream running in parallel: " + rangeParallel.isParallel());
		rangeParallel.parallel().forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
		});
	}
}
