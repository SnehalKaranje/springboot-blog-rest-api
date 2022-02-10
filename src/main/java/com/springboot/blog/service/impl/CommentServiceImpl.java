package com.springboot.blog.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.BlogAPIException;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.repository.CommentRepository;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	// No need to add @autowired
	// Comment service Impl is configured as Spring bean
	// When it has only one constructor then @autowired annotation can be omitted
	// Spring will automatically detect and inject required dependencies
	private CommentRepository commentRepository;
	private PostRepository postRepository;
	
	public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
		this.commentRepository = commentRepository;
		this.postRepository = postRepository;
	}

	@Override
	public CommentDto createComment(long postId, CommentDto commentDto) {
		Comment comment = mapToEntity(commentDto);
		
		// retrieve post entity by id
		Post post = getPostFromDBById(postId);
		
		// set post to comment entity
		comment.setPost(post);
		
		// save comment entity to DB
		Comment newComment = commentRepository.save(comment);
		
		return mapToDTO(newComment);
	}
	
	@Override
	public List<CommentDto> getCommentsByPostId(long postId) {
		// retrieve comments by postId
		List<Comment> comments = commentRepository.findByPostId(postId);
		
		// convert list of comment entities into list of comment DTOs
		return comments.stream().map(comment -> mapToDTO(comment)).collect(Collectors.toList());
	}
	
	@Override
	public CommentDto getCommentById(long postId, long commentId) {
		// retrieve post entity by id
		Post post = getPostFromDBById(postId);
		
		// retrieve comment by id
		Comment comment = getCommentFromDBById(commentId);
		
		if(comment.getPost().getId() != post.getId()) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
		}
		
		return mapToDTO(comment);
	}
	
	@Override
	public CommentDto updateComment(long postId, long commentId, CommentDto commentDto) {
		// retrieve post entity by id
		Post post = getPostFromDBById(postId);
		
		// retrieve comment by id
		Comment comment = getCommentFromDBById(commentId);
		
		if(comment.getPost().getId() != post.getId()) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
		}
		
		// update fields
		comment.setName(commentDto.getName());
		comment.setEmail(commentDto.getEmail());
		comment.setBody(commentDto.getBody());
		
		Comment updatedComment = commentRepository.save(comment);
		return mapToDTO(updatedComment);
	}
	
	@Override
	public void deleteComment(long postId, long commentId) {
		// retrieve post entity by id
		Post post = getPostFromDBById(postId);
		
		// retrieve comment by id
		Comment comment = getCommentFromDBById(commentId);
		
		if(comment.getPost().getId() != post.getId()) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "Comment does not belong to post");
		}
		
		commentRepository.delete(comment);
	}
	
	private Comment getCommentFromDBById(long commentId) {
		return commentRepository.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));
	}
	
	private Post getPostFromDBById(long postId) {
		return postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
	}
	
	private CommentDto mapToDTO(Comment comment) {
		CommentDto commentDto = new CommentDto();
		commentDto.setId(comment.getId());
		commentDto.setName(comment.getName());
		commentDto.setEmail(comment.getEmail());
		commentDto.setBody(comment.getBody());
		return commentDto;
	}
	
	private Comment mapToEntity(CommentDto commentDto) {
		Comment comment = new Comment();
		comment.setId(commentDto.getId());
		comment.setName(commentDto.getName());
		comment.setEmail(commentDto.getEmail());
		comment.setBody(commentDto.getBody());
		return comment;
	}
}
