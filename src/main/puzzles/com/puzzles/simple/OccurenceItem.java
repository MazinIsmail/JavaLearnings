package com.puzzles.simple;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurenceItem {

	public static void main(String[] args) {
		String[] array = { "name1", "name2", "name3", "name4", "name5", "name3" };
		List asList = Arrays.asList(array);
		Set<String> mySet = new HashSet<String>(asList);
		Map<String, Integer> map = new HashMap();
		for (String s : mySet) {
			System.out.println(s + " " + Collections.frequency(asList, s));
			map.put(s, Collections.frequency(asList, s));
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " " + value);
		}
	}

}
