package com.example.springtraining;

import com.example.springtraining.salesmanager.model.Employee;
import com.example.springtraining.salesmanager.service.EmployeeService;
import com.example.springtraining.salesmanager.service.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringTrainingApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext((ApplicationConfiguration.class));

        EmployeeService employeeService= applicationContext.getBean("employeeService", EmployeeService.class);
        List<Employee> emps = employeeService.getAllEmployees();

        for (Employee employee : emps){
            System.out.println(employee.getEmployeeName() + " lives in "+ employee.getEmployeeLocation());

        }



    }





}
