package com.customexception.learning;

public class FinalFinallyFinalize {
	// Final & Finally already learned
	public static void main(String[] args) {
		FinalFinallyFinalize obj = new FinalFinallyFinalize();
		System.out.println("Hashcode is: " + obj.hashCode());
		obj = null;
		obj = new FinalFinallyFinalize();
		// calling the garbage collector using gc()
		/*
		 * There is no guarantee that this effort will recycle any particular number of
		 * unused objects, reclaim any particular amount of space, or complete at any
		 * particular time.
		 */
		System.gc();
		System.out.println("End of the garbage collection");
	}

	// defining the finalize method
	protected void finalize() {
		System.out.println("Called the finalize() method");
	}
}
