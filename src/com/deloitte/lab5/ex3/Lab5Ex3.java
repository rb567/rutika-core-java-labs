package com.deloitte.lab5.ex3;
import com.deloitte.lab4.ex2.com.cg.eis.exception.EmployeeException;

// Main class to validate salary
public class Lab5Ex3 {
    // Method to validate salary
    public static void validateSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least 3000.");
        } else {
            System.out.println("Salary is valid.");
        }
    }

    public static void main(String[] args) {
        double salary = 25000; // Replace with user input if needed

        try {
            validateSalary(salary);
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
