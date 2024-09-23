package com.deloitte.lab9.ex6;

import java.util.List;

public class Lab9Ex6 {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeRepository.getEmployees();

		// Requirement 1: Sum of salary of all employees
		double totalSalary = EmployeeService.getTotalSalary(employees);
		System.out.println("Total Salary of all employees: " + totalSalary);

		// Requirement 2: Department names and count of employees in each department
		System.out.println("Department names and employee count:");
		EmployeeService.getDepartmentEmployeeCount(employees)
				.forEach((department, count) -> System.out.println(department + ": " + count));

		// Requirement 3: Senior-most employee
		Employee seniorMostEmployee = EmployeeService.getSeniorMostEmployee(employees);
		System.out.println("Senior-most employee: " + seniorMostEmployee);

		// Requirement 4: Employee name and duration of service
		System.out.println("Employee service duration:");
		EmployeeService.getEmployeeServiceDuration(employees)
				.forEach((name, duration) -> System.out.println(name + ": " + duration));

		// Requirement 5: Employees without department
		List<Employee> employeesWithoutDepartment = EmployeeService.getEmployeesWithoutDepartment(employees);
		System.out.println("Employees without department:");
		employeesWithoutDepartment.forEach(System.out::println);

		// Additional Method: Employees with increased salary
		System.out.println("Employees with increased salary (15%):");
		EmployeeService.getEmployeesWithIncreasedSalary(employees)
				.forEach((name, increasedSalary) -> System.out.println(name + ": " + increasedSalary));

		// Additional Method: Sort employees by First Name
		System.out.println("Employees sorted by first name:");
		List<Employee> sortedEmployees = EmployeeService.sortByFirstName(employees);
		sortedEmployees.forEach(System.out::println);
	}
}
