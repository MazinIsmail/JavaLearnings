package com.collections.LinkedhashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSynchronized {

	public static void main(String[] args) {

		LinkedHashSet<String> hset = new LinkedHashSet<String>();
		
		hset.add("Thanos");
		hset.add("DoctorStrange");
		hset.add("IronMan");
		hset.add("Captian Marvel");
		hset.add("Thanos");

		System.out.println("Avengers : " + hset);

		hset.add("Thor");

		// Synchronizing the Hashset using Collections class : Thread safe
		Set<String> sysSet = Collections.synchronizedSet(hset);
		System.out.println("Synchronized set got created..." + sysSet);
	}

}
