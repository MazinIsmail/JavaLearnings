package com.currencyBalance.design;

import java.time.YearMonth;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BalanceCalculator calculator = new BalanceCalculator();

		// Step 1: Simulate loading transactions (from a file/database)
		System.out.println("Loading all transactions...");
		List<Transaction> allTransactions = calculator.loadTransactionsFromFile();
		System.out.println("Total transactions loaded: " + allTransactions.size());

		// Step 2: Define the target month for balance calculation
		// Let's calculate for May 2025
		YearMonth targetMonth = YearMonth.of(2025, 5);
		System.out.println("\nCalculating end-of-month balances for: " + targetMonth);

		// Step 3: Calculate the balances
		List<CurrencyBalance> monthlyBalances = calculator.calculateMonthlyBalances(allTransactions, targetMonth);

		// Step 4: Display/Store the results
		if (monthlyBalances.isEmpty()) {
			System.out.println("No currency activity found for " + targetMonth + ".");
		} else {
			System.out.println("\n--- End-of-Month Balances for " + targetMonth.atEndOfMonth() + " ---");
			for (CurrencyBalance balance : monthlyBalances) {
				System.out.println(String.format("  Currency: %s, Balance: %s", balance.getCurrencyCode(),
						balance.getEndingBalance()));
				// In a real application, you would persist this `balance` object to your
				// database.
				// For example: balanceRepository.save(balance);
			}
			System.out.println("----------------------------------------------");
		}

		// Let's calculate for June 2025 as well
		YearMonth nextTargetMonth = YearMonth.of(2025, 6);
		System.out.println("\nCalculating end-of-month balances for: " + nextTargetMonth);
		List<CurrencyBalance> nextMonthlyBalances = calculator.calculateMonthlyBalances(allTransactions,
				nextTargetMonth);

		if (nextMonthlyBalances.isEmpty()) {
			System.out.println("No currency activity found for " + nextTargetMonth + ".");
		} else {
			System.out.println("\n--- End-of-Month Balances for " + nextTargetMonth.atEndOfMonth() + " ---");
			for (CurrencyBalance balance : nextMonthlyBalances) {
				System.out.println(String.format("  Currency: %s, Balance: %s", balance.getCurrencyCode(),
						balance.getEndingBalance()));
			}
			System.out.println("----------------------------------------------");
		}
	}
}
