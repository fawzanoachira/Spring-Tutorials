package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;

public class Delete {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao empDao = (EmployeeDao) c.getBean("empDao");
        int delete = empDao.delete(2);
        if (delete > 0) {
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Error in Deletion");
        }

        c.close();
    }
}
