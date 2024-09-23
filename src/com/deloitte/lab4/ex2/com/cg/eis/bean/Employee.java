package com.deloitte.lab4.ex2.com.cg.eis.bean;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    // Constructors
    public Employee() {}

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme();
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        this.insuranceScheme = determineInsuranceScheme(); // Recalculate scheme on salary change
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme(); // Recalculate scheme on designation change
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    // Method to determine insurance scheme based on salary and designation
    private String determineInsuranceScheme() {
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

    // Overriding toString() method to display employee details
    @Override
    public String toString() {
        return "Employee ID: " + id + "\nName: " + name + "\nSalary: " + salary + 
               "\nDesignation: " + designation + "\nInsurance Scheme: " + insuranceScheme;
    }
}
