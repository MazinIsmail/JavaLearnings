package com.currencyBalance.design;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BalanceCalculator {

	public List<CurrencyBalance> calculateMonthlyBalances(List<Transaction> transactions, YearMonth targetMonth) {
		// Map to hold running balances for each currency
		// Key: Currency Code (e.g., "USD"), Value: Current Balance
		Map<String, BigDecimal> currencyNetBalances = new HashMap<>();

		// Determine the end date of the target month
		LocalDate balanceDate = targetMonth.atEndOfMonth();

		// Filter transactions for the target month and aggregate
		transactions.stream().filter(t -> YearMonth.from(t.getTransactionDate()).equals(targetMonth))
				.forEach(transaction -> {
					// Debit the 'from' currency
					currencyNetBalances.merge(transaction.getFromCurrency(), transaction.getFromAmount().negate(), // Subtract
																													// from
																													// 'from'
																													// currency
							BigDecimal::add);

					// Credit the 'to' currency
					currencyNetBalances.merge(transaction.getToCurrency(), transaction.getToAmount(), // Add to 'to'
																										// currency
							BigDecimal::add);
				});

		// Convert the map of balances into a list of CurrencyBalance objects
		List<CurrencyBalance> monthlyBalances = new ArrayList<>();
		for (Map.Entry<String, BigDecimal> entry : currencyNetBalances.entrySet()) {
			// Only add currencies that had some activity (or started with a balance)
			// In a real system, you might have initial balances. For this example, only
			// currencies that appear in transactions for the month will show up.
			monthlyBalances.add(new CurrencyBalance(UUID.randomUUID(), // Generate a new UUID for each balance record
					entry.getKey(), balanceDate, entry.getValue()));
		}

		return monthlyBalances;
	}

	/**
	 * Helper method to simulate loading transactions from a file. In a real
	 * application, this would read from a CSV, database, etc.
	 */
	public List<Transaction> loadTransactionsFromFile() {
		List<Transaction> transactions = new ArrayList<>();

		// Simulating some transactions for May 2025
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 5, 1), "USD", "EUR",
				new BigDecimal("100.00"), new BigDecimal("92.50"), new BigDecimal("0.925")));
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 5, 5), "EUR", "CAD",
				new BigDecimal("50.00"), new BigDecimal("73.20"), new BigDecimal("1.464")));
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 5, 10), "USD", "CAD",
				new BigDecimal("200.00"), new BigDecimal("275.00"), new BigDecimal("1.375")));
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 5, 15), "CAD", "USD",
				new BigDecimal("150.00"), new BigDecimal("109.09"), new BigDecimal("0.7272")));
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 5, 20), "EUR", "USD",
				new BigDecimal("75.00"), new BigDecimal("81.00"), new BigDecimal("1.08")));
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 5, 25), "CAD", "EUR",
				new BigDecimal("100.00"), new BigDecimal("68.50"), new BigDecimal("0.685")));

		// Simulating some transactions for June 2025
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 6, 1), "USD", "EUR",
				new BigDecimal("50.00"), new BigDecimal("46.00"), new BigDecimal("0.920")));
		transactions.add(new Transaction(UUID.randomUUID(), LocalDate.of(2025, 6, 5), "EUR", "CAD",
				new BigDecimal("25.00"), new BigDecimal("36.50"), new BigDecimal("1.460")));

		return transactions;
	}
}
