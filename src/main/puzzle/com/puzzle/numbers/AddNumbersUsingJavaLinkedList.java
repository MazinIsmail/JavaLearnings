package com.puzzle.numbers;

/**
 * AddNumbersUsingJavaLinkedList
 * 
 * Adds two numbers represented by LinkedLists of integers (digits stored in
 * reverse order) and returns a new LinkedList representing their sum. Each
 * integer in the LinkedList should be a single digit (0-9).
 */
public class AddNumbersUsingJavaLinkedList {

	/**
	 * Helper method to convert an integer into a LinkedList of its digits, with
	 * digits stored in reverse order (least significant first). E.g., 342 -> [2, 4,
	 * 3]
	 *
	 * @param number The integer to convert.
	 * @return A LinkedList of integers representing the digits.
	 */
	public MyCustomLinkedList<Integer> convertIntToLinkedList(int number) {
		MyCustomLinkedList<Integer> digits = new MyCustomLinkedList<>();
		if (number == 0) {
			digits.add(0);
			return digits;
		}
		while (number > 0) {
			digits.add(number % 10);
			number /= 10;
		}
		return digits;
	}

	/**
	 * @param l1 The first LinkedList of digits (e.g., [2, 4, 3] for 342).
	 * @param l2 The second LinkedList of digits (e.g., [5, 6, 4] for 465).
	 * @return A new LinkedList representing the sum (e.g., [7, 0, 8] for 807).
	 */
	public MyCustomLinkedList<Integer> addTwoNumbers(MyCustomLinkedList<Integer> l1, MyCustomLinkedList<Integer> l2) {
		MyCustomLinkedList<Integer> resultList = new MyCustomLinkedList<>();
		int carry = 0;
		int i = 0;
		int j = 0;
		// Loop as long as there are digits left in either list or a carry remains
		while (i < l1.size() || j < l2.size() || carry != 0) {
			int val1 = (i < l1.size()) ? l1.get(i) : 0;
			int val2 = (j < l2.size()) ? l2.get(j) : 0;

			int sum = val1 + val2 + carry;
			carry = sum / 10;
			int digit = sum % 10;

			resultList.add(digit);
			i++;
			j++;
		}
		return resultList;
	}

	/**
	 * Helper method to print a LinkedList of integers using a for-each loop.
	 *
	 * @param list The LinkedList to print.
	 */
	public void printLinkedList(MyCustomLinkedList<Integer> list) {
		if (list == null || list.isEmpty()) {
			System.out.println("Empty list");
			return;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i < list.size() - 1) {
				sb.append(" -> ");
			}
		}
		System.out.println(sb.toString());
	}

	/**
	 * Main method to test the AddNumbersUsingJavaLinkedList functionality.
	 */
	public static void main(String[] args) {
		// Create an instance of the class to access non-static methods
		AddNumbersUsingJavaLinkedList solver = new AddNumbersUsingJavaLinkedList();

		System.out.println("--- Test Case 1: Standard Addition ---");
		// Represents 342 (2 -> 4 -> 3)
		MyCustomLinkedList<Integer> l1 = solver.convertIntToLinkedList(342);
		System.out.print("List 1 (represents 342): ");
		solver.printLinkedList(l1);

		// Represents 465 (5 -> 6 -> 4)
		MyCustomLinkedList<Integer> l2 = solver.convertIntToLinkedList(465);
		System.out.print("List 2 (represents 465): ");
		solver.printLinkedList(l2);

		// Expected: 342 + 465 = 807 (result: 7 -> 0 -> 8)
		MyCustomLinkedList<Integer> result1 = solver.addTwoNumbers(l1, l2);
		System.out.print("Sum (expected 807): ");
		solver.printLinkedList(result1);
		System.out.println("------------------------------------");

		System.out.println("--- Test Case 2: Carry-over at the end ---");
		// Represents 99 (9 -> 9)
		MyCustomLinkedList<Integer> l3 = solver.convertIntToLinkedList(99);
		System.out.print("List 3 (represents 99): ");
		solver.printLinkedList(l3);

		// Represents 1 (1)
		MyCustomLinkedList<Integer> l4 = solver.convertIntToLinkedList(1);
		System.out.print("List 4 (represents 1): ");
		solver.printLinkedList(l4);

		// Expected: 99 + 1 = 100 (result: 0 -> 0 -> 1)
		MyCustomLinkedList<Integer> result2 = solver.addTwoNumbers(l3, l4);
		System.out.print("Sum (expected 100): ");
		solver.printLinkedList(result2);
		System.out.println("------------------------------------");

		System.out.println("--- Test Case 3: Different lengths & multiple carries ---");
		// Represents 123 (3 -> 2 -> 1)
		MyCustomLinkedList<Integer> l5 = solver.convertIntToLinkedList(123);
		System.out.print("List 5 (represents 123): ");
		solver.printLinkedList(l5);

		// Represents 4567 (7 -> 6 -> 5 -> 4)
		MyCustomLinkedList<Integer> l6 = solver.convertIntToLinkedList(4567);
		System.out.print("List 6 (represents 4567): ");
		solver.printLinkedList(l6);

		// Expected: 123 + 4567 = 4690 (result: 0 -> 9 -> 6 -> 4)
		MyCustomLinkedList<Integer> result3 = solver.addTwoNumbers(l5, l6);
		System.out.print("Sum (expected 4690): ");
		solver.printLinkedList(result3);
		System.out.println("------------------------------------");

		System.out.println("--- Test Case 4: Zeroes ---");
		MyCustomLinkedList<Integer> l7 = solver.convertIntToLinkedList(0);
		MyCustomLinkedList<Integer> l8 = solver.convertIntToLinkedList(0);
		System.out.print("List 7 (represents 0): ");
		solver.printLinkedList(l7);
		System.out.print("List 8 (represents 0): ");
		solver.printLinkedList(l8);
		MyCustomLinkedList<Integer> result4 = solver.addTwoNumbers(l7, l8);
		System.out.print("Sum (expected 0): ");
		solver.printLinkedList(result4);
		System.out.println("------------------------------------");

		System.out.println("--- Test Case 5: One list empty, one non-empty ---");
		MyCustomLinkedList<Integer> l9 = solver.convertIntToLinkedList(321); // Represents 321
		MyCustomLinkedList<Integer> l10 = new MyCustomLinkedList<>(); // An truly empty LinkedList

		System.out.print("List 9 (represents 321): ");
		solver.printLinkedList(l9);
		System.out.print("List 10 (empty): ");
		solver.printLinkedList(l10);
		MyCustomLinkedList<Integer> result5 = solver.addTwoNumbers(l9, l10);
		System.out.print("Sum (expected 321): ");
		solver.printLinkedList(result5);
		System.out.println("------------------------------------");
	}

	public static class CustomNode<T> {
		// The value stored in this node, now of generic type T
		T val;
		CustomNode<T> next;

		CustomNode(T val) {
			this.val = val;
			this.next = null;
		}
	}

	public static class MyCustomLinkedList<T> {
		private CustomNode<T> head;
		private int size; // We maintain size for O(1) size() access

		public MyCustomLinkedList() {
			this.head = null;
			this.size = 0;
		}

		// Method to add an element of type T to the end of your custom linked list
		public void add(T val) {
			CustomNode<T> newNode = new CustomNode<>(val);
			if (head == null) {
				head = newNode;
			} else {
				CustomNode<T> current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;
			}
			size++;
		}

		// Method to get an element by index.
		// Returns type T.
		public T get(int index) {
			if (index < 0 || index >= size) {
				return null; // Return null if out of bounds
			}
			CustomNode<T> current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current.val;
		}

		// Method to get the size of the custom linked list (O(1) due to cached size)
		public int size() {
			return size;
		}

		public boolean isEmpty() {
			return size == 0;
		}
	}

}