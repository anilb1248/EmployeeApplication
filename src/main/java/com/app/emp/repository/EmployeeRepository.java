package com.app.emp.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.emp.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
