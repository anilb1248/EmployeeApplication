package com.app.emp.service;

import java.util.List;

import com.app.emp.model.Employee;
import com.app.emp.util.Response;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int id);

	public Response addEmployee(Employee employee);

	public Response updateEmployee(int id, Employee employee);

	public Response deleteEmployee(int id);

	public Employee findByName(String employeeName);

	public Response updateEmployeeNameById(int id, String employeeName);

}
