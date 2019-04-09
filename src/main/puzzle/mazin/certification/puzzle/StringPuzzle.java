package mazin.certification.puzzle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class StringPuzzle {

	static String intro;
	static String intro2;

	public StringPuzzle() {

	}

	public static void main(String args[]) {
//		strReversal("This is a String");
		strWordReversal("This is a String");
		/*
		 * String original, reverse = ""; Scanner in = new Scanner(System.in);
		 * System.out.println("Enter a string to reverse"); original = in.nextLine();
		 * 
		 * int length = original.length(); reverseString(original, reverse, length);
		 * 
		 * StringBuffer wordReverse = reverseWordByWord(original);
		 * System.out.println("Reverse of words string is: " + wordReverse);
		 * 
		 * StringBuffer wordSort = sortString(original);
		 * System.out.println("Sort of words: " + wordSort);
		 * 
		 * String wordSortTree = sortTree(original);
		 * System.out.println("Sort of words using Tree: " + wordSortTree);
		 * 
		 * converttonumber(original); largestnext();
		 */
	}

	public static void reverseString(String original, String reverse, int length) {
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);
	}

	public static StringBuffer reverseWordByWord(String str) {
		int strLeng = str.length() - 1;
		StringBuffer reverse = new StringBuffer(), temp = new StringBuffer();

		for (int i = 0; i <= strLeng; i++) {
			temp = temp.append(str.charAt(i));

			if ((str.charAt(i) == ' ') || (i == strLeng)) {
				reverse = reverse.append(temp.reverse());
				reverse.append(" ");
				temp = new StringBuffer("");
			}

		}
		return reverse;
	}

	public static StringBuffer sortString(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		StringBuffer sorted = new StringBuffer();
		sorted.append(chars);
		return sorted;
	}

	public static String sortTree(String str) {
		TreeSet<String> treeset = new TreeSet<String>();
		String[] strings = str.split("");
		for (int i = 0; i < str.length(); i++) {
			treeset.add(strings[i]);
		}
		return treeset.toString();
	}

	public static void converttonumber(String str) {
		final HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// or map = new HashMap<Character, Integer> if you are using something before
		// Java 7.
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);
		map.put('g', 7);
		map.put('h', 8);
		map.put('i', 9);
		map.put('j', 10);
		map.put('k', 11);
		map.put('l', 12);
		map.put('m', 13);
		map.put('n', 14);
		map.put('o', 15);
		map.put('p', 16);
		map.put('q', 17);
		map.put('r', 18);
		map.put('s', 19);
		map.put('t', 20);
		map.put('u', 21);
		map.put('v', 22);
		map.put('w', 23);
		map.put('x', 24);
		map.put('y', 25);
		map.put('z', 26);
		Integer val = null;
		StringBuffer sytbuff = new StringBuffer();
		for (char c : str.toCharArray()) {
			val = map.get(c);
			if (val == null) {
				// some sort of error
			} else {
				sytbuff = sytbuff.append(val);
			}
		}
		System.out.println(sytbuff);
	}

	public static void largestnext() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String str = sca.nextLine();
		int n = Integer.parseInt(str);

		String n1 = n + "";
		char c[] = n1.toCharArray();
		char[] c1 = c;
		for (int i = c.length - 1; i >= 1; i--) {
			if (c[i - 1] > c[i]) {
				continue;
			} else {
				int index = check(c, c[i - 1]);
				char temp = c[i - 1];
				c[i - 1] = c[index];
				c[index] = temp;
				Arrays.sort(c, i, c.length);
				break;
			}

		}

		StringBuffer sttt = new StringBuffer();
		sttt.append(c);
		System.out.println(sttt);
		Arrays.sort(c1);
		System.out.println(c1);

	}

	private static int check(char a[], int j) {
		int k;
		for (k = a.length - 1; k >= 0; k--) {
			if (a[k] > j)
				break;
		}
		return k;
	}

	/**
	 * input:- This is a String, output:- String a is This
	 */
	public static void strReversal(String str) {
		char[] charArr = str.toCharArray();
		int i = 0;
		String outstr = "";
		String tempstr = "";
		while (i < charArr.length) {
			if ((i == charArr.length - 1) || (charArr[i] == ' ')) {
				if ((i == charArr.length - 1)) {
					tempstr = tempstr + charArr[i];
				}
				outstr = tempstr + " " + outstr;
				tempstr = "";
			} else {
				tempstr = tempstr + charArr[i];
			}
			i++;
		}
		System.out.println(outstr);
	}

	public static void strWordReversal(String str) {
		String tmpString = "";
		tmpString = tmpString + reverseWord(str);
		System.out.println(tmpString);
	}

	private static String reverseWord(String str) {
		int length = str.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}
