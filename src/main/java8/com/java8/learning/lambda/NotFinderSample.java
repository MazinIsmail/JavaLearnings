package com.java8.learning.lambda;

// Static method that we want to create a method reference to
public class NotFinderSample {
	public static int doFind(String s1, String s2) {
		return s1.lastIndexOf(s2);
	}
}
