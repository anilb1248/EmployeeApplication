package com.app.emp.model;

/**
 * 
 * @author BAK
 *
 *This is user defined response class. but it is not correct to use this class.
 *Make sure to use the ResponseEntity class as return type which is provided by spring.
 */
public class Employee {

	private Integer id;
	private String name;
	private Long salary;
	private String role;

	public Employee() {

	}

	public Employee(Integer id, String name, Long salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
