package com.collections.hashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetSynchronized {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		hset.add("Praveen");
		hset.add("DoctorStrange");
		hset.add("IronMan");
		hset.add("Captian Marvel");
		hset.add("Praveen");

		System.out.println("Avengers : " + hset);

		hset.add("Thor");

		// Synchronizing the Hashset using Collections class : Thread safe
		Set<String> sysSet = Collections.synchronizedSet(hset);
		System.out.println("Synchronized set got created... " + sysSet);
	}

}
