package com.java9.underscore;

/**
 * Java 9 Underscore
 * 
 * In earlier versions of Java, underscore can be used as identifier and to
 * create variable name also. But in Java 9 release, underscore is a keyword and
 * can't be used as an identifier or variable name.
 * 
 * If we use the underscore character ("_") as an identifier, our source code
 * can no longer be compiled.
 */
public class UnderscoreLearnings {
	public static void main(String[] args) {

		// '_' should not be used as an identifier, since it is a reserved keyword from
		// source level 1.8 on
		// int _ = 10;
		// System.out.println(_);
	}
}
