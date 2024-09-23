package com.deloitte.lab4.ex2.com.cg.eis.pl;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeService;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeServiceImpl;

public class Lab4Ex2 {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();

        // Get employee details from the user
        Employee employee = employeeService.getEmployeeDetails();

        // Display employee details
        employeeService.displayEmployeeDetails(employee);

        // Find and display the insurance scheme
        String scheme = employeeService.findInsuranceScheme(employee.getSalary(), employee.getDesignation());
        System.out.println("Insurance Scheme: " + scheme);
    }
}
