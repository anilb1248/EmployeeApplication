package com.app.emp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.app.emp.exceptions.EmployeeAlreadyExistedException;
import com.app.emp.exceptions.EmployeeNotFoundException;
import com.app.emp.model.Employee;
import com.app.emp.util.Response;

@Repository
public class EmployeeStaticDataRepository {
	private static int id = 0;
	private static Map<Integer, Employee> employeesData = new HashMap<>();

	static {
		employeesData.put(++id, new Employee(id, "Anil", 1000L, "SE"));
		employeesData.put(++id, new Employee(id, "Anu", 2000L, "SSE"));
		employeesData.put(++id, new Employee(id, "Bandari", 3000L, "TA"));
		employeesData.put(++id, new Employee(id, "Raju", 4000L, "TA"));
		employeesData.put(++id, new Employee(id, "Kumar", 5000L, "TA"));
		employeesData.put(++id, new Employee(id, "Jashwanth", 6000L, "Lead"));
		employeesData.put(++id, new Employee(id, "Jashmitha", 7000L, "Lead"));
		employeesData.put(++id, new Employee(id, "Sampath", 8000L, "Manager"));
		employeesData.put(++id, new Employee(id, "Vinay", 9000L, "Manager"));
		employeesData.put(++id, new Employee(id, "Kiran", 10000L, "CEO"));

		System.out.println("Employees static data initialized");
	}

	public List<Employee> getAllEmployees() {
		return new ArrayList<Employee>(employeesData.values());
	}

	public Employee getEmployee(int id) {
		Employee emp = employeesData.get(id);
		if (emp != null)
			return emp;
		else
			throw new EmployeeNotFoundException("Employee not found with id: " + id);
	}

	public Response addEmployee(Employee employee) throws EmployeeAlreadyExistedException {

		List<Employee> existedEmps = employeesData.values().stream().filter(emp -> {
			return employee.getName().trim().toLowerCase().equals(emp.getName().trim().toLowerCase());
		}).collect(Collectors.toList());

		if (existedEmps.isEmpty()) {
			employee.setId(++id);
			employeesData.put(id, employee);
			return new Response(true, "Successfully added the employee", "");

		} else {
			throw new EmployeeAlreadyExistedException("Employee already existed with name: "+ employee.getName());
		}
	}

	public Response updateEmployee(int id, Employee employee) {

		Employee emp = employeesData.get(id);
		if (emp != null) {
			employee.setId(id);
			employeesData.put(employee.getId(), employee);
			return new Response(true, "Successfully updated the employee", "");
		} else {
			throw new EmployeeNotFoundException("Employee not found with id: " + id);
		}
	}

	public Response deleteEmployee(int id) {
		Employee emp = employeesData.get(id);
		if (emp != null) {
			employeesData.remove(id);
			return new Response(true, "Successfully deleted the employee, id:" + id, "");
		} else {
			throw new EmployeeNotFoundException("Employee not found with id: " + id);
		}
	}

	public Employee findByName(String employeeName) {
		List<Employee> list = employeesData.values().stream().filter(emp -> {
			return emp.getName().trim().toLowerCase().equals(employeeName.trim().toLowerCase());
		}).collect(Collectors.toList());

		if (list.size() > 0)
			return list.get(0);
		else
			throw new EmployeeNotFoundException("Employee not found with id: " + id);

	}

	public Response updateEmployeeNameById(int id, String employeeName) {

		Employee emp = employeesData.get(id);
		if (emp != null) {
			emp.setName(employeeName);
			return new Response(true, "Successfully updated the employee name whose id:" + id, "");
		} else {
			throw new EmployeeNotFoundException("Employee not found with id: " + id);
		}

	}

}
