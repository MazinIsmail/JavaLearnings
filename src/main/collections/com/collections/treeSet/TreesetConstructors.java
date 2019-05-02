package com.collections.treeSet;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*TreeSet internally uses a TreeMap to store elements.
 */
public class TreesetConstructors {

	public static void main(String[] args) {
		
		HashSet<String> hSet= new HashSet<>();
		hSet.add("Uno");
		hSet.add("Dos");
		// from another collection. Passed as parameter to treeset constructor.
		TreeSet<String> tSet1=new TreeSet<>(hSet);  
		System.out.println("TreeSet created from HashSet : "+tSet1);	
		
		TreeSet<String> normalFruits = new TreeSet<>();
		normalFruits.add("Uno");
		normalFruits.add("Dos");
		normalFruits.add("aEo");
		System.out.println("Values from fruits : "+normalFruits);
		
		TreeSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		fruits.add("Uno");
		fruits.add("Dos");
		fruits.add("aEo");
		System.out.println("Values from fruits CASE_INSENSITIVE_ORDER  : "+fruits);
				
		TreeSet<String> fruitsReverse = new TreeSet<>(Comparator.reverseOrder()); 
		fruitsReverse.add("Aeo");
		fruitsReverse.add("Dos");
		fruitsReverse.add("Uno");
		System.out.println("Values from fruitsReverse : "+fruitsReverse);
		
		// To make Treeset threadsafe.
		Set<String> temp = Collections.synchronizedSet(fruitsReverse);
		System.out.println("ThreadSafe fruitsReverse : "+temp);
	}

}
