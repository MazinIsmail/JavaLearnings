package com.collections.hashSet;

import java.util.HashSet;

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
