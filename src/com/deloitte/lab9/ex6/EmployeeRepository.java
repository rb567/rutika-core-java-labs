package com.deloitte.lab9.ex6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();

		Department hr = new Department(1, "HR", 101);
		Department it = new Department(2, "IT", 102);
		Department finance = new Department(3, "Finance", 103);

		employees.add(new Employee(1, "John", "Smith", "john.smith@mail.com", "1234567890", LocalDate.of(2010, 1, 10),
				"Manager", 5000.0, null, hr));
		employees.add(new Employee(2, "Emily", "Brown", "emily.brown@mail.com", "9876543210", LocalDate.of(2012, 3, 5),
				"Developer", 4000.0, 1, it));
		employees.add(new Employee(3, "Sophia", "White", "sophia.white@mail.com", "7896541230",
				LocalDate.of(2015, 6, 25), "Tester", 3000.0, 1, it));
		employees.add(new Employee(4, "James", "Williams", "james.williams@mail.com", "4567893210",
				LocalDate.of(2018, 11, 11), "Accountant", 3500.0, 1, finance));
		employees.add(new Employee(5, "Anna", "Scott", "anna.scott@mail.com", "6547893210", LocalDate.of(2019, 12, 15),
				"Clerk", 2500.0, 4, hr));
		employees.add(new Employee(6, "Peter", "Johnson", "peter.johnson@mail.com", "9638527410",
				LocalDate.of(2020, 2, 2), "Developer", 3000.0, 2, null)); // No department
		employees.add(new Employee(7, "Paul", "Adams", "paul.adams@mail.com", "1478523690", LocalDate.of(2020, 7, 20),
				"Intern", 2000.0, 2, it)); // Employee with low salary

		return employees;
	}
}
