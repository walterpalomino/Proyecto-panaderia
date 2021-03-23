package com.microservicio.app.panaderia.exception;


import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javassist.NotFoundException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<?>notFoundException(NoSuchElementException e){
		
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;		
		return buildResponseEntity(httpStatus, e);
	}
	
	private ResponseEntity<ErrorResponse> buildResponseEntity(HttpStatus httpStatus,  Exception exc){
		
		return buildResponseEntity(httpStatus, exc, null);
	}
	
	private ResponseEntity<ErrorResponse> buildResponseEntity(HttpStatus httpStatus, Exception exc, List<String> errors)
	{
		
		ErrorResponse error = new ErrorResponse();
		error.setMessage("mensaje - " + exc.getMessage());
		error.setStatus(httpStatus.value());
		error.setTimeStamp(new Date());
		error.setErrors(errors);
		
		return new ResponseEntity<>(error, httpStatus);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
