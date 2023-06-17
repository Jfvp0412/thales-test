package com.thales.test.controller;

import com.thales.test.model.Employee;
import com.thales.test.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") //Allows localhost:3000 to get all data
public class EmployeeController {
    private EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeService.getEmployees();
        return employees;
    }
}
