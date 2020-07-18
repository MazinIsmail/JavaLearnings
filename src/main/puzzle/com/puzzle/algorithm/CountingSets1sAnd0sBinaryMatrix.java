package com.puzzle.algorithm;

/*
 * 
 * Input:
 * 1 0 1
 * 0 1 0 
 * 
 * Output: 8 
 * Explanation: There are six one-element sets
 * (three 1s and three 0s). There are two two-
 * element sets, the first one consists of the
 * first and the third cells of the first row.
 * The second one consists of the first and the 
 * third cells of the second row. 
 * 
 * Input: 
 * 1 0
 * 1 1 
 * 
 * Output: 6
 * 
 * The number of non-empty subsets of x elements is 2x – 1.
 * We traverse every row and calculate numbers of 1’s and 0’s cells.
 * For every u zeros and v ones, total sets is 2u – 1 + 2v – 1.
 * We then traverse all columns and compute same values and compute overall sum.
 * We finally subtract m x n from the overall sum as single elements are considered twice.
 * 
 * Time Complexity: O(n * m)
*/
public class CountingSets1sAnd0sBinaryMatrix {
	static final int m = 3; // no of columns
	static final int n = 2; // no of rows

	// function to calculate the number of
	// non empty sets of cell
	static long countSets(int a[][]) {

		// stores the final answer
		long res = 0;

		// traverses row-wise
		for (int i = 0; i < n; i++) {
			int u = 0, v = 0;
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 1)
					u++;
				else
					v++;
			}
			res += Math.pow(2, u) - 1 + Math.pow(2, v) - 1;
		}

		// traverses column wise
		for (int i = 0; i < m; i++) {
			int u = 0, v = 0;
			for (int j = 0; j < n; j++) {
				if (a[j][i] == 1)
					u++;
				else
					v++;
			}
			res += Math.pow(2, u) - 1 + Math.pow(2, v) - 1;
		}

		// at the end subtract n*m as no of
		// single sets have been added twice.
		return res - (n * m);
	}

	// Driver code
	public static void main(String[] args) {
		int a[][] = { { 1, 0, 1 }, { 0, 1, 0 } };

		System.out.print(countSets(a));
	}
}
