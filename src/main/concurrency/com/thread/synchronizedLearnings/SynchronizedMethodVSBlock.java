package com.thread.synchronizedLearnings;

/**
 * The below code shows that synchronized block can be holding different object
 * monitors. Maybe it's necessary to protect doSomething1() method and
 * doSomething2() method from multiple threads, but it's fine if one thread is
 * in the doSomething1() method and another is in the doSomething2() method. But
 * the synchronized method cannot do it.
 * 
 * static synchronized methods synchronize on the class object: If one thread is
 * executing a static synchronized method, all other threads trying to execute
 * any static synchronized methods, in the same class, will block.
 * 
 * non-static synchronized methods synchronize on "this" (the instance object):
 * If one thread is executing a synchronized method, all other threads trying to
 * execute any synchronized methods, in the same class, will block.
 * 
 * Java synchronized keyword is re-entrant in nature it means if a synchronized
 * method calls another synchronized method which requires same lock then
 * current thread which is holding lock can enter into that method without
 * acquiring lock.
 * 
 * It’s possible that both static synchronized and non static synchronized
 * method can run simultaneously or concurrently because they lock on different
 * object.
 * 
 * If one thread is executing the synchronized method, all others thread that
 * invoke synchronized method on the same Object will have to wait until first
 * thread is done with the Object.
 * 
 * When thread enters into synchronized instance method or block, it acquires
 * Object level lock and when it enters into synchronized static method or block
 * it acquires class level lock.
 * 
 * Difference between synchronized method and block in Java. Favoring
 * synchronized block over method is one of the Java best practices to follow as
 * it reduces scope of lock and improves performance.
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
