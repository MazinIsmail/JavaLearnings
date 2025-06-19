package com.record.learnings;

/**
 * Record classes were previewed in Java 14.
 * 
 * They are both immutable and final. The fields of the Record cannot be changed
 * after creation and the extension of the Records class is also not allowed.
 * 
 */
public class RecordLearnings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Record classes are a special kind of class in Java that are used to model
	 * immutable data. They provide a concise way to create classes that are
	 * primarily used to hold data without the need for boilerplate code like
	 * constructors, getters, equals(), hashCode(), and toString() methods.
	 * 
	 */
	record DataUsingRecord(long a, long b) {
	}

	// The above Record Data is equivalent to the following lines of code
	public final class Data {
		private final long a;
		private final long b;

		public Data(long a, long b) {
			this.a = a;
			this.b = b;
		}

		long a() {
			return this.a;
		}

		long b() {
			return this.b;
		}
		// Implementation of equals() and hashCode(), which specify
		// An implementation of toString() that returns a string
	}

	/*
	 * The constructor can be extended with some field validation. Note that the
	 * assignment of the parameters to the record fields occur at the end of the
	 * constructor.
	 */
	record GrapeRecord(String color, int nbrOfPits) {
		GrapeRecord {
			System.out.println("Parameter color=" + color + ", Field color=" + this.color());
			System.out.println("Parameter nbrOfPits=" + nbrOfPits + ", Field nbrOfPits=" + this.nbrOfPits());
			if (color == null) {
				throw new IllegalArgumentException("Color may not be null");
			}
		}
	}

}
