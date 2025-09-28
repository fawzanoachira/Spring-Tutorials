package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import entity.Employee;

public class Insert {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao bean = (EmployeeDao) c.getBean("empDao");
        int insert = bean.insert(new Employee("Fawz", 20000));
        if (insert > 0) {
            System.out.println("Inserted");
        } else {
            System.out.println("Failed to insert");
        }
        c.close();
    }
}