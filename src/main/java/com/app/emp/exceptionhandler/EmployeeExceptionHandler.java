package com.app.emp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.emp.exceptions.EmployeeAlreadyExistedException;
import com.app.emp.exceptions.EmployeeNotFoundException;
import com.app.emp.util.ErrorResponse;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(value = { EmployeeAlreadyExistedException.class })
	@ResponseStatus(HttpStatus.FORBIDDEN)
	public ErrorResponse handleEmployeeAlreadyExistedException(EmployeeAlreadyExistedException ex) {
		return new ErrorResponse(403, ex.getMessage());
	}

	@ExceptionHandler(value = { EmployeeNotFoundException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
		return new ErrorResponse(404, ex.getMessage());
	}

	@ExceptionHandler(value = { Exception.class })
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorResponse handleUnknownException(Exception ex) {
		return new ErrorResponse(404, ex.getMessage());
	}

}
