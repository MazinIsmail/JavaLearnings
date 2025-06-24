package com.currencyBalance.design;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Transaction {

	private UUID transactionId;
	private LocalDate transactionDate;
	private String fromCurrency; // ISO 4217 code, e.g., "USD", "EUR"
	private String toCurrency; // ISO 4217 code, e.g., "USD", "EUR"
	private BigDecimal fromAmount;
	private BigDecimal toAmount;
	private BigDecimal exchangeRate;

	public Transaction(UUID transactionId, LocalDate transactionDate, String fromCurrency, String toCurrency,
			BigDecimal fromAmount, BigDecimal toAmount, BigDecimal exchangeRate) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.fromAmount = fromAmount;
		this.toAmount = toAmount;
		this.exchangeRate = exchangeRate;
	}

	public UUID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public BigDecimal getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(BigDecimal fromAmount) {
		this.fromAmount = fromAmount;
	}

	public BigDecimal getToAmount() {
		return toAmount;
	}

	public void setToAmount(BigDecimal toAmount) {
		this.toAmount = toAmount;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
