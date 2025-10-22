package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.models.Employee;
import com.services.EmployeeServiceImpl;

public class WithXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/Spring.xml");
        EmployeeServiceImpl bean = ctx.getBean(EmployeeServiceImpl.class);
        int saveEmployee = bean.saveEmployee(new Employee("SpringHibernate", 25000));
        if (saveEmployee > 0) {
            System.out.println("Inserted");
        } else {
            System.out.println("Error");
        }
        ctx.close();
    }
}
