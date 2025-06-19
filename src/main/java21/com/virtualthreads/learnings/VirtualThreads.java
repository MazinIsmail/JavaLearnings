package com.virtualthreads.learnings;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Virtual Threads
 * 
 * Virtual threads are lightweight threads. Dramatically reduce the effort of
 * writing, maintaining, and observing high-throughput concurrent applications.
 * 
 * Up till now, threads were implemented as wrappers around Operating System
 * (OS) threads. OS threads are costly.
 * 
 */
public class VirtualThreads {

	public static void main(String[] args) {
		/*
		 * platformThreads(1000); platformThreads(10_000); platformThreads(100_000);
		 * platformThreads(1_000_000);
		 */
		virtualThreads(1000);
		virtualThreads(10_000);
		virtualThreads(100_000);
		virtualThreads(1_000_000);
	}

	private static void platformThreads(int maximum) {
		long time = System.currentTimeMillis();
		try (var executor = Executors.newCachedThreadPool()) {
			IntStream.range(0, maximum).forEach(i -> {
				executor.submit(() -> {
					Thread.sleep(Duration.ofSeconds(1));
					return i;
				});
			});
		}
		time = System.currentTimeMillis() - time;
		System.out.println("Number of threads = " + maximum + ", Duration(ms) = " + time);
	}

	// Virtual threads are lightweight threads
	// They are implemented on top of platform threads
	// They are not tied to the OS threads
	private static void virtualThreads(int maximum) {
		long time = System.currentTimeMillis();
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			IntStream.range(0, maximum).forEach(i -> {
				executor.submit(() -> {
					Thread.sleep(Duration.ofSeconds(1));
					return i;
				});
			});
		}
		time = System.currentTimeMillis() - time;
		System.out.println("Number of threads = " + maximum + ", Duration(ms) = " + time);
	}
}
