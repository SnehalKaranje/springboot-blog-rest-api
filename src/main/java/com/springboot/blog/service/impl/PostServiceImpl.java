package com.springboot.blog.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.payload.PostDto;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService{
	
	private PostRepository postRepository;
	
	public PostServiceImpl(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public PostDto createPost(PostDto postDto) {
		Post post = mapToEntity(postDto);
		Post newPost = postRepository.save(post);
		PostDto postResponse = mapToDTO(newPost);
		return postResponse;
	}
	
	@Override
	public List<PostDto> getAllPosts() {
		List<Post> posts = postRepository.findAll();
		return posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
	}
	
	@Override
	public PostDto getPostById(long id) {
		Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		return mapToDTO(post);
	}
	
	@Override
	public PostDto updatePost(long id, PostDto postDto) {
		// get post by id from the database
		Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		
		// update fields
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		
		// save updated value into db
		Post updatedPost = postRepository.save(post);
		return mapToDTO(updatedPost);
	}
	
	@Override
	public void deletePostById(long id) {
		Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		postRepository.delete(post);
	}

	// convert Entity to DTO
	private PostDto mapToDTO(Post newPost) {
		PostDto postResponse = new PostDto();
		postResponse.setId(newPost.getId());
		postResponse.setTitle(newPost.getTitle());
		postResponse.setDescription(newPost.getDescription());
		postResponse.setContent(newPost.getContent());
		return postResponse;
	}

	// convert DTO to Entity
	private Post mapToEntity(PostDto postDto) {
		Post post = new Post();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		return post;
	}
}
