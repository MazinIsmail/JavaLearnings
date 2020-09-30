package com.javamemorymanagement.learning;

/**
 * It is a method that the Garbage Collector always calls just before the
 * deletion/destroying the object which is eligible for Garbage Collection, so
 * as to perform clean-up activity.
 * 
 * finalize method is present in Object class.
 * 
 * There is no guarantee about the time when finalize is called.
 * 
 * JVM does not ignore all exceptions while executing finalize method, but it
 * ignores only Unchecked exceptions. If the corresponding catch block is there
 * then JVM won’t ignore and corresponding catch block will be executed.
 */
public class FinalizeMethod {
	public static void main(String[] args) {
		FinalizeMethod finalizeMethod = new FinalizeMethod();
		/**
		 * We can call finalize method Explicitly then it will be executed just like
		 * normal method call but object won’t be deleted/destroyed.
		 */
		finalizeMethod.finalize();
		String s = new String("RR");
		s = null;

		System.out.println("Main Completes");

		/**
		 * The java.lang.Runtime.gc() method runs the garbage collector. Calling this
		 * method suggests that the Java virtual machine expend effort toward recycling
		 * unused objects in order to make the memory they currently occupy available
		 * for quick reuse.
		 * 
		 * The method System.gc() is the conventional and convenient means of invoking
		 * this method.
		 * 
		 * This is instance method, while System.gc() is static method.
		 */
		Runtime.getRuntime().gc();

		System.gc();
	}

	/**
	 * If Garbage Collector calls finalize method, while executing finalize method
	 * some unchecked exception rises then JVM ignores that exception and rest of
	 * program will be continued normally.
	 */
	@Override
	public void finalize() {
		System.out.println("finalize method overriden");
	}
}
