package com.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.entity.Employee;

@Component("empDao")
public class EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Employee employee) {
        String insertQuery = "INSERT into Employee (empName, empSalary) VALUES (?,?)";
        int update = jdbcTemplate.update(insertQuery, employee.getEmpName(), employee.getEmpSalary());
        return update;
    }

    public int update(Employee employee, int empId) {
        String updateQuery = "UPDATE Employee set empName = ?, empSalary = ? where empId = ?;";
        int update = jdbcTemplate.update(updateQuery, employee.getEmpName(), employee.getEmpSalary(),
                empId);
        return update;
    }

    public int delete(int empId) {
        String deleteQuery = "DELETE FROM Employee where empId = ?;";
        int delete = jdbcTemplate.update(deleteQuery, empId);
        return delete;
    }

    public List<Employee> getAllEmployees() {
        String query = "SELECT * FROM Employee";
        try {
            List<Employee> employees = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Employee.class));
            return employees;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Employee fetchEmployee(int empId) {
        String query = "SELECT * FROM Employee WHERE empId = ?";
        RowMapperImpl rowMapperImpl = new RowMapperImpl();
        Employee queryForObject = jdbcTemplate.queryForObject(query, rowMapperImpl, empId);
        return queryForObject;
    }
}
