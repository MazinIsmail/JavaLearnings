package com.dry.learnings;

/**
 * DRY Principle
 * 
 * Don't Repeat Yourself (DRY) principle is a common principle across
 * programming paradigms. Every piece of knowledge or logic must have a single,
 * unambiguous representation within a system. Utilize abstract classes,
 * interfaces, and public constants. Whenever there's a functionality common
 * across classes, it either might make sense to abstract them away into a
 * common parent class or use interfaces to couple their functionality.
 * 
 * Reducing the duplication of code.
 * Reducing the duplication of code.
 * Reducing the duplication of code.
 */
public class DryPrinciple {

	/*
	 * When there's a constant that's used multiple times, it's good practice to
	 * define it as a public constant.
	 */
	public static final int THREAD_POOL = 5000;

	public static void main(String[] args) {
		duplicateCodes();
		betterWay();
	}

	private static void duplicateCodes() {
		int length = 3, width = 3, height = 3, volume = 0;
		volume = length * width * height;
		System.out.println("The volume of rectangular prism #1 is " + volume);

		length = 6;
		width = 5;
		height = 4;
		volume = length * width * height;
		System.out.println("The volume of rectangular prism #2 is " + volume);
	}

	private static void betterWay() {
		System.out.println("The volume of rectangular prism #1 is " + calculateVolume(3, 3, 3));
		System.out.println("The volume of rectangular prism #2 is " + calculateVolume(6, 5, 4));
	}

	public static int calculateVolume(int length, int width, int height) {
		return length * width * height;
	}
}
