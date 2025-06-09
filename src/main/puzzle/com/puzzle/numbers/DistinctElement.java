package com.puzzle.numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctElement {
	public static void main(String[] args) {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Paper clip",
				"Stapler", "Note Book", "Pencil", "Paper clip");

		Map<String, Integer> listDisct = new HashMap<>();
		for (String element : stationeryList) {
			if (listDisct.containsKey(element)) {
				Integer total = listDisct.get(element);
				listDisct.put(element, total + 1);
			} else {
				listDisct.put(element, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : listDisct.entrySet()) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());

		}
		
		// Print distinct elements and its count using streams
		System.out.println("Distinct elements and their counts using streams:");
		stationeryList.stream().distinct().forEach(element -> {
			
			long count = stationeryList.stream().filter(e -> e.equals(element))
					.count();
			System.out.println("Element: " + element + ", Count: " + count);
		}
		);


	}
}
