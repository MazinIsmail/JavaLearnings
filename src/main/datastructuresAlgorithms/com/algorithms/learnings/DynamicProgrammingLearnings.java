package com.algorithms.learnings;

/**
 * Dynamic programming approach is similar to divide and conquer in breaking
 * down the problem into smaller and yet smaller possible sub-problems. But
 * unlike, divide and conquer, these sub-problems are not solved independently.
 * Rather, results of these smaller sub-problems are remembered and used for
 * similar or overlapping sub-problems.
 * 
 * Dynamic programming is used where we have problems, which can be divided into
 * similar sub-problems, so that their results can be re-used. Mostly, these
 * algorithms are used for optimization. Before solving the in-hand sub-problem,
 * dynamic algorithm will try to examine the results of the previously solved
 * sub-problems. The solutions of sub-problems are combined in order to achieve
 * the best solution.
 * 
 * Comparison:-
 * 
 * In contrast to greedy algorithms, where local optimization is addressed,
 * dynamic algorithms are motivated for an overall optimization of the problem.
 * 
 * In contrast to divide and conquer algorithms, where solutions are combined to
 * achieve an overall solution, dynamic algorithms use the output of a smaller
 * sub-problem and then try to optimize a bigger sub-problem. Dynamic algorithms
 * use Memoization to remember the output of already solved sub-problems.
 * 
 * Example:-
 * 
 * Fibonacci number series
 * 
 * Knapsack problem
 * 
 * Tower of Hanoi
 * 
 * All pair shortest path by Floyd-Warshall
 * 
 * Shortest path by Dijkstra
 * 
 * Project scheduling
 * 
 * Dynamic programming can be used in both top-down and bottom-up manner. And of
 * course, most of the times, referring to the previous solution output is
 * cheaper than recomputing in terms of CPU cycles.
 */
public class DynamicProgrammingLearnings {

}
