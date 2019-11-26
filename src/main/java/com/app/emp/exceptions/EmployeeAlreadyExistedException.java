package com.app.emp.exceptions;

public class EmployeeAlreadyExistedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeAlreadyExistedException(String exceptionMsg) {
		super(exceptionMsg);
	}

}
