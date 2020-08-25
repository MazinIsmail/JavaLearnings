package com.lock.learnings;

/**
 * A java.util.concurrent.locks.Lock is a thread synchronization mechanism just
 * like synchronized blocks. A Lock is, however, more flexible and more
 * sophisticated than a synchronized block.
 * 
 * Lock is an interface.
 * 
 * A lock is acquired via lock() and released via unlock(). It's important to
 * wrap your code into a try/finally block to ensure unlocking in case of
 * exceptions. This method is thread-safe just like the synchronized
 * counterpart. If another thread has already acquired the lock subsequent calls
 * to lock() pause the current thread until the lock has been unlocked. Only one
 * thread can hold the lock at any given time.
 */
public class LockLearnings {

	public static void main(String[] args) {

	}
}
