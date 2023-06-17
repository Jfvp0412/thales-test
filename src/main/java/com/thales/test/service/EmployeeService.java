package com.thales.test.service;

import com.thales.test.model.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.json.*;

public class EmployeeService {
    private String stringApi = "https://dummy.restapiexample.com/api/v1/employees"; // Class variable to store the URL of the API

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        EmployeeBusiness employeeBusiness;
        try {
            // Create a URL from the API string
            URL url = new URL(stringApi);

            // Open HTTP connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read the API response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse response data to Employee objects using Json
            JsonReader jsonReader = Json.createReader(new StringReader(response.toString()));
            JsonObject jsonObject = jsonReader.readObject();
            JsonArray jsonArray = jsonObject.getJsonArray("data");

            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject employeeJson = jsonArray.getJsonObject(i);
                Employee employee = new Employee();
                employee.setId(employeeJson.getInt("id"));
                employee.setEmployeeName(employeeJson.getString("employee_name"));
                employee.setEmployeeSalary(employeeJson.getInt("employee_salary"));
                employeeBusiness = new EmployeeBusiness(employee.getEmployeeSalary());
                employee.setEmployeeAnualSalarySalary(employeeBusiness.getEmployeeAnualSalary());
                employee.setEmployeeAge(employeeJson.getInt("employee_age"));
                employee.setProfileImage(employeeJson.getString("profile_image"));
                employees.add(employee);
            }
            jsonReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }
}
