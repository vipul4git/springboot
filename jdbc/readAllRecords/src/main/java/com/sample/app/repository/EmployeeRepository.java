package com.sample.app.repository;

import java.util.List;

import com.sample.app.entity.Employee;

public interface EmployeeRepository {

	public Employee save(Employee emp);
	
	public List<Employee> all();
}
