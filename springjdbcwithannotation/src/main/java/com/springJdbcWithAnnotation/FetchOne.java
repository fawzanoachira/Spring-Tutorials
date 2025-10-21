package com.springJdbcWithAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class FetchOne {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(JdbcConfig.class);
        EmployeeDao empDao = (EmployeeDao) c.getBean("empDao");
        Employee fetchEmployee = empDao.fetchEmployee(3);

        System.out.println(fetchEmployee.getEmpId());
        System.out.println(fetchEmployee.getEmpName());
        System.out.println(fetchEmployee.getEmpSalary());
        System.out.println(fetchEmployee);

        c.close();
    }
}
