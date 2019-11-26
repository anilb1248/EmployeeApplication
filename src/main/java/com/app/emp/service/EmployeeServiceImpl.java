package com.app.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.emp.model.Employee;
import com.app.emp.repository.EmployeeRepository;
import com.app.emp.util.Response;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByName(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateEmployeeNameById(int id, String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
