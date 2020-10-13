package com.classLoader.learnings;

/**
 * Visibility Principle
 * 
 * The Visibility Principle states that a class loaded by a parent ClassLoader
 * is visible to the child ClassLoaders but a class loaded by a child
 * ClassLoader is not visible to the parent ClassLoaders. Suppose a class
 * Sample.class has been loaded by the Extension ClassLoader, then that class is
 * only visible to the Extension ClassLoader and Application ClassLoader but not
 * to the Bootstrap ClassLoader. If that class is again tried to load using
 * Bootstrap ClassLoader it gives an exception java.lang.ClassNotFoundException.
 * 
 */
public class ClassLoaderFunctionalityVisibilityPrinciple {

}
