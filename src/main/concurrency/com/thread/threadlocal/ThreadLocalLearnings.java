package com.thread.threadlocal;

import java.util.function.Supplier;

/**
 * 
 * The Java ThreadLocal class enables you to create variables that can only be
 * read and written by the same thread. Thus, even if two threads are executing
 * the same code, and the code has a reference to the same ThreadLocal variable,
 * the two threads cannot see each other's ThreadLocal variables. Thus, the Java
 * ThreadLocal class provides a simple way to make code thread safe that would
 * not otherwise be so.
 * 
 * ThreadLocal in Java is another way to achieve thread-safety apart from
 * writing immutable classes. Thread local can be considered as a scope of
 * access like session scope or request scope.
 */
public class ThreadLocalLearnings {
	public static void main(String[] args) throws InterruptedException {
		ThreadLocal threadLocal = new ThreadLocal();
		threadLocal.set("A thread local value");
		String threadLocalValue = (String) threadLocal.get();
		threadLocal.remove();

		ThreadLocal<String> threadLocalString = new ThreadLocal<String>();
		threadLocalString.set("Hello ThreadLocal");
		threadLocalValue = threadLocalString.get();

		// Initial ThreadLocal Value - Create a ThreadLocal subclass that overrides the
		// initialValue() method.
		ThreadLocal<String> threadLocalInitial = new ThreadLocal<String>() {
			@Override
			protected String initialValue() {
				return String.valueOf(System.currentTimeMillis());
			}
		};

		// Initial ThreadLocal Value - Provide a Supplier Implementation
		threadLocal = ThreadLocal.withInitial(new Supplier<String>() {
			@Override
			public String get() {
				return String.valueOf(System.currentTimeMillis());
			}
		});

		// Using lamda
		threadLocal = ThreadLocal.withInitial(() -> {
			return String.valueOf(System.currentTimeMillis());
		});
		// Using lamda
		threadLocal = ThreadLocal.withInitial(() -> String.valueOf(System.currentTimeMillis()));

		RunnableSample runnableSample = new RunnableSample();
		Thread thread1 = new Thread(runnableSample);
		Thread thread2 = new Thread(runnableSample);
		thread1.start();
		thread2.start();
		thread1.join(); // wait for thread 1 to terminate
		thread2.join(); // wait for thread 2 to terminate
	}
}
