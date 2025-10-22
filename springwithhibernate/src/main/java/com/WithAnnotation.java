package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.models.Employee;
import com.services.EmployeeServiceImpl;

import resources.SpringConfig;

public class WithAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeServiceImpl bean = config.getBean(EmployeeServiceImpl.class);
        int saveEmployee = bean.saveEmployee(new Employee("SpringHibernatewithoutxml", 25000));
        if (saveEmployee > 0) {
            System.out.println("Inserted");
        } else {
            System.out.println("Error");
        }
        config.close();
    }
}
