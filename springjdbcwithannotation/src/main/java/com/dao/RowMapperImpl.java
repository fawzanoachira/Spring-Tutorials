package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entity.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmpId(rs.getInt(1));
        employee.setEmpName(rs.getString(2));
        employee.setEmpSalary(rs.getInt(3));
        return employee;
    }

}
