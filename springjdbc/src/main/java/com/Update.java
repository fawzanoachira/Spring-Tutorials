package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import entity.Employee;

public class Update {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao empDao = (EmployeeDao) c.getBean("empDao");
        int update = empDao.update(new Employee("Fawzan", 25000), 1);
        if (update > 0) {
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Error in updating");
        }

        c.close();
    }
}
