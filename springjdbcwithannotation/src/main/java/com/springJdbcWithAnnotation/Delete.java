package com.springJdbcWithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.EmployeeDao;

public class Delete {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(JdbcConfig.class);
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
