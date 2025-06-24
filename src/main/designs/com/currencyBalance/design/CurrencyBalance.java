package com.currencyBalance.design;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class CurrencyBalance {
	private UUID balanceId;
	private String currencyCode;
	private LocalDate balanceDate;
	private BigDecimal endingBalance;

	public CurrencyBalance(UUID balanceId, String currencyCode, LocalDate balanceDate, BigDecimal endingBalance) {
		super();
		this.balanceId = balanceId;
		this.currencyCode = currencyCode;
		this.balanceDate = balanceDate;
		this.endingBalance = endingBalance;
	}

	public UUID getBalanceId() {
		return balanceId;
	}

	public void setBalanceId(UUID balanceId) {
		this.balanceId = balanceId;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public LocalDate getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(LocalDate balanceDate) {
		this.balanceDate = balanceDate;
	}

	public BigDecimal getEndingBalance() {
		return endingBalance;
	}

	public void setEndingBalance(BigDecimal endingBalance) {
		this.endingBalance = endingBalance;
	}

}
