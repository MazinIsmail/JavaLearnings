package com.puzzle.algorithm;

/**
 * A binary gap within a positive integer N is any maximal sequence of
 * consecutive zeros that is surrounded by ones at both ends in the binary
 * representation of N. For example, number 9 has binary representation 1001 and
 * contains a binary gap of length 2. The number 529 has binary representation
 * 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains one binary gap of
 * length 1. The number 15 has binary representation 1111 and has no binary
 * gaps. The number 32 has binary representation 100000 and has no binary gaps.
 */
public class BinaryGap {
	public static void main(String[] args) {
		int n = 9; // 1001
		int gap = binaryGap(n);
		System.out.println(gap);
	}

	private static int binaryGap(int n) {
		int maxGap = 0;
		int currGap = 0;
		String binaryNum = Integer.toBinaryString(n);
		System.out.println("Binary of the number: " + binaryNum);

		for (int i = 0; i < binaryNum.length(); i++) {
			if (binaryNum.charAt(i) == '0') {
				currGap++;
			} else {
				if (currGap > maxGap) {
					maxGap = currGap;
				}
				currGap = 0;
			}
		}

		return maxGap;
	}

}
