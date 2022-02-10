package com.springboot.blog.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CommentDto {
	private long id;
	
	// name should not be null or empty
	@NotEmpty(message = "Name shpuld not be null or empty")
	private String name;
	
	// email should not be null or empty
	// email should be valid
	@NotEmpty(message = "Email should not be null or empty")
	@Email
	private String email;
	
	// comment body should not be null or empty
	// comment body must be at least 10 characters
	@NotEmpty(message = "Email should not be null or empty")
	@Size(min = 10, message = "Comment body must be minimum 10 characters")
	private String body;
}
