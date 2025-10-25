package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring-config.xml");
        Student bean1 = c.getBean(Student.class);
        // bean1.setStdId(1);
        // bean1.setStdName("Me in Code");
        // bean1.setStdAge(24);

        // Student bean2 = c.getBean(Student.class);
        System.out.println(bean1);
        c.close();
    }
}
