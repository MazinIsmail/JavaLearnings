package com.collections;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Fail-Fast
 * 
 * Fail-Fast iterators immediately throw ConcurrentModificationException if
 * there is structural modification of the collection. Structural modification
 * means adding, removing or updating any element from collection while a thread
 * is iterating over that collection.
 * 
 * The fail-fast behavior of an iterator cannot be guaranteed as it is,
 * generally speaking, impossible to make any hard guarantees in the presence of
 * unsynchronized concurrent modification. Fail-fast iterators throw
 * ConcurrentModificationException on a best-effort basis. Therefore, it would
 * be wrong to write a program that depended on this exception for its
 * correctness: the fail-fast behavior of iterators should be used only to
 * detect bugs.
 * 
 * To know whether the collection is structurally modified or not, fail-fast
 * iterators use an internal flag called modCount which is updated each time a
 * collection is modified. Fail-fast iterators checks the modCount flag whenever
 * it gets the next value (i.e. using next() method), and if it finds that the
 * modCount has been modified after this iterator has been created, it throws
 * ConcurrentModificationException.
 * 
 * Important points of fail-fast iterators:-
 * 
 * These iterators throw ConcurrentModificationException if a collection is
 * modified while iterating over it.
 * 
 * They use original collection to traverse over the elements of the collection.
 * 
 * These iterators don't require extra memory.
 */
public class FailFastLearnings {
	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator<String> iterator = cityCode.keySet().iterator();

		try {
			while (iterator.hasNext()) {
				System.out.println("Collection Data: " + cityCode.get(iterator.next()));
				/**
				 * adding an element to Map exception will be thrown on next call of next()
				 * method.
				 */
				cityCode.put("Istanbul", "Turkey");
			}
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}

		System.out.println("\nRemove Check:-");
		iteratorRemove();
	}

	/**
	 * If you remove an element via Iterator remove() method, exception will not be
	 * thrown. However, in case of removing via a particular collection remove()
	 * method, ConcurrentModificationException will be thrown.
	 */
	private static void iteratorRemove() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 2) {
				System.out.println("Remove using Iterator");
				// will not throw Exception
				itr.remove();
			}
		}

		System.out.println(al);

		itr = al.iterator();
		try {
			while (itr.hasNext()) {
				if (itr.next() == 3) {
					System.out.println("Remove using Collection");
					// will throw Exception on
					// next call of next() method
					al.remove(3);
				}
			}
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}
	}

}
