package com.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.models.Employee;

@Repository
public class EmployeeRepository {
    public void saveEmployee(Employee employee) {
        SessionFactory sessionFactory = new Configuration().configure("resources/hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        Session openSession = sessionFactory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();

        openSession.persist(employee);
        beginTransaction.commit();

        // openSession.close();
        sessionFactory.close();
    }
}
