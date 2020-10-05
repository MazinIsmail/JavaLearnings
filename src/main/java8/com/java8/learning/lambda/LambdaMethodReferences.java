package com.java8.learning.lambda;

/**
 * You can reference the following types of methods:
 * 
 * Static method
 * 
 * Instance method on parameter objects
 * 
 * Instance method
 * 
 * Constructor
 */
public class LambdaMethodReferences {

	public static void main(String[] args) {
		PrinterSample printerSample = s -> System.out.println(s);
		/**
		 * Since all the lambda body does is forward the string parameter to the
		 * System.out.println() met hod, we can replace the above lambda declaration
		 * with a method reference.
		 * 
		 * Notice the double colons :: . These signal to the Java compiler that this is
		 * a method reference. The method referenced is what comes after the double
		 * colons. Whatever class or object that owns the referenced method comes before
		 * the double colons.
		 */
		printerSample = System.out::println;
		staticMethodReferences();
	}

	/**
	 * Static Method References
	 * 
	 * The easiest methods to reference are static methods.
	 */
	public static void staticMethodReferences() {
		/**
		 * Since the parameters of the Finder.find() and MyClass.doFind() methods match,
		 * it is possible to create a lambda expression that implements Finder.find()
		 * and references the NotFinder.doFind() method.
		 */
		FinderSample finderSample = NotFinder::doFind;
		System.out.println("staticMethodReferences: " + finderSample.find("123123", "3"));
	}

	/**
	 * Parameter Method Reference
	 * 
	 * You can also reference a method of one of the parameters to the lambda.
	 */
	public static void parameterMethodReference() {

		// Java lambda expression that calls String.indexOf() to search:
		FinderSample finderSample = String::indexOf;
		// This is equivalent of this lambda definition:
		finderSample = (s1, s2) -> s1.indexOf(s2);
		/*
		 * Notice how the shortcut version references a single method. The Java compiler
		 * will attempt to match the referenced method against the first parameter type,
		 * using the second parameter type as parameter to the referenced method.
		 */
	}

	/**
	 * Instance Method References
	 * 
	 * We can create an instance and reference.
	 */
	public static void instanceMethodReference() {

		class StringConverterSample {
			public int convertToInt(String v1) {
				return Integer.valueOf(v1);
			}
		}

		StringConverterSample stringConverterSample = new StringConverterSample();
		/*
		 * The convertToInt() method has the same signature. We can create an instance
		 * of StringConverterSample and reference its convertToInt() method from a Java
		 * lambda expression.
		 */
		ConverterSample converterSample = stringConverterSample::convertToInt;
	}

	/*
	 * Constructor References
	 * 
	 * You do that by writing the class name followed by ::new
	 */
	public static void constructorReferences() {
		FactorySample factorySample = String::new;
		// This is equivalent to this Java lambda expression:
		factorySample = chars -> new String(chars);
	}
}
