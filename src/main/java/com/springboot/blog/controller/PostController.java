package com.springboot.blog.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.service.PostService;

@RestController
@RequestMapping("/api")
public class PostController {

	private PostService postService;

	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	// create blob post
	@PostMapping("/posts")
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
		return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
	}
	
	// get all posts
	@GetMapping("/posts")
	public List<PostDto> getAllPosts() {
		return postService.getAllPosts();
	}
	
	// get post by id
	@GetMapping("/posts/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id) {
		//return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
		return ResponseEntity.ok(postService.getPostById(id));
	}
	
	// update post by id
	@PutMapping("/posts/{id}")
	public ResponseEntity<PostDto> updatePost(@PathVariable(name="id") long id, @RequestBody PostDto postDto) {
		return new ResponseEntity<>(postService.updatePost(id, postDto), HttpStatus.OK);
	}
	
	// delete post
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<String> deletePost(@PathVariable(name="id") long id) {
		postService.deletePostById(id);
		return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
	}
}
