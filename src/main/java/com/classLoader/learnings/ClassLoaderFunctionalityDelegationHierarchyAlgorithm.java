package com.classLoader.learnings;

/**
 * Principles of functionality of a Java ClassLoader
 * 
 * Principles of functionality are the set of rules or features on which a Java
 * ClassLoader works. There are three principles of functionality:-
 * 
 * 1. Delegation Model
 * 
 * 2. Visibility Principle
 * 
 * 3. Uniqueness Property
 * 
 * 
 * 1. Delegation Model: The Java Virtual Machine and the Java ClassLoader use an
 * algorithm called the Delegation Hierarchy Algorithm to Load the classes into
 * the Java file.
 * 
 * The ClassLoader works based on a set of operations given by the delegation
 * model. They are:-
 * 
 * ClassLoader always follows the Delegation Hierarchy Principle.
 * 
 * Whenever JVM comes across a class, it checks whether that class is already
 * loaded or not.
 * 
 * If the Class is already loaded in the method area then the JVM proceeds with
 * execution.
 * 
 * If the class is not present in the method area then the JVM asks the Java
 * ClassLoader Sub-System to load that particular class, then ClassLoader
 * sub-system hands over the control to Application ClassLoader.
 * 
 * Application ClassLoader then delegates the request to Extension ClassLoader
 * and the Extension ClassLoader in turn delegates the request to Bootstrap
 * ClassLoader.
 * 
 * Bootstrap ClassLoader will search in the Bootstrap classpath(JDK/JRE/LIB). If
 * the class is available then it is loaded, if not the request is delegated to
 * Extension ClassLoader.
 * 
 * Extension ClassLoader searches for the class in the Extension
 * Classpath(JDK/JRE/LIB/EXT). If the class is available then it is loaded, if
 * not the request is delegated to the Application ClassLoader.
 * 
 * Application ClassLoader searches for the class in the Application Classpath.
 * If the class is available then it is loaded, if not then a
 * ClassNotFoundException exception is generated.
 */
public class ClassLoaderFunctionalityDelegationHierarchyAlgorithm {

}
