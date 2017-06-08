package mazin.certification.classes;

import java.util.Arrays;

public class ArraySortQuest {
	public static void main(String[] args) {
		String[] colors = {"blue", "red", "green", "yellow", "orange"};
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violet");
		System.out.println(s2 + " " + s3);
		
		sort();
	}

	public static void sort() {
		String[] colors = {"blue", "red", "green", "yellow", "orange"};
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "a");
		int s4 = Arrays.binarySearch(colors, "violet");
		int s5 = Arrays.binarySearch(colors, "p");
		int s6 = Arrays.binarySearch(colors, "x");
		int s66 = Arrays.binarySearch(colors, "yellow");
		int s7 = Arrays.binarySearch(colors, "zz");
		System.out.println(s2 + " " + s3 + " " + s4 + " " + s5 + " " + s6 + " " + s66 + " " + s7);
		
		String[] colors22 = {"blue", "red", "green", "yellow", "orange", "a", "voilet", "p", "x","zz"};
		Arrays.sort(colors22);
		int s17 = Arrays.binarySearch(colors22, "zz");
	}

}