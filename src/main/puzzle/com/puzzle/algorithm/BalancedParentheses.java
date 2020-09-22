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
		Deque<Character> arrayDeque = new ArrayDeque<Character>();
		for (int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				arrayDeque.push(c);
			} else if (c == ']') {
				if (arrayDeque.isEmpty() || arrayDeque.pop() != '[') {
					return false;
				}
			} else if (c == ')') {
				if (arrayDeque.isEmpty() || arrayDeque.pop() != '(') {
					return false;
				}
			} else if (c == '}') {
				if (arrayDeque.isEmpty() || arrayDeque.pop() != '{') {
					return false;
				}
			}
		}
		return (arrayDeque.isEmpty());
	}
}
