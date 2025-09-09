package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext c = new ClassPathXmlApplicationContext("spring-config.xml");
        Student bean = c.getBean(Student.class);
    }
}
