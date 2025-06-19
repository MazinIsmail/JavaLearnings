package com.patternmatching.learnings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern Matching Instanceof Learnings
 * 
 * Pattern matching is a feature that allows developers to match data structures
 * against patterns and extract information from them in a more concise and
 * readable way.
 * 
 * Pattern matching for instanceof is a feature introduced in Java 14 and
 * permanently available since Java 16. It simplifies the code by allowing
 * developers to test the type of an object and simultaneously cast it to that
 * type, eliminating the need for explicit casting.
 * 
 */
public class PatternMatchingInstanceofLearnings {
	public static void main(String[] args) {
		pattern();

		// Typically, we might do this with the instanceof operator followed by a cast.
		Object o = new String();
		if (o instanceof String) {
			String ss = (String) o;
			// other ss operations
		} else if (o instanceof Number) {
			Number nm = (Number) o;
			// other nm operations
		}

		/*
		 * Java 14, via JEP 305, brings an improved version of the instanceof operator
		 * that both tests the parameter and assigns. Pattern matching for instanceof
		 * became a permanent feature in Java SE 16.
		 */
		o = new String();
		if (o instanceof String s) {
			System.out.printf("Object is a string %s", s);
		} else if (o instanceof Number n) {
			System.out.printf("Object is a number %n", n);
		}

	}

	/*
	 * What is Pattern Matching
	 */
	private static void pattern() {
		String sonnet = "From fairest creatures we desire increase,\n" + "That thereby beauty's rose might never die,\n"
				+ "But as the riper should by time decease\n" + "His tender heir might bear his memory:\n"
				+ "But thou, contracted to thine own bright eyes,\n"
				+ "Feed'st thy light's flame with self-substantial fuel,\n" + "Making a famine where abundance lies,\n"
				+ "Thyself thy foe, to thy sweet self too cruel.\n" + "Thou that art now the world's fresh ornament,\n"
				+ "And only herald to the gaudy spring,\n" + "Within thine own bud buriest thy content,\n"
				+ "And, tender churl, mak'st waste in niggardly.\n" + "Pity the world, or else this glutton be,\n"
				+ "To eat the world's due, by the grave and thee.";

		Pattern pattern = Pattern.compile("\\bflame\\b");
		Matcher matcher = pattern.matcher(sonnet);
		while (matcher.find()) {
			String group = matcher.group();
			int start = matcher.start();
			int end = matcher.end();
			System.out.println(group + " " + start + " " + end); // flame 233 238
		}

	}
}
