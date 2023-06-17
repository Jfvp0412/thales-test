package com.thales.test.service;

public class EmployeeBusiness {
    private double employeeAnualSalary;
    public EmployeeBusiness(double employeeSalary) {
        this.employeeAnualSalary = employeeSalary * 12;
    }
    public double getEmployeeAnualSalary() {
        return this.employeeAnualSalary;
    }
}
