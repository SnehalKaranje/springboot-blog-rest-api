package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

public interface CommentService {
	CommentDto createComment(long postId, CommentDto commentDto);
}
