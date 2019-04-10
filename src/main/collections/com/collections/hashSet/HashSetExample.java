package com.collections.hashSet;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		//TODO: duplicates not allowed
		HashSet<String> hset = new HashSet<String>();
		hset.add("Vision");
		hset.add("DoctorStrange");
		hset.add("IronMan");
		hset.add("Captian");
		hset.add("Vision");

		System.out.println("Avengers :" + hset);

		hset.add("Thor");
		hset.add("Witch");
		
		System.out.println("Avengers : " + hset);
		
		

	}

}
