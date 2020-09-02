package com.collections.hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * Hashing override
 */
public class HashSetHashCodeEquals {

	public static void main(String[] args) {
		HashSet<UserSample> userSampleSet = new HashSet<UserSample>();
		userSampleSet = createUserSampleSet();
		userSampleSet.forEach(element -> {
			System.out.println(element);
		});

		// Sorting HashSet using List
		System.out.println();
		List<UserSample> userSampleList = new ArrayList<UserSample>(userSampleSet);
		Comparator<UserSample> userSampleListByName = Comparator.comparing(UserSample::getName);
		Collections.sort(userSampleList, userSampleListByName);
		System.out.println("Sorted userSampleList by Name");
		userSampleList.forEach(element -> {
			System.out.println(element);
		});
		System.out.println();
		Comparator<UserSample> userSampleListByAge = Comparator.comparing(UserSample::getAge);
		Collections.sort(userSampleList, userSampleListByAge);
		System.out.println("Sorted userSampleList by Age");
		userSampleList.forEach(element -> {
			System.out.println(element);
		});
		System.out.println();
		// Sort first by Name and then sorts by Age.
		Comparator<UserSample> userSampleListByNameThenByAge = userSampleListByName.thenComparing(userSampleListByName);
		Collections.sort(userSampleList, userSampleListByNameThenByAge);
		System.out.println("Sorted userSampleList by Name and then by Age");
		userSampleList.forEach(element -> {
			System.out.println(element);
		});
	}

	private static HashSet<UserSample> createUserSampleSet() {
		HashSet<UserSample> userSampleSet = new HashSet<UserSample>();
		UserSample userSample1 = new UserSample();
		userSample1.setAge(23);
		userSample1.setDob("23/10/1988");
		userSample1.setLocation("Thalassery");
		userSample1.setName("Mazin Ismail");
		userSampleSet.add(userSample1);

		UserSample userSample2 = new UserSample();
		userSample2.setAge(23);
		userSample2.setDob("21/10/1988");
		userSample2.setLocation("Kannur");
		userSample2.setName("Maz");
		userSampleSet.add(userSample2);

		UserSample userSample3 = new UserSample();
		userSample3.setAge(25);
		userSample3.setDob("21/10/1988");
		userSample3.setLocation("Kannur");
		userSample3.setName("Maz");
		userSampleSet.add(userSample3);

		UserSample userSample31 = new UserSample();
		userSample31.setAge(28);
		userSample31.setDob("21/10/1988");
		userSample31.setLocation("Kannur");
		userSample31.setName("Maz");
		userSampleSet.add(userSample31);

		UserSample userSample32 = new UserSample();
		userSample32.setAge(27);
		userSample32.setDob("21/10/1988");
		userSample32.setLocation("Kannur");
		userSample32.setName("Maz");
		userSampleSet.add(userSample32);

		UserSample userSample4 = new UserSample();
		userSample4.setAge(24);
		userSample4.setDob("21/10/1988");
		userSample4.setLocation("Kannur");
		userSample4.setName("Mbz");
		userSampleSet.add(userSample4);

		System.out.println("userSample1 hasCode: " + userSample1.hashCode());
		System.out.println("userSample2 hasCode: " + userSample2.hashCode());

		UserSample userSample21 = new UserSample();
		userSample21.setAge(23);
		userSample21.setDob("21/10/1988");
		userSample21.setLocation("Kannur");
		userSample21.setName("Maz");
		userSampleSet.add(userSample21);
		System.out.println("userSample21 hasCode: " + userSample21.hashCode());
		System.out.println("userSampleSet contains: " + userSampleSet.contains(userSample21));
		return userSampleSet;
	}

}
