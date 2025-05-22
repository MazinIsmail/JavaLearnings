package com.puzzle.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
	}

	/**
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 * 
	 * @param s
	 * @return
	 */
	// Time complexity: O(n)
	// Space complexity: O(n)
	// Using Stack

	public static boolean isValid(String s) {
		// Create hashmap to store the pairs of parentheses
		Map<Character, Character> mapPair = new HashMap<Character, Character>();
		mapPair.put(')', '(');
		mapPair.put('}', '{');
		mapPair.put(']', '[');

		// Create a stack to store the opening parentheses
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			// Get the current character
			char charValue = s.charAt(i);
			if (charValue == '(' || charValue == '{' || charValue == '[') {
				// If the character is an opening parenthesis, push it onto the stack
				stack.push(charValue);
				continue;
			}

			// If the character is a closing parenthesis
			if (charValue == ')' || charValue == '}' || charValue == ']') {
				// If the stack is empty or
				// the top of the stack does not match the current closing parenthesis,
				// return false
				if (stack.isEmpty() || stack.peek() != mapPair.get(charValue)) {
					return false;
				}
				// Pop the top of the stack
				stack.pop();
			}
		}

		if (stack.size() == 0) {
			// If the stack is empty, all parentheses are matched
			return true;
		} else {
			// If the stack is not empty, there are unmatched opening parentheses
			return false;
		}
	}

}
