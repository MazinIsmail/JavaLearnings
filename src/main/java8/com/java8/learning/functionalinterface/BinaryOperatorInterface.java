package com.java8.learning.functionalinterface;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

/**
 * The Java BinaryOperator interface is a functional interface that represents
 * an operation which takes two parameters and returns a single value. Both
 * parameters and the return type must be of the same type.
 * 
 * The Java BinaryOperator interface is useful when implementing functions that
 * sum, subtract, divide, multiply etc. two elements of the same type, and
 * returns a third element of the same type.
 * 
 * BinaryOperator is a functional interface and it extends BiFunction.
 * 
 * public interface BinaryOperator<T> extends BiFunction<T,T,T> {
 * 
 * }
 * 
 * The BiFunction takes two arguments of any type, and returns a result of any
 * type.
 * 
 * public interface BiFunction<T, U, R> {
 * 
 * R apply(T t, U u);
 * 
 * }
 * 
 * takes two parameters and returns a single value of the same type
 * takes two parameters and returns a single value of the same type
 * takes two parameters and returns a single value of the same type
 */
public class BinaryOperatorInterface {
	public static void main(String[] args) {
		BinaryOperator<Integer> operator = BinaryOperator.maxBy((x, y) -> (x > y) ? 1 : ((x == y) ? 0 : -1));
		System.out.println(operator.apply(120, 5));

		operator = (x, y) -> x * y;
		System.out.println(operator.apply(5, 7));

		System.out.println();
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer result = math(Arrays.asList(numbers), 0, (a, b) -> a + b);
		System.out.println(result); // 55
		Integer result2 = math(Arrays.asList(numbers), 0, Integer::sum);
		System.out.println(result2); // 55

		System.out.println();
		result = math(Arrays.asList(numbers), 0, (a, b) -> a + b);
		System.out.println(result); // 55
		result2 = math(Arrays.asList(numbers), 0, Integer::sum);
		System.out.println(result2); // 55

		System.out.println();
		developerSamplePay();
	}

	public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
		T result = init;
		for (T t : list) {
			result = accumulator.apply(result, t);
		}
		return result;
	}

	/**
	 * If the math operations involve primitive types like int, change to
	 * IntBinaryOperator for better performance.
	 */
	public static int mathInt(int[] list, int init, IntBinaryOperator accumulator) {
		int result = init;
		for (int t : list) {
			result = accumulator.applyAsInt(result, t);
		}
		return result;
	}

	/**
	 * This example uses BinaryOperator and a custom Comparator to find the highest
	 * and lowest pay DeveloperSample from a list of DeveloperSamples.
	 */
	public static void developerSamplePay() {
		DeveloperSample dev1 = new DeveloperSample("jordan", BigDecimal.valueOf(9999));
		DeveloperSample dev2 = new DeveloperSample("jack", BigDecimal.valueOf(8888));
		DeveloperSample dev3 = new DeveloperSample("jaden", BigDecimal.valueOf(10000));
		DeveloperSample dev4 = new DeveloperSample("ali", BigDecimal.valueOf(2000));
		DeveloperSample dev5 = new DeveloperSample("mkyong", BigDecimal.valueOf(1));
		List<DeveloperSample> list = Arrays.asList(dev1, dev2, dev3, dev4, dev5);
		// 1. Create a Comparator
		Comparator<DeveloperSample> comparing = Comparator.comparing(DeveloperSample::getSalary);
		// 2. BinaryOperator with a custom Comparator
		BinaryOperator<DeveloperSample> bo = BinaryOperator.maxBy(comparing);
		DeveloperSample result = find(list, bo);
		System.out.println(result); // DeveloperSample{name='jaden', salary=10000}

		// find DeveloperSample with highest pay
		DeveloperSample developerSample = find(list,
				BinaryOperator.maxBy(Comparator.comparing(DeveloperSample::getSalary)));
		System.out.println(developerSample); // DeveloperSample{name='jaden', salary=10000}

		// find DeveloperSample with lowest pay
		DeveloperSample developerSample2 = find(list,
				BinaryOperator.minBy(Comparator.comparing(DeveloperSample::getSalary)));
		System.out.println(developerSample2); // DeveloperSample{name='mkyong', salary=1}

	}

	public static DeveloperSample find(List<DeveloperSample> list, BinaryOperator<DeveloperSample> accumulator) {
		DeveloperSample result = null;
		for (DeveloperSample t : list) {
			if (result == null) {
				result = t;
			} else {
				result = accumulator.apply(result, t);
			}
		}
		return result;
	}

}
