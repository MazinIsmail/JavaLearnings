package com.assginments.two;

import java.text.DecimalFormat;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	// Default constructor
	public BasePlusCommissionEmployee() {
		super();
	}

	// Constructor with arguments
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		this.baseSalary = baseSalary;
	}

	// Accessor methods and Mutator methods
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// returns in the below format
	/*
	 * Base plus Commission based employee:
	 * 
	 * First name: Karan, Last Name: Sharma, Gross sales: $5000, Commission rate:
	 * 0.4, Base Salary: $2000.
	 */
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("0.#");
		String formatBaseSalary = format.format(getBaseSalary());
		// StringBuilder sb = new StringBuilder("Base plus Commission based employee:
		// \n\n");
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(", Base Salary: $" + formatBaseSalary + ".");
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
		BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
		return Double.doubleToLongBits(baseSalary) == Double.doubleToLongBits(other.baseSalary);
	}

	// Display Base plus Commission based employee
	@Override
	public void earnings() {
		double temp = ((double) getCommisionRate() * (double) getGrossSales() / 100d) + baseSalary;
		DecimalFormat format = new DecimalFormat("0.#");
		String formatTemp = format.format(temp);
		System.out.println("Base plus Commission based employee: $" + formatTemp);
	}

}
