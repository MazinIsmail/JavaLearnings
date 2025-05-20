package com.assginments.two;

import java.text.DecimalFormat;

public class CommissionEmployee extends Employee {

	// gross weekly sales
	private double grossSales;
	// commission percentage
	private double commisionRate;

	// Default constructor
	public CommissionEmployee() {
		super();
	}

	// Constructor with arguments
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
	}

	// Copy constructor
	public CommissionEmployee(CommissionEmployee commisionEmployee) {
		super(commisionEmployee.firstName, commisionEmployee.lastName, commisionEmployee.socialSecurityNumber);
		this.grossSales = commisionEmployee.grossSales;
		this.commisionRate = commisionEmployee.commisionRate;
	}

	// Accessor methods and Mutator methods
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	// returns in the below format
	/*
	 * Commision based employee:
	 * 
	 * First name: Karan, Last Name: Sharma, Gross sales: $5000, Commission rate:
	 * 0.4.
	 */
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("0.#");
		String formatGrossSales = format.format(grossSales);
		// StringBuilder sb = new StringBuilder("Commision based employee: \n\n");
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(", Gross sales: $" + formatGrossSales + ", Commission rate: " + commisionRate);
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommissionEmployee other = (CommissionEmployee) obj;
		return Double.doubleToLongBits(commisionRate) == Double.doubleToLongBits(other.commisionRate)
				&& Double.doubleToLongBits(grossSales) == Double.doubleToLongBits(other.grossSales);
	}

	// Display Earnings of Commission employee
	@Override
	public void earnings() {
		double temp = (double) getCommisionRate() * (double) getGrossSales() / 100d;
		DecimalFormat format = new DecimalFormat("0.#");
		String formatTemp = format.format(temp);
		System.out.println("Earnings of Commission employee: $" + formatTemp);
	}

}
