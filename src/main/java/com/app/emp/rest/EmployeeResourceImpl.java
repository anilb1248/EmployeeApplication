package com.app.emp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.emp.model.Employee;
import com.app.emp.service.EmployeeService;
import com.app.emp.util.Response;

@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	EmployeeService employeeService;

//	@Override
//	public Response handleUnknownRequest() {
//		return new Response(false, "No method found", "Method not found");
//	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeService.getEmployee(id);
	}

	@Override
	public Response addEmployee(Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@Override
	public Response updateEmployee(int id, Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}

	@Override
	public Response deleteEmployee(int id) {
		return employeeService.deleteEmployee(id);
	}

	@Override
	public Employee findByName(String employeeName) {
		return employeeService.findByName(employeeName);
	}

	@Override
	public boolean validateEmployee(String employeeName, String password) {

		if (employeeName.equals("Anil") && password.equals("1248"))
			return true;
		else
			return false;
	}

	@Override
	public Response updateEmployeeNameById(int id, String employeeName) {
		return employeeService.updateEmployeeNameById(id, employeeName);
	}

}
