package com.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

class Student {
	public String name;
};

public class HashSetObjectParamExample {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Rocky";
		Student s2 = new Student();
		s2.name = "Rocky";

		// Printing Hashcode
		System.out.println("Object S1:" + s1.hashCode());
		System.out.println("Object S2:" + s2.hashCode());

		HashSet<Student> hset = new HashSet<Student>();
		hset.add(s1);
		hset.add(s2);
		hset.add(s1);

		Iterator<Student> Itr = hset.iterator();
		while (Itr.hasNext()) {
			System.out.println("Avengers : " + Itr.next().name);
		}

	}

}
