package com.collections.TreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Default
		TreeSet<String> Tset=new TreeSet<String>();  
		Tset.add("Uno");
		Tset.add("Uno");
		System.out.println("TreeSet with default constructor"+Tset);
		
		HashSet<String> Hset= new HashSet<>();
		Hset.add("Uno");
		Hset.add("Dos");
		// from another collection. Passed as parameter to treeset constructor.
		TreeSet<String> Tset1=new TreeSet<>(Hset);  
		System.out.println("TreeSet created from HashSet : "+Tset1);
		
		//TreeSet<String> Tset2 =new TreeSet<>(comparator); 
				
		TreeSet<String> Tset3=new TreeSet<String>();  
		
		
	}

}
