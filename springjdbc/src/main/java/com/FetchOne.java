package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import entity.Employee;

public class FetchOne {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao empDao = (EmployeeDao) c.getBean("empDao");
        Employee fetchEmployee = empDao.fetchEmployee(2);

        System.out.println(fetchEmployee.getEmpId());
        System.out.println(fetchEmployee.getEmpName());
        System.out.println(fetchEmployee.getEmpSalary());
        System.out.println(fetchEmployee);

        c.close();
    }
}
