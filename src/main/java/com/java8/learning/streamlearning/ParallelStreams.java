package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
	}
}
