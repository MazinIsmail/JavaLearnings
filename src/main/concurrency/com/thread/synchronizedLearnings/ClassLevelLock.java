package com.thread.synchronizedLearnings;

public class ClassLevelLock {

	// Inner class have to be static if a method is static
	public static class StaticMethod {
		// Method is static
		public synchronized static void demoMethod() {

		}
	}

	public class ClassReference {
		public void demoMethod() {
			// Acquire lock on .class reference
			synchronized (ClassReference.class) {
				// other thread safe code
			}
		}
	}

	// Inner class have to be static if a member variable is static
	public static class LockObjectStatic {
		private final static Object lock = new Object();

		public void demoMethod() {
			// Lock object is static
			synchronized (lock) {
				// other thread safe code
			}
		}
	}

}
