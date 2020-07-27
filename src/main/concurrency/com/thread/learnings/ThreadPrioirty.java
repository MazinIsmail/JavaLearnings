package com.thread.learnings;

/**
 *
 * In a Multi threading environment, thread scheduler assigns processor to a
 * thread based on priority of thread. Whenever we create a thread in Java, it
 * always has some priority assigned to it. Priority can either be given by JVM
 * while creating the thread or it can be given by programmer explicitly.
 * Accepted value of priority for a thread is in range of 1 to 10. There are 3
 * static variables defined in Thread class for priority.
 * 
 * public static int MIN_PRIORITY: This is minimum priority that a thread can
 * have. Value for this is 1.
 * 
 * public static int NORM_PRIORITY: This is default priority of a thread if do
 * not explicitly define it. Value for this is 5.
 * 
 * public static int MAX_PRIORITY: This is maximum priority of a thread. Value
 * for this is 10.
 *
 * What happens if there is more than one runnable thread with the same
 * (highest) priority? One of the highest priority threads gets picked. It is
 * completely up to the thread scheduler how to arbitrate between threads of the
 * same priority. The Java programming language gives no guarantee that all of
 * the threads get treated fairly. Of course, it would be desirable if all
 * threads of the same priority are served in turn, to guarantee that each of
 * them has a chance to make progress
 */
class ThreadPrioirty extends Thread {
	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		ThreadPrioirty t1 = new ThreadPrioirty();
		ThreadPrioirty t2 = new ThreadPrioirty();
		ThreadPrioirty t3 = new ThreadPrioirty();

		System.out.println("t1 thread priority : " + t1.getPriority()); // Default 5
		System.out.println("t2 thread priority : " + t2.getPriority()); // Default 5
		System.out.println("t3 thread priority : " + t3.getPriority()); // Default 5

		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		// t3.setPriority(21); will throw IllegalArgumentException
		System.out.println("t1 thread priority : " + t1.getPriority()); // 2
		System.out.println("t2 thread priority : " + t2.getPriority()); // 5
		System.out.println("t3 thread priority : " + t3.getPriority());// 8

		// Main thread
		System.out.print(Thread.currentThread().getName());
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

		// Main thread priority is set to 10
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

		/**
		 * To demonstrate that a child thread gets same priority as parent
		 */

		// main thread priority is 6 now
		Thread.currentThread().setPriority(6);

		System.out.println("main thread priority : " + Thread.currentThread().getPriority());

		ThreadPrioirty threadPrioirty = new ThreadPrioirty();

		// threadPrioirty thread is child of main thread
		// so threadPrioirty thread will also have priority 6.
		System.out.println("threadPrioirty thread priority : " + threadPrioirty.getPriority());
	}
}
