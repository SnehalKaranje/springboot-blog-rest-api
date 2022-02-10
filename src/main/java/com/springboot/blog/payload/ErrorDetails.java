package com.springboot.blog.payload;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorDetails {
	private HttpStatus errorCode;
	private Date timestamp;
	private String message;
	private String details;
	
	public ErrorDetails(HttpStatus errorCode, Date timestamp, String message, String details) {
		super();
		this.errorCode = errorCode;
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	public HttpStatus getErrorCode() {
		return errorCode;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getDetails() {
		return details;
	}
}
