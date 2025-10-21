package com.springJdbcWithAnnotation;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class FetchAll {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(JdbcConfig.class);
        EmployeeDao bean = (EmployeeDao) c.getBean("empDao");

        List<Employee> allEmployees = bean.getAllEmployees();

        for (Employee employee : allEmployees) {
            System.out.println(employee);
        }

        c.close();
    }
}
