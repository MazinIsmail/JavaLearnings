package com.staticModifier.learnings;

public class InnerClassStatic {
	
	private String name;

	// Inner class have to be static if a method is static
	public static class StaticMethod {
		// Method is static
		public static void demoMethod() {

		}
	}

	public class ClassReference {
		public void demoMethod() {
		}
	}

	// Inner class have to be static if a member variable is static
	public static class LockObjectStatic {
		private final static Object lock = new Object();

	}

}
