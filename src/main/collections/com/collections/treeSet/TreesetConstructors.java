package com.collections.treeSet;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/*TreeSet internally uses a TreeMap to store elements.
 */
public class TreesetConstructors {

	public static void main(String[] args) {
		
		HashSet<String> Hset= new HashSet<>();
		Hset.add("Uno");
		Hset.add("Dos");
		// from another collection. Passed as parameter to treeset constructor.
		TreeSet<String> Tset1=new TreeSet<>(Hset);  
		System.out.println("TreeSet created from HashSet : "+Tset1);	
		
		TreeSet<String> Normalfruits = new TreeSet<>();
		Normalfruits.add("Uno");
		Normalfruits.add("Dos");
		Normalfruits.add("aEo");
		System.out.println("Values from fruits : "+Normalfruits);
		
		TreeSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		fruits.add("Uno");
		fruits.add("Dos");
		fruits.add("aEo");
		System.out.println("Values from fruits : "+fruits);
				
		TreeSet<String> fruitsReverse = new TreeSet<>(Comparator.reverseOrder()); 
		fruitsReverse.add("Aeo");
		fruitsReverse.add("Dos");
		fruitsReverse.add("Uno");
		System.out.println("Values from fruitsReverse : "+fruitsReverse);
		
		// To make Treeset threadsafe.
		Collections.synchronizedSet(fruitsReverse);
		System.out.println("ThreadSafe fruitsReverse : "+fruitsReverse);
	}

}
