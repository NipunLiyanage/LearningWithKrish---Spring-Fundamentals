package com.example.springtraining;

import com.example.springtraining.salesmanager.repository.EmployeeRepository;
import com.example.springtraining.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.example.springtraining.salesmanager.service.EmployeeService;
import com.example.springtraining.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class ApplicationConfiguration {

    @Bean(name = "employeeService")
    public EmployeeService getemployeeService(){

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        return employeeService;
    }
    /*@Bean(name= "employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }

     */
}
