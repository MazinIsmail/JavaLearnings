package com.puzzle.string;

public class CountYZ {

	public static void main(String[] args) {
		System.out.println(countYZ("sdf "));
		System.out.println(countYZ("day fez"));
		System.out.println(countYZ("day yak"));
		System.out.println(countYZ("day:yak"));
		System.out.println(countYZ("!!day--yaz!!"));
		System.out.println(countYZ("DAY abc XYZ"));
		System.out.println(countYZ("aaz yyz my"));
		System.out.println(countYZ("y2bz"));
		System.out.println(countYZ("zxyx"));
		System.out.println(countYZ("zxyx aedf asfz^&("));
	}

	/*
	 * Counts the number of words ending in 'y' or 'z' (not case sensitive). 'y' or
	 * 'z' is at the end of a word if there is not an alphabetic letter immediately
	 * following it.
	 */
	public static int countYZ(String str) {
		char[] charString = str.toCharArray();
		int count = 0;
		Integer startWordCharIndex = null;
		for (int i = 0; i < charString.length; i++) {
			char charValue = charString[i];
			boolean alphaCheck = isAlpha(charValue);
			if (alphaCheck) {
				// Word Starting Point
				for (int j = i; j < charString.length; j++) {
					charValue = charString[j];
					alphaCheck = isAlpha(charValue);
					if (alphaCheck) {
						if (j == charString.length - 1) {
							if (isZYCheck(charString[j])) {
								count++;
							}
							i = j;
							break;
						}
						continue;
					} else {
						i = j;
						if (isZYCheck(charString[--j])) {
							count++;
						}
						break;
					}
				}
			}
		}
		return count;
	}

	/**
	 * Checks if the char is a alphabet or not.
	 */
	private static boolean isAlpha(char charValue) {
		return (charValue >= 65 && charValue <= 90) || (charValue >= 97 && charValue <= 122);
	}

	/**
	 * Checks if the char is 'z', 'Z', 'y', 'Y' or not.
	 */
	private static boolean isZYCheck(char c) {
		char[] zyChar = { 'z', 'Z', 'y', 'Y' };
		for (char x : zyChar) {
			if (x == c) {
				return true;
			}
		}
		return false;
	}
}
