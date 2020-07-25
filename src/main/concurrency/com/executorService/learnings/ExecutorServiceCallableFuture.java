package com.executorService.learnings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCallableFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		List<Future<Integer>> futureList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Future<Integer> future = executorService.submit(new CallableSample());
			futureList.add(future);
		}

		// Now you have 100 futures and 100 placeholder.

		System.out.println("Mazin Ismail");

		for (Future<Integer> future : futureList) {
			// get() method is blocking operation until future returns a value.
			Integer returnValue = future.get();

			// Avoid the above problem using get with timeout
			// Integer returnValue = future.get(10, TimeUnit.SECONDS);

			/**
			 * Attempts to cancel execution of this task. This attempt will fail if the task
			 * has already completed, has already been cancelled, or could not be cancelled
			 * for some other reason. If successful, and this task has not started when
			 * cancel is called, this task should never run. If the task has already
			 * started, then the mayInterruptIfRunning parameter determines whether the
			 * thread executing this task should be interrupted in an attempt to stop the
			 * task. After this method returns, subsequent calls to isDone() will always
			 * return true. Subsequent calls to isCancelled()will always return true if this
			 * method returned true.
			 */
			// future.cancel(true);

			/**
			 * Returns true if this task completed. Completion may be due to normal
			 * termination, an exception, or cancellation -- in all of these cases, this
			 * method will return true.
			 */
			future.isDone();

			System.out.println("Result of future of " + future.hashCode() + " = " + returnValue);
		}

		System.out.println("Mazin Ismail");

	}
}
