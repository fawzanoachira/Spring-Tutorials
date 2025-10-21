package com.springJdbcWithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class Update {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(JdbcConfig.class);
        EmployeeDao empDao = (EmployeeDao) c.getBean("empDao");

        int update = empDao.update(new Employee("Update works", 25000), 3);
        if (update > 0) {
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Error in updating");
        }

        c.close();
    }
}
