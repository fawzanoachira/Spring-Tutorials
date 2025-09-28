package com;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import entity.Employee;

public class FetchAll {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao bean = (EmployeeDao) c.getBean("empDao");

        List<Employee> allEmployees = bean.getAllEmployees();

        for (Employee employee : allEmployees) {
            System.out.println(employee);
        }

        c.close();
    }
}
