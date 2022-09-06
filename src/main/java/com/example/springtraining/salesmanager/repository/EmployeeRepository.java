package com.example.springtraining.salesmanager.repository;

import com.example.springtraining.salesmanager.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
