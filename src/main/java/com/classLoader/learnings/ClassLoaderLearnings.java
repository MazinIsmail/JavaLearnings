package com.classLoader.learnings;

/**
 * ClassLoader
 * 
 * The Java ClassLoader is a part of the Java Runtime Environment that
 * dynamically loads Java classes into the Java Virtual Machine. The Java run
 * time system does not need to know about files and file systems because of
 * classloaders.
 * 
 * Java classes arent loaded into memory all at once, but when required by an
 * application. At this point, the Java ClassLoader is called by the JRE and
 * these ClassLoaders load classes into memory dynamically.
 * 
 * Not all classes are loaded by a single ClassLoader. Depending on the type of
 * class and the path of class, the ClassLoader that loads that particular class
 * is decided. To know the ClassLoader that loads a class the getClassLoader()
 * method is used. All classes are loaded based on their names and if any of
 * these classes are not found then it returns a NoClassDefFoundError or
 * ClassNotFoundException.
 * 
 * A Java Classloader is of three types: -
 * 
 * 1. BootStrap ClassLoader: A Bootstrap Classloader is a Machine code which
 * kickstarts the operation when the JVM calls it. It is not a java class. Its
 * job is to load the first pure Java ClassLoader. Bootstrap ClassLoader loads
 * classes from the location rt.jar. Bootstrap ClassLoader doesn�t have any
 * parent ClassLoaders. It is also called as the Primodial ClassLoader.
 * 
 * 2. Extension ClassLoader: The Extension ClassLoader is a child of Bootstrap
 * ClassLoader and loads the extensions of core java classes from the respective
 * JDK Extension library. It loads files from jre/lib/ext directory or any other
 * directory pointed by the system property java.ext.dirs.
 * 
 * 3. System ClassLoader: An Application ClassLoader is also known as a System
 * ClassLoader. It loads the Application type classes found in the environment
 * variable CLASSPATH, -classpath or -cp command line option. The Application
 * ClassLoader is a child class of Extension ClassLoader.
 */
public class ClassLoaderLearnings {

}
