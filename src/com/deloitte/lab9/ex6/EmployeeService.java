package com.deloitte.lab9.ex6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeService {

	// Requirement 1: Find out the sum of salary of all employees
	public static double getTotalSalary(List<Employee> employees) {
		return employees.stream().mapToDouble(Employee::getSalary).sum();
	}

	// Requirement 2: List out department names and count of employees in each
	// department
	public static Map<String, Long> getDepartmentEmployeeCount(List<Employee> employees) {
		return employees.stream().filter(e -> e.getDepartment() != null)
				.collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(), Collectors.counting()));
	}

	// Requirement 3: Find out the senior-most employee in the organization
	public static Employee getSeniorMostEmployee(List<Employee> employees) {
		return employees.stream().min(Comparator.comparing(Employee::getHireDate)).orElse(null);
	}

	// Requirement 4: List employee name and duration of their service in months and
	// days
	public static Map<String, String> getEmployeeServiceDuration(List<Employee> employees) {
		LocalDate currentDate = LocalDate.now();
		return employees.stream().collect(Collectors.toMap(e -> e.getFirstName() + " " + e.getLastName(), e -> {
			long months = ChronoUnit.MONTHS.between(e.getHireDate(), currentDate);
			long days = ChronoUnit.DAYS.between(e.getHireDate().plusMonths(months), currentDate);
			return months + " months and " + days + " days";
		}));
	}

	// Requirement 5: Find employees without department
	public static List<Employee> getEmployeesWithoutDepartment(List<Employee> employees) {
		return employees.stream().filter(e -> e.getDepartment() == null).collect(Collectors.toList());
	}

	// Additional Method: List employees and salary increased by 15%
	public static Map<String, Double> getEmployeesWithIncreasedSalary(List<Employee> employees) {
		return employees.stream()
				.collect(Collectors.toMap(e -> e.getFirstName() + " " + e.getLastName(), e -> e.getSalary() * 1.15));
	}

	// Additional Method: Sort employees by First Name
	public static List<Employee> sortByFirstName(List<Employee> employees) {
		return employees.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList());
	}

}
