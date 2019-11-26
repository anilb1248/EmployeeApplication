package com.app.emp.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.app.emp.model.Employee;
import com.app.emp.service.EmployeeService;
import com.app.emp.util.Response;

@RestController
public class EmployeeResourceImpl implements EmployeeResource {

	/**
	 * Here we have 2 implemented classes for EmployeeServices
	 * 1.static data employee service
	 * 2.class which deals with database.
	 * Whatever you need, mark as primary
	 */
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
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok("Hi welcome to employee application which was built on spring boot rest....");
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

	@Override
	public ResponseEntity<String> getSingleMatrixVariable(String id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok("id: " + id);
	}

	@Override
	public ResponseEntity<Map<String, String>> getAllMatrixVariables(Map<String, String> data) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

}
