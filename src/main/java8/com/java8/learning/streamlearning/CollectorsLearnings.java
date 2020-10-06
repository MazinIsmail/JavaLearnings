package com.java8.learning.streamlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Collectors
 * 
 * Collectors is a final class that extends Object class. It provides reduction
 * operations, such as accumulating elements into collections, summarizing
 * elements according to various criteria, etc.
 * 
 * Collectors is one of the utility class in JDK which contains a lot of utility
 * functions. It is mostly used with Stream API as a final step.
 * 
 * Functions associated with Collectors usually get used inside collect()
 * methods. Collectors class is part of Stream package.
 */
public class CollectorsLearnings {

	public static void main(String[] args) {
		List<ProductSample> productsList = new ArrayList<ProductSample>();
		productsList.add(new ProductSample(1, "HP Laptop", 25000f));
		productsList.add(new ProductSample(2, "Dell Laptop", 30000f));
		productsList.add(new ProductSample(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductSample(4, "Sony Laptop", 28000f));
		productsList.add(new ProductSample(5, "Apple Laptop", 90000f));

		// fetching price and collecting as List
		List<Float> productPriceList = productsList.stream().map(x -> x.getPrice()).collect(Collectors.toList());
		System.out.println("productPriceList: " + productPriceList);
		// fetching price and collecting as Sets
		Set<Float> productPriceSets = productsList.stream().map(x -> x.getPrice()).collect(Collectors.toSet());
		System.out.println("productPriceSets: " + productPriceSets);

		// Summing Values
		Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.getPrice()));
		System.out.println("Sum of prices: " + sumPrices);
		Integer sumId = productsList.stream().collect(Collectors.summingInt(x -> x.getId()));
		System.out.println("Sum of id's: " + sumId);

		// Getting Average
		Double average = productsList.stream().collect(Collectors.averagingDouble(p -> p.getPrice()));
		System.out.println("Average price is: " + average);

		// Counting Elements
		Long noOfElements = productsList.stream().collect(Collectors.counting());
		System.out.println("Total elements: " + noOfElements);

		/**
		 * Transforms the elements into a Map whose keys and values are the results of
		 * applying the passed mapper functions to the input elements and returns a
		 * Collector. toMap() is used to collect input of elements and convert it into
		 * Map instance.
		 */
		Map<String, Integer> mapProductsList = productsList.stream()
				.filter(productSample -> productSample.getPrice() > 10)
				.collect(Collectors.toMap(ProductSample::getName, ProductSample::getId, (key, identicalKey) -> key));
		System.out.println("mapProductsList: " + mapProductsList);

		/**
		 * Performs group by operation on input elements of type T. The grouping of
		 * elements is done as per the passed classifier function and returns the
		 * Collector with result in a Map.
		 */
		Map<String, List<ProductSample>> mapProductsListGroup = productsList.stream()
				.collect(Collectors.groupingBy(ProductSample::getName));
		System.out.println("mapProductsListGroup: " + mapProductsListGroup);
		/**
		 * Collector collectingAndThen(Collector downstream, Function finisher): This
		 * method allows us to perform another operation on the result after collecting
		 * the input element of collection.
		 */
		mapProductsList = productsList.stream().collect(Collectors.groupingBy(ProductSample::getName,
				Collectors.collectingAndThen(Collectors.counting(), f -> f.intValue())));
		System.out.println("mapProductsList: " + mapProductsList);

		/**
		 * Collector counting(): It counts the number of input elements of type T and
		 * returns a Collector. This method is used in a case where we want to group and
		 * count the number of times each city is present in the collection of elements.
		 */
		Map<String, Long> count = productsList.stream()
				.collect(Collectors.groupingBy(ProductSample::getName, Collectors.counting()));
		System.out.println("count: " + count);

		/**
		 * Collector joining(CharSequence delimiter, CharSequence prefix, CharSequence
		 * suffix): Concatenates the input elements, separated by the specified
		 * delimiter, as per the specified prefix and suffix, and returns a Collector.
		 */
		String joining = productsList.stream().filter(productSample -> productSample.getPrice() > 10)
				.map(f -> f.getName()).collect(Collectors.joining(" ", "Prefix:", ":Suffix"));
		System.out.println("joining: " + joining);
	}

}
