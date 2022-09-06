package com.example.springtraining.salesmanager.repository;

import com.example.springtraining.salesmanager.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {


    public List<Employee> getAllEmployees(){
        List<Employee>employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmployeeName("Nipun");
        employee.setEmployeeLocation("Kaluthara");
        employees.add(employee);
        return employees;
    }
}
