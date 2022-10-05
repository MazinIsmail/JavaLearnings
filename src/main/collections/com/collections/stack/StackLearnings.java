package com.collections.stack;

import java.util.Stack;

/**
 * In stack, elements are stored and accessed in Last In First Out manner. That
 * is, elements are added to the top of the stack and removed from the top of
 * the stack.
 * 
 * Use ArrayDeque Instead of Stack
 */
public class StackLearnings {
	public static void main(String[] args) {
		Stack<String> stacks = new Stack<>();
		// Add elements to Stack
		stacks.push("Dog");
		stacks.push("Horse");
		stacks.push("Cat");
		System.out.println("Stack: " + stacks);

		// Remove element stacks
		String elementRemoved = stacks.pop();
		System.out.println("Removed Element: " + elementRemoved);

		// Access element from the top
		String elementAccess = stacks.peek();
		System.out.println("Element at top: " + elementAccess);

		// Search an element
		int position = stacks.search("Horse");
		System.out.println("Position of Horse: " + position);

		// Check if stack is empty
		boolean emptyCheck = stacks.empty();
		System.out.println("Empty Check: " + emptyCheck);
	}
}
