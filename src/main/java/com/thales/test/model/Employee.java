package com.thales.test.model;

public class Employee {
    private int id;
    private String employeeName;
    private double employeeSalary;
    private double employeeAnualSalary;
    private int employeeAge;
    private String profileImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeAnualSalarySalary(double employeeAnualSalarySalary) {
        this.employeeAnualSalary = employeeAnualSalarySalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

}
