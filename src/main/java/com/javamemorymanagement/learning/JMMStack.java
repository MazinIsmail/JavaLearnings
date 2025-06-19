package com.javamemorymanagement.learning;

/**
 * Stack:-
 * 
 * Stack memory is responsible for holding references to heap objects and for
 * storing value types (also known in Java as primitive types), which hold the
 * value itself rather than a reference to an object from the heap.
 * 
 * Used for storing short-lived variables and method call information.
 * 
 * Variables on the stack have a certain visibility, also called scope. Only
 * objects from the active scope are used. For example, assuming that we do not
 * have any global scope variables (fields), and only local variables, if the
 * compiler executes a method�s body, it can access only objects from the stack
 * that are within the method�s body. It cannot access other local variables, as
 * those are out of scope. Once the method completes and returns, the top of the
 * stack pops out, and the active scope changes.
 * 
 * Stack memory in Java is allocated per Thread. Therefore, each time a Thread
 * is created and started, it has its own stack memory � and cannot access
 * another thread�s stack memory.
 */
public class JMMStack {

}
