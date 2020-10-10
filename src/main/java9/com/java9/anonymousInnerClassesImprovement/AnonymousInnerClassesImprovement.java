package com.java9.anonymousInnerClassesImprovement;

/**
 * Java 9 introduced a new feature that allows us to use diamond operator with
 * anonymous classes.
 * 
 * In Java 9, as long as the inferred type is denotable, we can use the diamond
 * operator when we create an anonymous inner class.
 * 
 * Data types that can be written in Java program like int, String etc are
 * called denotable types. Java 9 compiler is enough smart and now can infer
 * type.
 * 
 * Java 8 compiler throws compile time error because it can't infer type.
 */
public class AnonymousInnerClassesImprovement {
	public static void main(String[] args) {
		// diamond operator is empty, compiler infer type.
		Sample<String> a = new Sample<>() {
			String show(String a, String b) {
				return a + b;
			}
		};
		String result = a.show("Java", "9");
		System.out.println(result);
	}
}
