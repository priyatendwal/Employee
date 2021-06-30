package com.nagarro.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employee.dao.EmployeDao;
import com.nagarro.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeDao empDao;

	public Employee addEmployee(Employee emp) {

		return empDao.save(emp);
	}

	public Employee getEmployeeById(int id) {
		return empDao.findById(id).orElse(null);
	}

	public Iterable<Employee> getAllEmployee() {
		return empDao.findAll();
	}

	public void deleteEmployeeById(int id) {

		empDao.deleteById(id);
	}

	public Employee updateEmployee(Employee employee) {
		return empDao.save(employee);
	}

}
