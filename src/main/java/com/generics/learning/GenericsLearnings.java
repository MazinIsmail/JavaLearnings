package com.generics.learning;

/**
 * 
 * Generics provide strong compile-time type checking and reduces risk of
 * ClassCastException and explicit casting of objects.
 * 
 * We use <T> to create a generic class, interface, and method. The T is
 * replaced with the actual type when we use it.
 * 
 * Generic code ensures type safety. The compiler uses type-erasure to remove
 * all type parameters at the compile time to reduce the overload at runtime.
 * 
 * Generics doesn’t support sub-typing, so List<Number> numbers = new
 * ArrayList<Integer>(); will not compile.
 * 
 * We can’t create generic array, so List<Integer>[] array = new
 * ArrayList<Integer>[10] will not compile.
 */
public class GenericsLearnings {

}
