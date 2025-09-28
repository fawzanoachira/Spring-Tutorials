package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import entity.Employee;

public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Employee employee) {
        String insertQuery = "INSERT into employee (employeeName, empSalary) VALUES (?,?)";
        int update = jdbcTemplate.update(insertQuery, employee.getEmpName(), employee.getEmpSalary());
        return update;
    }
}
