package com.myfirstspringbootproject.springbootproject.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component("emp")
public class Employee {
    private int empId;
    private String empName;
    private double empSalary;
}
