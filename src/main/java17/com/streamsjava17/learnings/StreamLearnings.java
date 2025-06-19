package com.streamsjava17.learnings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLearnings {
	public static void main(String[] args) {
		Stream<String> stringStream = Stream.of("a", "b", "c");

		// In order to convert a Stream to a List, you need to call the collect method
		// with Collectors.toList()
		List<String> stringList = stringStream.collect(Collectors.toList());
		for (String s : stringList) {
			System.out.print(s);
		}

		System.out.println();
		// In Java 17, a toList method is added which replaces the old behaviour.
		Stream<String> stringNewStream = Stream.of("a", "b", "c");
		List<String> stringNewList = stringNewStream.toList();
		for (String s : stringNewList) {
			System.out.print(s);
		}
	}
}
