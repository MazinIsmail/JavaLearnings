package com.concurrentMap.learnings;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * ConcurrentSkipListMap guarantees O(log(n)) time complexity performance for
 * most of its operations like firstKey, firstEntry, lastEntry, pollFirstEntry,
 * pollLastEntry, etc.
 * 
 * So basically, if you need faster in-order traversal, and if you are totally
 * fine for an extra cost for insertion, use the ConcurrentSkipListMap. Data
 * will be sorted by default. You could also use TreeMap if you don’t need to
 * use object in concurrent environment.
 */
public class ConcurrentSkipListMapLearnings {
	public static void main(String[] args) {
		System.out.println("Example of ConcurrentNavigableMap:\n");
		ConcurrentNavigableMap<Integer, String> navmap = new ConcurrentSkipListMap<Integer, String>();
		navmap.put(1, "Sunday");
		navmap.put(2, "Monday");
		navmap.put(3, "Tuesday");
		navmap.put(4, "Wednesday");
		navmap.put(5, "Thursday");
		navmap.put(6, "Friday");
		navmap.put(7, "Saturday");
		System.out.println("1. descendingKeySet(): " + navmap.descendingKeySet() + "\n");
		System.out.println("2. descendingMap(): " + navmap.descendingMap() + "\n");
		System.out.println("3. headMap(K toKey): " + navmap.headMap(3) + "\n");
		System.out.println("4. headMap(K toKey, boolean inclusive): " + navmap.headMap(3, true) + "\n");
		System.out.println("5. keySet(): " + navmap.keySet() + "\n");
		System.out.println("6. navigableKeySet(): " + navmap.navigableKeySet() + "\n");
		System.out.println("7. subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive): "
				+ navmap.subMap(3, true, 6, true) + "\n");
		System.out.println("8. subMap(K fromKey, K toKey): " + navmap.subMap(3, 6) + "\n");
		System.out.println("9. tailMap(K fromKey): " + navmap.tailMap(3) + "\n");
		System.out.println("10. tailMap(K fromKey, boolean inclusive): " + navmap.tailMap(3, true) + "\n");
	}
}
