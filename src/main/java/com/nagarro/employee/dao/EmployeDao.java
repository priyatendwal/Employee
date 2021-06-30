package com.nagarro.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.employee.model.Employee;

public interface EmployeDao extends CrudRepository<Employee, Integer> {

	
}
