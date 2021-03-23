package com.microservicio.app.panaderia.exception;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor  @NoArgsConstructor
public class ErrorResponse {
	
	private int status;
	private String message;
	private Date timeStamp;
	private List<String> errors;
	
	public ErrorResponse(String message) {
		this.message=message;
	}

}
