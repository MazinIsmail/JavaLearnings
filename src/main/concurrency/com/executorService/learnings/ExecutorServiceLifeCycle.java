package com.executorService.learnings;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceLifeCycle {
	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new RunnableSample());

		/**
		 * Initiates an orderly shutdown in which previously submitted tasks are
		 * executed, but no new tasks will be accepted. Invocation has no additional
		 * effect if already shut down. This method does not wait for previously
		 * submitted tasks to complete execution. Use awaitTerminationto do that
		 */
		executorService.shutdown();

		// Returns true if this executor has been shut down.
		boolean checkShoutdown = executorService.isShutdown();

		/**
		 * Returns true if all tasks have completed following shut down.Note that
		 * isTerminated is never true unless either shutdown or shutdownNow was called
		 * first.
		 */
		boolean checkTerminated = executorService.isTerminated();

		/**
		 * Blocks until all tasks have completed execution after a shutdown request, or
		 * the timeout occurs, or the current thread is interrupted, whichever happens
		 * first.
		 */
		executorService.awaitTermination(10, TimeUnit.SECONDS);

		/**
		 * Attempts to stop all actively executing tasks, halts the processing of
		 * waiting tasks, and returns a list of the tasks that were awaiting execution.
		 * This method does not wait for actively executing tasks to terminate. Use
		 * awaitTermination to do that.
		 * 
		 * There are no guarantees beyond best-effort attempts to stop processing
		 * actively executing tasks. For example, typical implementations will cancel
		 * via Thread.interrupt(), so any task that fails to respond to interrupts may
		 * never terminate.
		 * 
		 * Returns: list of tasks that never commenced execution
		 */
		List<Runnable> runnableList = executorService.shutdownNow();
	}
}
