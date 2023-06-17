package com.thales.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeBusinessTest {
    @Autowired
    EmployeeBusiness employeeBusinessTest;
    @Test
    void getEmployeeAnualSalary() {
        //Should get 12 if salary is 1
        employeeBusinessTest =  new EmployeeBusiness(1);
        Assertions.assertEquals(12, employeeBusinessTest.getEmployeeAnualSalary() );
        //Should get 0 if salary is 0
        employeeBusinessTest =  new EmployeeBusiness(0);
        Assertions.assertEquals(0, employeeBusinessTest.getEmployeeAnualSalary() );
        //Should get 3600 if salary is 300
        employeeBusinessTest =  new EmployeeBusiness(300);
        Assertions.assertEquals(3600, employeeBusinessTest.getEmployeeAnualSalary() );

    }
}