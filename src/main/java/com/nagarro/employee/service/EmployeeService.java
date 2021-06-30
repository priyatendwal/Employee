package com.nagarro.employee.service;

import com.nagarro.employee.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);

	public Employee getEmployeeById(int id);

	public Iterable<Employee> getAllEmployee();

	public void deleteEmployeeById(int id);

	public Employee updateEmployee(Employee employee);

}
