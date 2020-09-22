package com.java8.learning.functionalinterface;

import java.util.function.Supplier;

/**
 * The Java Supplier interface is a functional interface that represents an
 * function that supplies a value of some sorts. The Supplier interface can also
 * be thought of as a factory interface.
 * 
 * It represents a function which does not take in any argument but produces a
 * value of type T.
 */
public class SupplierInterface {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
		/**
		 * The lambda expression assigned to an object of Supplier type is used to
		 * define its get() which eventually produces a value. Suppliers are useful when
		 * we don’t need to supply any value and obtain a result at the same time.
		 */
		System.out.println(supplier.get());
	}
}
