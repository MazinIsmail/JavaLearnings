package com.javamemorymanagement.learning;

/**
 * Metaspace
 * 
 * Permanent Generation (Replaced by Metaspace since Java 8)
 * 
 * Permanent Generation or �Perm Gen contains the application metadata required
 * by the JVM to describe the classes and methods used in the application. Perm
 * Gen is populated by JVM at runtime based on the classes used by the
 * application. Perm Gen also contains Java SE library classes and methods.
 * 
 * With Java 8, there is no Perm Gen, which means there is no more
 * java.lang.OutOfMemoryError: PermGen space problems. Unlike Perm Gen which
 * resides in the Java heap, Metaspace is not part of the heap.
 * 
 * Metaspace by default auto increases its size (up to what the underlying OS
 * provides), while Perm Gen always has fixed maximum size.
 * 
 * Since Metaspace can grow dynamically, monitoring its size and usage is
 * crucial to prevent system memory from being exhausted. Java provides several
 * options for monitoring and managing the size of Metaspace, such as
 * -XX:MetaspaceSize and -XX:MaxMetaspaceSize, which allow developers to set
 * initial and maximum Metaspace sizes, respectively.
 * 
 * Method Area:
 * 
 * Method Area is part of space in the Perm Gen and used to store class
 * structure (runtime constants and static variables) and code for methods and
 * constructors.
 */
public class JMMMetaspace {

}
