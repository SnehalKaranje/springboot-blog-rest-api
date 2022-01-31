package com.springboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	// JpaRepository provides all CRUD database operation methods.
	// We don't need to write any method to communicate with database here.
	
	// @Repository annotation not required because - 
	// JpaRepository has implementation class SimpleJPARepository 
	// and it is already annotated with @Repository and same is the case with @Transaction annotation.
}
