package com.collections.usageComparison;

/**
 * Performing the fastest search - which collection should i use?
 * 
 * If you need fast access to elements using index, ArrayList should be choice.
 * 
 * 
 * fast access to elements using index, ArrayList
 * fast access to elements using index, ArrayList
 * fast access to elements using index, ArrayList
 * 
 * 
 * If you need fast access to elements using a key, use HashMap.
 * 
 * fast access to elements using a key, use HashMap
 * fast access to elements using a key, use HashMap
 * fast access to elements using a key, use HashMap
 * 
 * If you need fast add and removal of elements, use LinkedList (but it has a
 * very poor seeking performance).
 * 
 * fast add and removal of elements, use LinkedList
 * fast add and removal of elements, use LinkedList
 * fast add and removal of elements, use LinkedList
 * 
 * 
 * The thing which is often skipped when comparing ArrayList and LinkedList is
 * cache and memory management optimisations. ArrayList is effectively just an
 * array which means that it is stored in a continuous space in the memory. This
 * allows the Operating System to use optimisations such as "when a byte in
 * memory was accessed, most likely the next byte will be accessed soon".
 * Because of this, ArrayList is faster than LinkedList in all but one case:
 * when inserting/deleting the element at the beginning of the list (because all
 * elements in the array have to be shifted). Adding/deleting at the end or in
 * the middle, iterating over, accessing the element are all faster in case of
 * ArrayList.
 * 
 * If you need to search for student with given name and id, it sounds to me
 * like a map with composite key - Map<Student, StudentData>. I would recommend
 * to use HashMap implementation, unless you need to be able to both search the
 * collection and retrieve all elements sorted by key in which case TreeMap may
 * be a better idea. Although remember that HashMap has O(1) access time, while
 * TreeMap has O(logn) access time.
 * 
 * HashMap has O(1)
 * HashMap has O(1)
 * HashMap has O(1)
 * 
 * TreeMap has O(logn)
 * TreeMap has O(logn)
 * TreeMap has O(logn)
 * 
 * If you care about traversing elements in specific order, you should choose
 * TreeMap (natural order) or LinkedHashMap (insertion order).
 * 
 * traversing elements in specific order, you should choose TreeMap (natural order)
 * traversing elements in specific order, you should choose TreeMap (natural order)
 * traversing elements in specific order, you should choose TreeMap (natural order)
 * 
 */
public class PerformingFastestSearch {

}
