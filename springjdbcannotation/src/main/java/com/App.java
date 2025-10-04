package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import entity.Employee;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao bean = (EmployeeDao) c.getBean("empDao");
        int insert = bean.insert(new Employee("Fawzannn", 23456));
        if (insert > 0) {
            System.out.println("Inserted Succesfully");
        } else {
            System.out.println("Insertion Failed");
        }
        c.close();
    }
}
