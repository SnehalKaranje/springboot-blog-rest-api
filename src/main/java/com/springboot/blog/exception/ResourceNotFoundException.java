package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private String resourceName;
	private String filedName;
	private String filedValue;
	
	public ResourceNotFoundException(String resourceName, String filedName, String filedValue) {
		//Message : Post not found with id : 1
		super(String.format("%s not found with %s : %s", resourceName, filedName, filedValue));
		this.resourceName = resourceName;
		this.filedName = filedName;
		this.filedValue = filedValue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFiledName() {
		return filedName;
	}
	
	public String getFiledValue() {
		return filedValue;
	}
}
