package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;

public interface PostService {
	PostDto createPost(PostDto postDto);
}
