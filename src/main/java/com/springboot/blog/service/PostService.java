package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.payload.PostDto;

public interface PostService {
	PostDto createPost(PostDto postDto);
	
	List<PostDto> getAllPosts();
	
	PostDto getPostById(long id);
}
