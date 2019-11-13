package com.thread.synchronizedLearnings;

/**
 * Object level lock is mechanism when we want to synchronize a non-static
 * method or non-static code block. This should always be done to make instance
 * level data thread safe.
 */
public class ObjectLevelLocking {

	public class OnMethodDirectly {
		public synchronized void demoMethod() {
		}
	}

	public class UsingThis {
		public void demoMethod() {
			synchronized (this) {
				// other thread safe code
			}
		}
	}

	public class LockingInstanceVariable {
		private final Object lock = new Object();

		public void demoMethod() {
			synchronized (lock) {
				// other thread safe code
			}
		}
	}

}
