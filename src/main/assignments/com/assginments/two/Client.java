package com.assginments.two;

public class Client {

	public static void main(String[] args) {
		// Employee object
		Employee employee1 = new Employee();
		employee1.setFirstName("Karan");
		employee1.setLastName("Sharma");
		employee1.setSocialSecurityNumber("123456789");

		// CommissionEmployee object
		CommissionEmployee employee2 = new CommissionEmployee("John", "Smith", "123456790", 1000d, 1.0d);

		// Print the employee1 object
		System.out.println(employee1.toString());

		// Print the employee2 object
		System.out.println(employee2.toString());

		// Alter employee2's gross sale
		employee2.setGrossSales(2000);

		// Print the employee2 object
		System.out.println(employee2.toString());

		// Employee object using the copy constructor
		Employee employee3 = new Employee(employee1);

		// check if employee1 is same employee3
		if (employee1.equals(employee3)) {
			System.out.println("employee1 is same as employee3");
		} else {
			System.out.println("employee1 is not same as employee3");
		}

		// check if employee1 is same employee2
		if (employee1.equals(employee3)) {
			System.out.println("employee1 is same as employee2");
		} else {
			System.out.println("employee1 is not same as employee2");
		}

		// Set employee3's SSN
		employee3.setSocialSecurityNumber("123456788");

		// BasePlusCommissionEmployee object
		BasePlusCommissionEmployee basePlusCommisionEmployee1 = new BasePlusCommissionEmployee("Harry", "Potter",
				"123456737", 1800d, 0.5d, 2050);

		// BasePlusCommissionEmployee object
		BasePlusCommissionEmployee basePlusCommisionEmployee2 = new BasePlusCommissionEmployee();
		basePlusCommisionEmployee2.setFirstName("Sherlock");
		basePlusCommisionEmployee2.setLastName("Holmes");
		basePlusCommisionEmployee2.setSocialSecurityNumber("123456721");
		basePlusCommisionEmployee2.setCommisionRate(0.3d);
		basePlusCommisionEmployee2.setBaseSalary(1800d);
		basePlusCommisionEmployee2.setGrossSales(1800d);
		basePlusCommisionEmployee2.setBaseSalary(1200d);

		// Print the basePlusCommisionEmployee1
		System.out.println(basePlusCommisionEmployee1.toString());

		// Print the basePlusCommisionEmployee2
		System.out.println(basePlusCommisionEmployee2.toString());

		Employee[] employee = new Employee[5];

		employee[0] = employee1;
		employee[1] = employee3;
		employee[2] = employee2;
		employee[3] = basePlusCommisionEmployee1;
		employee[4] = basePlusCommisionEmployee2;

		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].toString());
		}

		float sum = 0;
		for (int i = 1; i <= 2; i++) {
			for (int j = 5; j > 2; j--) {
				sum += i * j;
			}
		}

		System.out.println(sum);

		int r = 6 % 5 * 2 - 1;
		System.out.println(r);
		
		int n = 9 - 5 + 1;
		System.out.println( (int)(((double) n/2) * (9+5) ));

	}
}
