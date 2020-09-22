package com.java8.learning.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Java Consumer interface is a functional interface that represents an
 * function that consumes only one value without returning any value. A Java
 * Consumer implementation could be printing out a value, or writing it to a
 * file, or over the network etc.
 */
public class ConsumerInterface {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (value) -> System.out.println(value);
		consumer.accept(2);

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++)
				list.set(i, 2 * list.get(i));
		};
		// Consumer to display a list of numbers
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		System.out.println();
		// Implement modify using accept()
		modify.accept(list);
		// Implement dispList using accept()
		dispList.accept(list);

		System.out.println();
		System.out.println();
		System.out.println("Using addThen:");
		// using addThen()
		modify.andThen(dispList).accept(list);
	}
}
