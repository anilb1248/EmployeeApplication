package com.app.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.app.emp.model.Employee;
import com.app.emp.repository.EmployeeRepository;
import com.app.emp.repository.EmployeeStaticDataRepository;
import com.app.emp.util.Response;

@Primary
@Service
public class EmployeeServiceImpl_StaticDataService implements EmployeeService {

	@Autowired
	EmployeeStaticDataRepository employeeStaticData;

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeStaticData.getAllEmployees();
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeStaticData.getEmployee(id);
	}

	@Override
	public Response addEmployee(Employee employee) {
		return employeeStaticData.addEmployee(employee);
//		employeeRepository.save(employee);
//		return new Response(true, "Successfully added the employee", "");

	}

	@Override
	public Response updateEmployee(int id, Employee employee) {
		return employeeStaticData.updateEmployee(id, employee);
	}

	@Override
	public Response deleteEmployee(int id) {
		return employeeStaticData.deleteEmployee(id);
	}

	@Override
	public Employee findByName(String employeeName) {
		return employeeStaticData.findByName(employeeName);
	}

	@Override
	public Response updateEmployeeNameById(int id, String employeeName) {
		return employeeStaticData.updateEmployeeNameById(id, employeeName);
	}

}
