package com.javamemorymanagement.learning;

/**
 * Code Cache:-
 * 
 * When a Java program is run, it executes the code in a tiered manner. In the
 * first tier, it uses the client compiler (C1 compiler) in order to compile the
 * code with instrumentation. The profiling data is used in the second tier (C2
 * compiler) for the server compiler, to compile that code in an optimized
 * manner. The tiered compilation is not enabled by default in Java 7, but is
 * enabled in Java 8.
 * 
 * The Just-In-Time (JIT) compiler stores the compiled code in an area called
 * code cache. It is a special heap that holds the compiled code.
 */
public class JMMCodeCache {

}
