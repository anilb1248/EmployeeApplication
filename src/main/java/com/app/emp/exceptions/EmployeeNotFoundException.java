package com.app.emp.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String exceptionMsg) {
		super(exceptionMsg);
	}

}
