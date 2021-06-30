package com.nagarro.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.employee.model.Employee;
import com.nagarro.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping(value = "/add")
	public Employee addEmployee(@RequestBody Employee emp) {

		return empService.addEmployee(emp);

	}

	@GetMapping(value = "/getbyid/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {

		return empService.getEmployeeById(id);
	}

	@GetMapping(value = "/all")
	public Iterable<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		empService.deleteEmployeeById(id);
	}

	@PutMapping(value = "/update")
	public Employee updateEmployee(@RequestBody Employee emp) {

		return empService.updateEmployee(emp);
	}

}
