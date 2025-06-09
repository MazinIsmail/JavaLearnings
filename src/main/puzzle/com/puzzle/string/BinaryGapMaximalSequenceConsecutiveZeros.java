package com.puzzle.string;

public class BinaryGapMaximalSequenceConsecutiveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(9)); // 1001
		System.out.println(solution(529)); // 1000010001
		System.out.println(solution(32)); // 1000010001

	}

	public static int solution(int N) {
		// Implement your solution here
		StringBuilder binary = new StringBuilder();
		while (N > 0) {
			binary.append(N % 2);
			N = N / 2;
		}
		System.out.print(binary);
		System.out.println();
		int maxCount = 0;
		int count = 0;
		int startIndex = 0;

		while (startIndex < binary.length() && binary.charAt(startIndex) == '0') {
			startIndex++;
		}
		for (int i = startIndex; i < binary.length(); i++) {

			if (binary.charAt(i) == '0') {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
				}
				count = 0;
			}

		}
		return maxCount;
	}

}
