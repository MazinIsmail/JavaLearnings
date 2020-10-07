package com.java8.learning.stringJoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * StringJoiner
 * 
 * StringJoiner is a class in java.util package which is used to construct a
 * sequence of characters(strings) separated by a delimiter and optionally
 * starting with a supplied prefix and ending with a supplied suffix. Though
 * this can also be done with the help of StringBuilder class to append
 * delimiter after each string, but StringJoiner provides easy way to do that
 * without much code to write.
 * 
 * This is quite good because now you don't need to worry about not adding
 * delimeter at the start or removing it from the end. This is one of the common
 * problems you face while manually joining multiple Strings together in a loop
 * separated by a delimiter.
 */
public class StringJoinerLearnings {
	public static void main(String[] args) {
		ArrayList<String> sampleList = new ArrayList<>();
		sampleList.add("Ram");
		sampleList.add("Shyam");
		sampleList.add("Alice");
		sampleList.add("Bob");
		StringJoiner stringJoiner = new StringJoiner(",");

		/**
		 * Sets the sequence of characters to be used when determining the string
		 * representation of this StringJoiner and no elements have been added yet, that
		 * is, when it is empty. A copy of the emptyValue parameter is made for this
		 * purpose. Note that once an add method has been called, the StringJoiner is no
		 * longer considered empty, even if the element(s) added correspond to the empty
		 * String.
		 */
		stringJoiner.setEmptyValue("Default Value");
		System.out.println("setEmptyValue: " + stringJoiner);

		/**
		 * Adds a copy of the given CharSequence value as the next element of the
		 * StringJoiner value. If newElement is null, then "null" is added.
		 */
		stringJoiner.add(sampleList.get(0)).add(sampleList.get(1));
		System.out.println("add: " + stringJoiner);

		// length() method
		System.out.println("Length of stringJoiner: " + stringJoiner.length());

		// passing ( : ) as delimiter
		StringJoiner stringJoiner2 = new StringJoiner(" : ");
		System.out.println("stringJoiner2: " + stringJoiner2);
		stringJoiner2.add(sampleList.get(2)).add(sampleList.get(3));
		System.out.println("stringJoiner2 add: " + stringJoiner2);

		// merge() method
		stringJoiner.merge(stringJoiner2);

		// toString() method
		System.out.println("merge: " + stringJoiner.toString());
		System.out.println("Length of new stringJoiner: " + stringJoiner.length());

		System.out.println();

		// passing comma(,) and square-brackets as delimiter
		/**
		 * Constructs a StringJoiner with no characters in it using copies of the
		 * supplied prefix, delimiter and suffix.If no characters are added to the
		 * StringJoiner and methods accessing the string value of it are invoked, it
		 * will return the prefix + suffix (or properties thereof) in the result, unless
		 * setEmptyValue has first been called.
		 * 
		 * Parameters:
		 * 
		 * delimiter the sequence of characters to be used between each element added to
		 * the StringJoiner
		 * 
		 * prefix the sequence of characters to be used at the beginning
		 * 
		 * suffix the sequence of characters to be used at the end
		 */
		StringJoiner joinNames = new StringJoiner(",", "[", "]");
		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		System.out.println("joinNames add: " + joinNames);
		// Creating StringJoiner with :(colon) delimiter
		StringJoiner joinNames2 = new StringJoiner(":", "{", "}"); // passing colon(:) and square-brackets as delimiter
		// Adding values to StringJoiner
		joinNames2.add("Peter");
		joinNames2.add("Raheem");
		System.out.println("joinNames2 add: " + joinNames2);

		// Merging two StringJoiner
		StringJoiner merge = joinNames.merge(joinNames2);
		System.out.println(merge);

		System.out.println();
		/**
		 * The problem with StringJoiner is that you need to know that there is a
		 * StringJoiner class. But what if you can directly join the String with a more
		 * popular java.lang.String class itself? Well, that's what Java designers also
		 * thought, and so, they added a static join() method to join the String right
		 * from the String class itself.
		 */
		String stringUsingJoin = String.join(" < ", "Four", "Five", "Six", "Seven");
		System.out.println("stringUsingJoin: " + stringUsingJoin);

		// Converting an array of String to the list
		List<String> list = Arrays.asList("Steve", "Rick", "Peter", "Abbey");
		String names = String.join(" | ", list);
		System.out.println("names: " + names);
	}
}
