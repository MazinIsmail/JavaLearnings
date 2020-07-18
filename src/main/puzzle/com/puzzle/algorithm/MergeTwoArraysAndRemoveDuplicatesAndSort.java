package com.puzzle.algorithm;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoArraysAndRemoveDuplicatesAndSort {

	private static Set<Integer> mergeArraysAndRemoveDuplicatesAndSort(int[] arrayA, int[] arrayB) {

		Set<Integer> noDuplicatesAndSorted = new TreeSet<>();
		for (int i = 0; i < arrayA.length; i++) {
			noDuplicatesAndSorted.add(arrayA[i]);
		}
		for (int i = 0; i < arrayB.length; i++) {
			noDuplicatesAndSorted.add(arrayB[i]);
		}
		return noDuplicatesAndSorted;
	}

	public static void main(String[] args) {
		int[] arrayA = new int[] { 7, -5, 3, 8, -4, 11, -19, 21 };
		int[] arrayB = new int[] { 6, 13, -7, 0, 11, -4, 3, -5 };

		Set<Integer> mergedArray = mergeArraysAndRemoveDuplicatesAndSort(arrayA, arrayB);
		System.out.println("Array A : " + Arrays.toString(arrayA));
		System.out.println("Array B : " + Arrays.toString(arrayB));
		System.out.println("Sorted Merged Array With No Duplicates : ");
		System.out.println(mergedArray.toString());
	}
}
