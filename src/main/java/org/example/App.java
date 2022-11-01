package org.example;

import org.example.config.AppConfig;
import org.example.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean("emp", Employee.class);
        System.out.println(employee);

        System.out.println("---------------------------");

        Employee employee2 = context.getBean("emp2", Employee.class);
        System.out.println(employee2);
    }
}