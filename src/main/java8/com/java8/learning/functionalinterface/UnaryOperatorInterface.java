package com.java8.learning.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * The Java UnaryOperator interface is a functional interface that represents an
 * operation which takes a single parameter and returns a parameter of the same
 * type.
 * 
 * The UnaryOperator interface can be used to represent an operation that takes
 * a specific object as parameter, modifies that object, and returns it again -
 * possibly as part of a functional stream processing chain.
 */
public class UnaryOperatorInterface {
	public static void main(String[] args) {
		UnaryOperator<Integer> xor = a -> a ^ 1;
		UnaryOperator<Integer> and = a -> a & 1;
		Function<Integer, Integer> andThen = xor.andThen(and);
		System.out.println(andThen.apply(2));

		Function<Integer, Integer> compose = xor.compose(and);
		System.out.println(compose.apply(231));

		/*
		 * The Function<Integer, Integer> which accepts and returns the same type, can
		 * be replaced with UnaryOperator<Integer>.
		 */
		Function<Integer, Integer> func = x -> x * 2;
		Integer result = func.apply(2);
		System.out.println(result); // 4
		UnaryOperator<Integer> func2 = x -> x * 2;
		Integer result2 = func2.apply(2);
		System.out.println(result2);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> resultValue = math(list, x -> x * 2);
		System.out.println(resultValue); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

		List<Integer> resultValue2 = math2(list, x -> x * 2, x -> x + 1);
		System.out.println(result); // [3, 5, 7, 9, 11, 13, 15, 17, 19, 21]

	}

	public static <T> List<T> math(List<T> list, UnaryOperator<T> uo) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(uo.apply(t));
		}
		return result;
	}

	public static <T> List<T> math2(List<T> list, UnaryOperator<T> uo, UnaryOperator<T> uo2) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(uo.andThen(uo2).apply(t));
		}
		return result;
	}

}
