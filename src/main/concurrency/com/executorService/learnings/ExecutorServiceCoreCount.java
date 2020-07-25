package com.executorService.learnings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceCoreCount {
	public static void main(String[] args) {
		// For CPU intensive task this would be great in "ideal" scenario.
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
		System.out.println("Available Processors: " + coreCount);

		for (int i = 0; i < 5; i++) {
			executorService.execute(new RunnableSample());
		}
		executorService.shutdown();
	}
}
