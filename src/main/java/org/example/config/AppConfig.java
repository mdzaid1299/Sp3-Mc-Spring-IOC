package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("emp")
    public Employee getEmployee(){
        Employee emp = new Employee(getDepartment1());
        emp.setEmpId(100);
        emp.setEmployeeName("Arijit");
        return  emp;
    }
    @Bean("emp2")
    public Employee getEmployee2(){
        Employee emp = new Employee(getDepartment());
        emp.setEmpId(200);
        emp.setEmployeeName("Bhavna");
        return  emp;
    }

    @Bean
    public Department getDepartment(){
        return new Department(12,"Teaching");
    }
    @Bean("dept")
    public Department getDepartment1(){
        return new Department(15,"HR");
    }
}