package com.springJdbcWithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class Insert {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        EmployeeDao empDao = (EmployeeDao) context.getBean("empDao");
        int insert = empDao.insert(new Employee("Springannota", 234));

        if (insert > 0) {
            System.out.println("Inserted");
        } else {
            System.out.println("Error in insetion");
        }
        context.close();
    }
}
