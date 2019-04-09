package com.collections.hashSet;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("Vision");
		hset.add("DoctorStrange");
		hset.add("IronMan");
		hset.add("Captian");
		hset.add("Vision");

		System.out.println("Avengers :" + hset);

		hset.add("Thor");

		System.out.println("Avengers : " + hset);

	}

}
