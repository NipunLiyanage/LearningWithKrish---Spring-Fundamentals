package com.example.springtraining.salesmanager.service;

import com.example.springtraining.salesmanager.model.Employee;
import com.example.springtraining.salesmanager.repository.EmployeeRepository;
import com.example.springtraining.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.management.MXBean;
import java.util.List;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("Setter fired");
        this.employeeRepository = employeeRepository;
    }

    public EmployeeServiceImpl(){
        System.out.println("Default Constructor excecuted");

    }

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        System.out.println("Overloaded Constructor excecuted");
        this.employeeRepository=employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }
}
