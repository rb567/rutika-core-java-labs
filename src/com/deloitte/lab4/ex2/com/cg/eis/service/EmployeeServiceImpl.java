package com.deloitte.lab4.ex2.com.cg.eis.service;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
	Scanner scanner = new Scanner(System.in);

	// Method to get employee details from the user
	@Override
	public Employee getEmployeeDetails() {
		System.out.println("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume the newline

		System.out.println("Enter Employee Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter Employee Salary: ");
		double salary = scanner.nextDouble();

		scanner.nextLine(); // Consume the newline
		System.out.println("Enter Employee Designation: ");
		String designation = scanner.nextLine();

		// Creating an Employee object and returning it
		return new Employee(id, name, salary, designation);
	}

	// Method to find the insurance scheme based on salary and designation
	@Override
	public String findInsuranceScheme(double salary, String designation) {
		if (salary < 20000) {
			return "No Scheme";
		} else if (salary >= 20000 && salary < 40000) {
			return "Scheme C";
		} else if (salary >= 40000 && salary < 60000) {
			return "Scheme B";
		} else {
			return "Scheme A";
		}
	}

	// Method to display the employee details
	@Override
	public void displayEmployeeDetails(Employee employee) {
		System.out.println("\nEmployee Details:");
		System.out.println(employee); // This uses the overridden toString() method of Employee class
	}
}
