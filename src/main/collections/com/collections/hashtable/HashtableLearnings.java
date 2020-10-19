package com.collections.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/**
 * Hashtable
 * 
 * This class implements a hash table, which maps keys to values. Any non-null
 * object can be used as a key or as a value. To successfully store and retrieve
 * objects from a hashtable, the objects used as keys must implement the
 * hashCode method and the equals method.
 * 
 * It is similar to HashMap, but is synchronised. Hashtable stores key/value
 * pair in hash table. In Hashtable we specify an object that is used as a key,
 * and the value we want to associate to that key. The key is then hashed, and
 * the resulting hash code is used as the index at which the value is stored
 * within the table.
 * 
 * A Hashtable is an array of a list. Each list is known as a bucket. The
 * position of the bucket is identified by calling the hashcode() method. A
 * Hashtable contains values based on the key.
 * 
 * Java Hashtable class contains unique elements.
 * 
 * Java Hashtable class doesn't allow null key or value.
 * 
 * Java Hashtable class is synchronized.
 * 
 * The initial default capacity of Hashtable class is 11 whereas loadFactor is
 * 0.75.
 */
public class HashtableLearnings {
	public static void main(String args[]) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Here, we specify the if and else statement as arguments of the method
		System.out.println(hm.getOrDefault(101, "Not Found"));
		System.out.println(hm.getOrDefault(105, "Not Found"));
		// Inserts, as the specified pair is unique
		hm.putIfAbsent(104, "Gaurav");
		System.out.println("Updated Map: " + hm);
		// Returns the current value, as the specified pair already exist
		hm.putIfAbsent(101, "Vijay");
		System.out.println("Updated Map: " + hm);

		// create enumeration
		Enumeration e1 = hm.keys();
		System.out.println("display key:");
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}
