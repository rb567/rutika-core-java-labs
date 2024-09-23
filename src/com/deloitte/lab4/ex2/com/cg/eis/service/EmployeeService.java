package com.deloitte.lab4.ex2.com.cg.eis.service;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    String findInsuranceScheme(double salary, String designation);
    void displayEmployeeDetails(Employee employee);
}
