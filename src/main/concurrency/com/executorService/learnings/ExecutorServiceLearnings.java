package com.executorService.learnings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceLearnings {
	public static void main(String[] args) {

		/**
		 * Thread-pool: Blocking Queue because it is thread safe.
		 */

		/*
		 * Creates a ExecutorService object having a pool of 10 threads.
		 */
		ExecutorService executorService1 = Executors.newFixedThreadPool(10);

		/*
		 * Creates a scheduled thread pool executor with 10 threads. In scheduled thread
		 * pool, we can schedule tasks of the threads.
		 */
		ExecutorService executorService2 = Executors.newScheduledThreadPool(10);

		/*
		 * Thread-pool: Synchronous Queue
		 * 
		 * Creates a thread pool that creates new threads as needed, but will reuse
		 * previously constructed threads when they are available. These pools will
		 * typically improve the performance of programs that execute many short-lived
		 * asynchronous tasks. Calls to execute will reuse previously constructed
		 * threads if available. If no existing thread is available, a new thread will
		 * be created and added to the pool. Threads that have not been used for sixty
		 * seconds are terminated and removed from the cache. Thus, a pool that remains
		 * idle for long enough will not consume any resources.
		 */
		ExecutorService executorService3 = Executors.newCachedThreadPool();

		/**
		 * Creates an Executor that uses a single worker thread operating off an
		 * unbounded queue. (Note however that if this single thread terminates due to a
		 * failure during execution prior to shutdown, a new one will take its place if
		 * needed to execute subsequent tasks.) Tasks are guaranteed to execute
		 * sequentially, and no more than one task will be active at any given time.
		 * Unlike the otherwise equivalent newFixedThreadPool(1) the returned executor
		 * is guaranteed not to be reconfigurable to use additional threads.
		 */
		ExecutorService executorService4 = Executors.newSingleThreadExecutor();

	}
}
