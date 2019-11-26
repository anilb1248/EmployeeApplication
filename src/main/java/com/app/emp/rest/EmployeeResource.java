package com.app.emp.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.emp.model.Employee;
import com.app.emp.util.Response;

@RequestMapping("/employee")
@ResponseBody
public interface EmployeeResource {

//	@RequestMapping("*")
//	public Response handleUnknownRequest();

//	@RequestMapping("/getAll") // If we use this, getting multiple endpoints in swagger api as it allows get,post,put...etc
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees();

	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable int id);

	@PostMapping("/add")
	public Response addEmployee(@RequestBody Employee employee);

	@PutMapping("/update/{id}")
	public Response updateEmployee(@PathVariable int id, @RequestBody Employee employee);

	@DeleteMapping("/delete/{id}")
	public Response deleteEmployee(@PathVariable int id);

	@GetMapping("/findByName")
	public Employee findByName(@RequestParam(name = "EMPLOYEE_NAME", required = true) String employeeName);

	@GetMapping("/validateEmployee")
	public boolean validateEmployee(@RequestHeader("USER_NAME") String employeeName,
			@RequestHeader("PASSWORD") String password);

	@PatchMapping("/updateEmpName")
	public Response updateEmployeeNameById(@RequestParam(name = "ID", required = true) int id,
			@RequestParam("EMP_NAME") String employeeName);
}
