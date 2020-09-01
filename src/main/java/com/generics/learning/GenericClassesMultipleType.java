package com.generics.learning;

public class GenericClassesMultipleType<T, U> {
	private T obj1; // An object of type T
	private U obj2; // An object of type U

	GenericClassesMultipleType(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}

	public static void main(String[] args) {
		GenericClassesMultipleType<String, Integer> genericClassesMultipleType = new GenericClassesMultipleType<String, Integer>(
				"GfG", 15);
		genericClassesMultipleType.print();
		System.out.println();
		GenericClassesMultipleType<Integer, String> genericClassesMultipleTypeCheck = new GenericClassesMultipleType<Integer, String>(
				15, "GfG");
		genericClassesMultipleTypeCheck.print();
	}
}
