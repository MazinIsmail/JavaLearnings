package com.collections.arrayList;

import java.util.*;

public class ArrayListUserDefined {

	public static void main(String args[]) {
		// Creating user-defined class objects and passing values
		Student s1 = new Student(101, "Bella", 23);
		Student s2 = new Student(102, "Micky", 21);
		Student s3 = new Student(103, "Natalya", 25);

		// creating Arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		// Getting Iterator
		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("Student ArrayList: " + al);

		ArrayList<Student> alObj = new ArrayList<Student>();
		alObj.add(s1);// adding Student class object
		alObj.add(s2);
		alObj.add(s3);
		// Getting Iterator
		Iterator itrAlObj = alObj.iterator();
		// traversing elements of ArrayList object
		while (itrAlObj.hasNext()) {
			Student stObj = (Student) itrAlObj.next();
			System.out.println(stObj.rollno + " " + stObj.name + " " + stObj.age);
		}
	}
}
