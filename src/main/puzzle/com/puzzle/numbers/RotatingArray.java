package com.puzzle.numbers;

import java.util.Arrays;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Rotated Array: " + rotateArray(new int[] { 1, 2, 3, 4, 5 }, 1));

	}

	/**
	 * Rotates the array to the right by k positions.
	 * 
	 * @param arr The array to be rotated.
	 * @param k   The number of positions to rotate.
	 * @return The rotated array as a string.
	 */
	public static String rotateArray(int[] arr, int k) {

		int n = arr.length;
		

		// Rotate array
		for (int i = 0; i < k; i++) {
			int last = arr[n - 1];
			// Shift elements to the right
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
			System.out.println("arr" + Arrays.toString(arr));
		}
		return arr.toString();

	}

}
