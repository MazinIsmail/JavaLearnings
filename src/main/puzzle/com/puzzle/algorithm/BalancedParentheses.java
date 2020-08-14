package com.puzzle.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {
	public static void main(String[] args) {
		String expr = "([{}])";
		if (isParanthesisBalanced(expr))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

	static boolean isParanthesisBalanced(String expr) {

		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}
			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			switch (x) {
			case ')':
				stack.pop();
				if (x == '{' || x == '[')
					return false;
				break;
			case '}':
				stack.pop();
				if (x == '(' || x == '[')
					return false;
				break;
			case ']':
				stack.pop();
				if (x == '(' || x == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
