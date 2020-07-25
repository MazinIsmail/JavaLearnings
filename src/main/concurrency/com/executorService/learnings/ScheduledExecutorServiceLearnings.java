package com.executorService.learnings;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Thread-pool Kind 3: Delay Queue
 */
public class ScheduledExecutorServiceLearnings {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// For Scheduling Task
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

		/**
		 * Creates and executes a one-shot action that becomes enabled after the given
		 * delay.
		 * 
		 * Parameters:
		 * 
		 * command - the task to execute
		 * 
		 * delay - the time from now to delay
		 * 
		 * execution unit - the time unit of the delay parameter
		 * 
		 * Returns:
		 * 
		 * A ScheduledFuture representing pending completion ofthe task and whose get()
		 * method will return null upon completion
		 * 
		 */
		ScheduledFuture<?> scheduledFuture1 = executorService.schedule(new RunnableSample(), 10, TimeUnit.SECONDS);
		scheduledFuture1.get();

		/**
		 * Creates and executes a periodic action that becomes enabled first after the
		 * given initial delay, and subsequently with the given period; that is
		 * executions will commence after initialDelay then initialDelay+period, then
		 * initialDelay + 2 * period, and so on.If any execution of the task encounters
		 * an exception, subsequent executions are suppressed. Otherwise, the task will
		 * only terminate via cancellation or termination of the executor. If any
		 * execution of this task takes longer than its period, then subsequent
		 * executions may start late, but will not concurrently execute.
		 * 
		 * Parameters:
		 * 
		 * command - the task to execute
		 * 
		 * initialDelay - the time to delay first execution
		 * 
		 * period - the period between successive executions
		 * 
		 * unit - the time unit of the initialDelay and period parameters
		 * 
		 * Returns:
		 * 
		 * A ScheduledFuture representing pending completion of the task, and whose
		 * get() method will throw an exception upon cancellation.
		 */
		// First time it will wait for 20 seconds and then trigger the task. And then it
		// will trigger the task every 10 seconds
		ScheduledFuture<?> scheduledFuture2 = executorService.scheduleAtFixedRate(new RunnableSample(), 20, 10,
				TimeUnit.SECONDS);
		scheduledFuture2.get();

		/**
		 * Creates and executes a periodic action that becomes enabled first after the
		 * given initial delay, and subsequently with the given delay between the
		 * termination of one execution and the commencement of the next. If any
		 * execution of the task encounters an exception, subsequent executions are
		 * suppressed. Otherwise, the task will only terminate via cancellation or
		 * termination of the executor.
		 * 
		 * Parameters:command - the task to execute
		 * 
		 * initialDelay - the time to delay first execution
		 * 
		 * delay - the delay between the termination of one execution and the
		 * commencement of the next
		 * 
		 * unit - the time unit of the initialDelay and delay parameters
		 * 
		 * Returns:a ScheduledFuture representing pending completion of the task, and
		 * whose get() method will throw an exception upon cancellation.
		 * 
		 */
		// First time it will wait for 20 seconds and then trigger the task. It will
		// wait for the task to complete and only then it will wait for 10 seconds and
		// then trigger the next task.
		ScheduledFuture<?> scheduledFuture3 = executorService.scheduleWithFixedDelay(new RunnableSample(), 20, 10,
				TimeUnit.SECONDS);
		scheduledFuture2.get();

		executorService.shutdown();

	}
}
