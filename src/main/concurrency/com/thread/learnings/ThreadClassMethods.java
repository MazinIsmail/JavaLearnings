package com.thread.learnings;

import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Map;

public class ThreadClassMethods {
	public static void main(String[] args) throws InterruptedException {
		ThreadSample threadSample = new ThreadSample();

		/**
		 * Determines if the currently running thread has permission to modify this
		 * thread. If there is a security manager, its checkAccess method is called with
		 * this thread as its argument. This may result in throwing a SecurityException.
		 * 
		 * Throws:
		 * 
		 * SecurityException - if the current thread is not allowed to access this
		 * thread.
		 */
		threadSample.checkAccess();

		/**
		 * Returns an estimate of the number of active threads in the currentthread's
		 * thread group and its subgroups. Recursively iterates over all subgroups in
		 * the currentthread's thread group. The value returned is only an estimate
		 * because the number of threads may change dynamically while this method
		 * traverses internal data structures, and might be affected by the presence of
		 * certain system threads. This method is intended primarily for debugging and
		 * monitoring purposes.
		 */
		int count = Thread.activeCount();
		System.out.println("Thread Count: " + count);

		/**
		 * Returns: the currently executing thread.
		 */
		Thread currentlyExecutingThread = Thread.currentThread();
		System.out.println("Currently Executing Thread: " + currentlyExecutingThread);

		System.out.println("Thread.dumpStack: ");
		/**
		 * Prints a stack trace of the current thread to the standard error stream.This
		 * method is used only for debugging.
		 * 
		 * Produce Exception
		 */
		Thread.dumpStack();

		Thread th[] = new Thread[1];
		/**
		 * public static int enumerate(Thread[] tarray)
		 * 
		 * Copies into the specified array every active thread in the currentthread's
		 * thread group and its subgroups. This method simply invokes the
		 * ThreadGroup.enumerate(Thread[])method of the current thread's thread group.
		 * An application might use the activeCountmethod to get an estimate of how big
		 * the array should be, however if the array is too short to hold all the
		 * threads, the extra threads are silently ignored. If it is critical to obtain
		 * every active thread in the current thread's thread group and its subgroups,
		 * the invoker should verify that the returned int value is strictly less than
		 * the length of tarray.
		 * 
		 * Due to the inherent race condition in this method, it is recommended that the
		 * method only be used for debugging and monitoring purposes.
		 * 
		 * Parameters: tarray - an array into which to put the list of threads
		 * 
		 * Returns: the number of threads put into the array
		 */
		int numberOfThreads = Thread.enumerate(th);
		System.out.println("Number of threads put into the array: " + numberOfThreads);

		/**
		 * Returns a map of stack traces for all live threads.The map keys are threads
		 * and each map value is an array of StackTraceElement that represents the stack
		 * dump of the corresponding Thread.The returned stack traces are in the format
		 * specified for the getStackTrace method. The threads may be executing while
		 * this method is called.The stack trace of each thread only represents a
		 * snapshot and each stack trace may be obtained at different time. A
		 * zero-length array will be returned in the map value if the virtual machine
		 * has no stack trace information about a thread.
		 */
		Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
		for (Map.Entry entry : allStackTraces.entrySet()) {
			System.out.println();
			System.out.println("Key: " + entry.getKey());
			System.out.println("Values:-");
			StackTraceElement[] stackTraceElementList = (StackTraceElement[]) entry.getValue();
			for (StackTraceElement stackTraceElement : stackTraceElementList) {
				System.out.println("Value: " + stackTraceElement);
			}
		}
		/**
		 * Returns the context ClassLoader for this Thread. The contextClassLoader is
		 * provided by the creator of the thread for use by code running in this thread
		 * when loading classes and resources.If not set, the default is theClassLoader
		 * context of the parent Thread. The context ClassLoader of the primordial
		 * thread is typically set to the class loader used to load the application.
		 */
		ClassLoader classLoader = currentlyExecutingThread.getContextClassLoader();
		System.out.println("\nClassLoader: " + classLoader);

		/**
		 * Returns the default handler invoked when a thread abruptly terminates due to
		 * an uncaught exception. If the returned value is null,there is no default.
		 */
		UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
		System.out.println("\nUncaughtExceptionHandler: " + defaultUncaughtExceptionHandler);

		/**
		 * Returns the identifier of this Thread. The thread ID is a positive long
		 * number generated when this thread was created.The thread ID is unique and
		 * remains unchanged during its lifetime.When a thread is terminated, this
		 * thread ID may be reused.
		 */
		long threadId = currentlyExecutingThread.getId();
		System.out.println("\nThread Id: " + threadId);

		/*
		 * Returns this thread's name.
		 */
		String threadName = currentlyExecutingThread.getName();
		System.out.println("\nThread Name: " + threadName);

		/*
		 * Returns this thread's priority. Please Check 'ThreadPrioirty' class that I
		 * have written.
		 */
		int threadPriority = currentlyExecutingThread.getPriority();
		System.out.println("\nThread Priority: " + threadPriority);

		/*
		 * Returns this thread's priority. Please Check 'ThreadPrioirty' class that I
		 * have written.
		 */
		System.out.println();
		StackTraceElement[] stackTraceElementList = currentlyExecutingThread.getStackTrace();
		for (StackTraceElement stackTraceElement : stackTraceElementList) {
			System.out.println("Value: " + stackTraceElement);
		}

		/**
		 * Returns the state of this thread. This method is designed for use in
		 * monitoring of the system state, not for synchronization control.
		 */
		State threadState = currentlyExecutingThread.getState();
		System.out.println("\nThread State: " + threadState);

		/**
		 * Returns the thread group to which this thread belongs. This method returns
		 * null if this thread has died(been stopped).
		 */
		ThreadGroup threadGroup = currentlyExecutingThread.getThreadGroup();
		System.out.println("\nThread Group: " + threadGroup);

		/**
		 * Returns the handler invoked when this thread abruptly terminates due to an
		 * uncaught exception. If this thread has not had an uncaught exception handler
		 * explicitly set then this thread's ThreadGroup object is returned, unless this
		 * thread has terminated, in which case null is returned.
		 */
		UncaughtExceptionHandler uncaughtExceptionHandler = currentlyExecutingThread.getUncaughtExceptionHandler();
		System.out.println("\nThread UncaughtExceptionHandler: " + uncaughtExceptionHandler);

		/**
		 * Returns true if and only if the current thread holds the monitor lock on the
		 * specified object.
		 * 
		 * Parameters: obj - the object on which to test lock ownership
		 * 
		 * Returns: true if the current thread holds the monitor lock on the specified
		 * object.
		 */
		boolean holdsLock = Thread.holdsLock(currentlyExecutingThread);
		System.out.println("\nThread holdsLock: " + holdsLock);

		/**
		 * Tests whether the current thread has been interrupted. The interrupted status
		 * of the thread is cleared by this method. In other words, if this method were
		 * to be called twice in succession, the second call would return false (unless
		 * the current thread were interrupted again, after the first call had cleared
		 * its interrupted status and before the second call had examined it). A thread
		 * interruption ignored because a thread was not alive at the time of the
		 * interrupt will be reflected by this method returning false. Returns:true if
		 * the current thread has been interrupted; false otherwise.
		 */
		boolean interrupted = Thread.interrupted();
		System.out.println("\nThread Interrupted: " + interrupted);

		// Interrupts this thread.
		currentlyExecutingThread.interrupt();

		/**
		 * Tests whether this thread has been interrupted. The interrupted status of the
		 * thread is unaffected by this method. A thread interruption ignored because a
		 * thread was not alive at the time of the interrupt will be reflected by this
		 * method returning false.
		 */
		boolean isInterrupted = currentlyExecutingThread.isInterrupted();
		System.out.println("\nThread isInterrupted: " + isInterrupted);

		/**
		 * Tests if this thread is alive. A thread is alive if it has been started and
		 * has not yet died.
		 */
		boolean isAlive = currentlyExecutingThread.isAlive();
		System.out.println("\nThread isAlive: " + isAlive);

		/**
		 * true if this thread is a daemon thread; false otherwise.
		 */
		boolean isDaemon = currentlyExecutingThread.isDaemon();
		System.out.println("\nThread isDaemon: " + isDaemon);

		ThreadRunnableSample threadRunnableSample = new ThreadRunnableSample();
		/**
		 * When an object implementing interface Runnable is used to create a thread,
		 * starting the thread causes the object's run method to be called in that
		 * separately executing thread. The general contract of the method run is that
		 * it may take any action whatsoever.
		 */
		threadRunnableSample.run();
		System.out.println("\nThread isDaemon: " + isDaemon);

		/**
		 * A hint to the scheduler that the current thread is willing to yield its
		 * current use of a processor. The scheduler is free to ignore this hint.
		 */
		Thread.yield();

		/**
		 * Returns a string representation of this thread, including the thread's name,
		 * priority, and thread group.
		 */
		String threadString = currentlyExecutingThread.toString();
		System.out.println("\nThread String: " + threadString);

		ThreadSample threadSample1 = new ThreadSample();
		/**
		 * Causes this thread to begin execution; the Java Virtual Machine calls the run
		 * method of this thread. The result is that two threads are running
		 * concurrently: the current thread (which returns from the call to the start
		 * method) and the other thread (which executes its run method).
		 * 
		 * It is never legal to start a thread more than once.In particular, a thread
		 * may not be restarted once it has completed execution.
		 */
		threadSample1.start();

		try {
			/**
			 * Causes the currently executing thread to sleep (temporarily cease execution)
			 * for the specified number of milliseconds, subject to the precision and
			 * accuracy of system timers and schedulers. The thread does not lose ownership
			 * of any monitors.
			 * 
			 * Parameters: millis - the length of time to sleep in milliseconds
			 */
			Thread.sleep(2000);

			/**
			 * public static void sleep(long millis, int nanos)
			 * 
			 * Causes the currently executing thread to sleep (temporarily cease execution)
			 * for the specified number of milliseconds plus the specified number of
			 * nanoseconds, subject to the precision and accuracy of system timers and
			 * schedulers. The thread does not lose ownership of any monitors.
			 * 
			 * Parameters:
			 * 
			 * millis - the length of time to sleep in milliseconds
			 * 
			 * nanos - 0-999999 additional nanoseconds to sleep
			 */
			Thread.sleep(2000, 90000);
		} catch (InterruptedException e1) {
			System.out.println(e1);
		}

		System.out.println();
		Thread threadRunnableRuntimeException = new Thread(new Runnable() {
			@Override
			public void run() {
				throw new RuntimeException();
			}
		});
		threadRunnableRuntimeException.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t + " throws exception: " + e);
			}
		});
		threadRunnableRuntimeException.start();
		threadRunnableRuntimeException.join();

	}

}
