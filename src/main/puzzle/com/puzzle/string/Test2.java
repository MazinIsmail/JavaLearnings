package com.puzzle.string;

import java.util.LinkedList;

/**
 * 
 * Wrong Need Fix
 * 
 * There is a small, one-way bridge that can carry a maximum weight of U units
 * at a time. There is also a line of N cars waiting to cross the bridge. The
 * weights of the cars are given as an array weight.
 * 
 * . The weight of the K-th car in the line is weight[K]. (for K within the
 * range [0..N-1]). The car that will enter the bridge first weighs weight[0],
 * the car that will enter second weighs weight[1], and so on.
 * 
 * At most two cars can be on the bridge at the same time. To begin, the first
 * two cars in line will enter the bridge. Then the third car will enter the
 * bridge as soon as the first car leaves the bridge, the fourth car will enter
 * when the second car leaves, and so on. The cars leave the bridge in the same
 * order they entered it.
 * 
 * 
 * However, this may lead to a situation where cars exceed the bridge's weight
 * limit. To prevent such a situation, some drivers have to turn back. When a
 * driver turns back, all drivers behind them in line move one position closer
 * to the bridge. The driver who turns back is removed from the line and will
 * not try to cross the bridge again.
 * 
 * 
 * Your task is to find the minimum number of drivers that must turn back so
 * that the bridge will not be overloaded.
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 467, 15, 9, 20 };

		System.out.println("Drivers that must turn back: " + solution(10, new int[] { 5, 4, 3, 2, 1 }));

	}

	public static int solution(int U, int[] weight) {
		int N = weight.length;
		if (N == 0) {
			return 0;
		}
		LinkedList<Integer> bridgeCars = new LinkedList<>();
		int totalWeight = 0;
		int turnBacks = 0;
		int index = 0;

		while (index < N || !bridgeCars.isEmpty()) {
			if (index < N) {
				int currentCarWeight = weight[index];
				if (bridgeCars.size() < 2) {
					if (totalWeight + currentCarWeight <= U) {
						bridgeCars.offer(currentCarWeight);
						totalWeight += currentCarWeight;
						index++;
					} else {
						turnBacks++;
						index++;
					}
				} else if (bridgeCars.size() == 2) {
					int carLeavingWeight = bridgeCars.poll();
					totalWeight -= carLeavingWeight;
					if (totalWeight + currentCarWeight <= U) {
						bridgeCars.offer(currentCarWeight);
						totalWeight += currentCarWeight;
						index++;
					} else {
						turnBacks++;
						index++;
					}
				}
			} else {
				break;
			}
		}

		return turnBacks;
	}
}
