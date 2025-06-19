package com.puzzle.string;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Tree transformation new children with parent value
 * 
 * The problem focuses on a data structure called binary tree.
 * 
 * A node of binary tree has an ID (an integer value) and pointers to two other
 * nodes, called the left subtree and the right subtree.
 * 
 * If the left subtree or right subtree does not exist, the pointer is null.
 * 
 * Your task is to expand the binary tree by adding a new node with the given ID
 * as the root of the tree. with a new node whose subtrees are both leaves. The
 * IDs of each new node and its two leaves should correspond to the ID of the
 * leaf they replaced.
 * 
 * It's a tree transformation process that adds two new children (a left and a
 * right child) to every existing leaf node, with each new child having the same
 * value as its parent leaf node.
 */
public class TreeTransformationNewChildrenWithParentValue {
	public static void main(String[] args) {
		// ,<
		// Construct the initial binary tree.
		// 8
		// / \
		// 3 10
		// / \
		// 1 14
		Tree root = new Tree(8);
		root.l = new Tree(3);
		root.r = new Tree(10);
		root.l.l = new Tree(5);
		root.r.r = new Tree(1);

		System.out.println("Original Binary Tree (Level Order Traversal):");
		printTree(root);
		System.out.println("\n---------------------------------------------\n");

		// Expand the binary tree.
		root = solution(root);
		System.out.println("\n---------------------------------------------\n");
		System.out.println("Expanded Binary Tree (Level Order Traversal):");
		// The expected output should show new children for nodes 1 and 14.
		// 8
		// / \
		// 3 10
		// / \
		// 1 14
		// / \ / \
		// 1 1 14 14
		printTree(root);
	}

	public static Tree solution(Tree T) {
		// Implement your solution here
		if (T == null) {
			return null;
		}

		if (T.l == null && T.r == null) {
			T.l = new Tree();
			T.l.x = T.x;
			T.l.l = null;
			T.l.r = null;

			T.r = new Tree();
			T.r.x = T.x;
			T.r.l = null;
			T.r.r = null;
		} else {
			T.l = solution(T.l);
			T.r = solution(T.r);
		}

		return T;
	}

	static class Tree {
		public int x;
		public Tree l;
		public Tree r;

		// Default constructor
		public Tree() {
			this.x = 0;
			this.l = null;
			this.r = null;
		}

		public Tree(int x) {
			this.x = x;
			this.l = null;
			this.r = null;
		}
	}

	public static void printTree(Tree root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return;
		}

		Queue<Tree> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			for (int i = 0; i < levelSize; i++) {
				Tree currentNode = queue.poll();
				System.out.print(currentNode.x + " ");
				if (currentNode.l != null) {
					queue.add(currentNode.l);
				}
				if (currentNode.r != null) {
					queue.add(currentNode.r);
				}
			}
			System.out.println(); // Newline for the next level
		}
	}
}
