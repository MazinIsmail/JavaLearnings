package com.lock.learnings;

/**
 * Notice the synchronized(this) block in the inc() method. This block makes
 * sure that only one thread can execute the return ++count at a time.
 */
public class CounterSynchronizedBlock {
	private int count = 0;

	public int inc() {
		synchronized (this) {
			return ++count;
		}
	}
}
