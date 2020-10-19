package com.classLoader.learnings;

import java.util.ArrayList;
import java.util.Collections;

/**
 * After the JVM requests for the class, a few steps are to be followed in order
 * to load a class. The Classes are loaded as per the delegation model but there
 * are a few important Methods or Functions that play a vital role in loading a
 * Class.
 * 
 * loadClass(String name, boolean resolve): This method is used to load the
 * classes which are referenced by the JVM. It takes the name of the class as a
 * parameter.
 * 
 * defineClass(): The defineClass() method is a final method and cannot be
 * overriden. This method is used to define a array of bytes as an instance of
 * class. If the class is invalid then it throws ClassFormatError.
 * 
 * findClass(String name): This method is used to find a specified class. This
 * method only finds but doesn’t load the class.
 * 
 * findLoadedClass(String name): This method is used to verify whether the Class
 * referenced by the JVM was previously loaded or not.
 * 
 * Class.forName(String name, boolean initialize, ClassLoader loader): This
 * method is used to load the class as well as initialize the class. This method
 * also gives the option to choose any one of the ClassLoaders. If the
 * ClassLoader parameter is NULL then Bootstrap ClassLoader is used.
 */
public class ClassLoaderMethods {
	public static void main(String[] args) throws ClassNotFoundException {

	}
}
