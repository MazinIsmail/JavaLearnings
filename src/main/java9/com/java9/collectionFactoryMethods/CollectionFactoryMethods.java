package com.java9.collectionFactoryMethods;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Factory Methods for Collection
 * 
 * Java 9 Collection library includes static factory methods for List, Set and
 * Map interface. These methods are useful to create small number of collection.
 * 
 * Factory methods are special type of static methods that are used to create
 * unmodifiable instances of collections. It means we can use these methods to
 * create list, set and map of small number of elements.
 * 
 * It is unmodifiable, so adding new element will throw
 * java.lang.UnsupportedOperationException
 */
public class CollectionFactoryMethods {
	public static void main(String[] args) {
		listFactoryMethod();

		setFactoryMethod();

		mapInterfaceFactoryMethods();

		mapInterfaceOfEntriesMethod();
	}

	/**
	 * Java 9 Map Interface ofEntries() Method
	 * 
	 * In Java 9, apart from static Map.of() methods, Map interface includes one
	 * more static method Map.ofEntries(). This method is used to create a map of
	 * Map.Entry instances.
	 */
	private static void mapInterfaceOfEntriesMethod() {
		// Creating Map Entry
		Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
		Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
		// Creating Map using map entries
		Map<Integer, String> map = Map.ofEntries(e1, e2);
		// Iterating Map
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	/**
	 * Java 9 Map Interface Factory Methods
	 * 
	 * In Java 9, Map includes Map.of() and Map.ofEntries() static factory methods
	 * that provide a convenient way to create immutable maps. Map created by these
	 * methods has the following characteristics:-
	 * 
	 * It is immutable
	 * 
	 * It does not allow null keys and values
	 * 
	 * It is serializable if all keys and values are serializable
	 * 
	 * It rejects duplicate keys at creation time
	 * 
	 * The iteration order of mappings is unspecified and is subject to change.
	 */
	private static void mapInterfaceFactoryMethods() {
		Map<Integer, String> map = Map.of(101, "JavaFX", 102, "Hibernate", 103, "Spring MVC");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	/**
	 * 
	 * Java 9 Set Interface
	 * 
	 * Java Set interface provides a Set.of() static factory method which is used to
	 * create immutable set. The set instance created by this method has the
	 * following characteristcis:-
	 * 
	 * It is immutable
	 * 
	 * No null elements
	 * 
	 * It is serializable if all elements are serializable.
	 * 
	 * No duplicate elements.
	 * 
	 * The iteration order of set elements is unspecified and is subject to change.
	 */
	private static void setFactoryMethod() {
		Set<String> set = Set.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : set) {
			System.out.println(l);
		}
	}

	private static void listFactoryMethod() {
		List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : list) {
			System.out.println(l);
		}
	}
}
