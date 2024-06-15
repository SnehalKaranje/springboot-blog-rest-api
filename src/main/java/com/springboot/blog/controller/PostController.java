package com.springboot.blog.controller;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;
import com.springboot.blog.service.PostService;
import com.springboot.blog.utils.AppConstants;

@RestController
@RequestMapping("/api")
public class PostController {

	private PostService postService;

	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	// create blob post
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/posts")
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto) {
		return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
	}
	
	// get all posts
	@GetMapping("/posts")
	public PostResponse getAllPosts(
			@RequestParam(value="pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
			@RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
			@RequestParam(value="sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
			@RequestParam(value="sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIR, required = false) String sortDir) {
		return postService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
	}
	
	// get post by id
	@GetMapping("/posts/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id) {
		//return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
		return ResponseEntity.ok(postService.getPostById(id));
	}
	
	// update post by id
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/posts/{id}")
	public ResponseEntity<PostDto> updatePost(@PathVariable(name="id") long id, @Valid @RequestBody PostDto postDto) {
		return new ResponseEntity<>(postService.updatePost(id, postDto), HttpStatus.OK);
	}
	
	// delete post
	@DeleteMapping("/posts/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> deletePost(@PathVariable(name="id") long id) {
		postService.deletePostById(id);
		return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
	}
}
