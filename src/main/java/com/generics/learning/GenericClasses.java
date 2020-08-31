package com.generics.learning;

/**
 * Generic Classes
 * 
 * A generic class declaration looks like a non-generic class declaration,
 * except that the class name is followed by a type parameter section.
 * 
 * The type parameter section of a generic class can have one or more type
 * parameters separated by commas. These classes are known as parameterized
 * classes or parameterized types because they accept one or more parameters.
 * 
 * Advantages of Generics:-
 * 
 * 1. Code Reuse: We can write a method/class/interface once and use for any
 * type we want.
 * 
 * 2. Type Safety:
 * 
 * ArrayList al = new ArrayList(); al.add("Sachin"); al.add("Rahul");
 * 
 * al.add(10); // Compiler allows this
 * 
 * At the time of defining ArrayList, we can specify that this list can take
 * only String objects.
 * 
 * // Creating a an ArrayList with String specified ArrayList <String> al = new
 * ArrayList<String> ();
 * 
 * al.add("Sachin"); al.add("Rahul");
 * 
 * // Now Compiler doesn't allow this
 * 
 * al.add(10);
 * 
 * 3. Individual Type Casting is not needed: If we already know that our list
 * only holds string data then we need not to typecast it every time.
 * 
 * 4. Implementing generic algorithms: By using generics, we can implement
 * algorithms that work on different types of objects and at the same they are
 * type safe too.
 */
public class GenericClasses<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		GenericClasses<Integer> integerBox = new GenericClasses<Integer>();
		GenericClasses<String> stringBox = new GenericClasses<String>();

		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));

		System.out.printf("Integer Value :%d\n\n", integerBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());
	}
}
