package com.java8.learning.streamlearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsProblemsAndSolutions {
	public static void main(String[] args) {

		String[] stringArray = { "sd", "ds" };
		// stream from an existing array
		List<String> stringList = Arrays.asList(stringArray);
		Stream<String> stringStream = stringList.stream();
		// convert streams to array
		Object[] stringArrayFromStream = stringStream.toArray();

		stringStream = Stream.of(stringArray[0], stringArray[1]);

		// Using Stream.builder()
		Stream.Builder<String> stringStreamBuilder = Stream.builder();
		stringStreamBuilder.accept(stringArray[0]);
		stringStreamBuilder.accept(stringArray[1]);
		stringStream = stringStreamBuilder.build();

		IntStream.rangeClosed(1, 1000).boxed().filter(x -> x % 3 == 0).map(n -> n * n).collect(Collectors.toList());
	}
}
