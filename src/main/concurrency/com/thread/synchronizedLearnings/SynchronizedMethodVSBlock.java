package com.thread.synchronizedLearnings;

/**
 * The below code shows that synchronized block can be holding different object
 * monitors. Maybe it's necessary to protect doSomething1() method and
 * doSomething2() method from multiple threads, but it's fine if one thread is
 * in the doSomething1() method and another is in the doSomething2() method. But
 * the synchronized method can not do it.
 * 
 * static synchronized methods synchronize on the class object: If one thread is
 * executing a static synchronized method, all other threads trying to execute
 * any static synchronized methods, in the same class, will block.
 * 
 * non-static synchronized methods synchronize on "this" (the instance object):
 * If one thread is executing a synchronized method, all other threads trying to
 * execute any synchronized methods, in the same class, will block.
 */
public class SynchronizedMethodVSBlock {

	private static Object locker1 = new Object();
	private static Object locker2 = new Object();

	public void doSomething1() {
		synchronized (locker1) {
			// do something protected;
		}
	}

	public void doSomething2() {
		synchronized (locker2) {
			// do something protected;
		}
	}

}
