package com.myfirstspringbootproject.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.myfirstspringbootproject.springbootproject.entity.Employee;

@SpringBootApplication
// @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringbootprojectApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringbootprojectApplication.class, args);
		Employee empObject = (Employee) run.getBean("emp");
		empObject.setEmpId(1);
		empObject.setEmpName("John Doe");
		empObject.setEmpSalary(20000.00);
		System.out.println(empObject);
	}

}
