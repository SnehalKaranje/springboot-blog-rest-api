package com.springboot.blog.payload;

import lombok.Data;

@Data
public class CommentDto {
	private long id;
	private String name;
	private String email;
	private String body;
}
