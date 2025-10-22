package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public int saveEmployee(Employee employee) {
        // try {
            employeeRepository.saveEmployee(employee);
            return 1;
        // } catch (Exception e) {
        //     return 0;
        // }
    }

}
