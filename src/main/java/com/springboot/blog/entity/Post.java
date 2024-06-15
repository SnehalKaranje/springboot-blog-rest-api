package com.springboot.blog.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
	name="posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Post {
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY
	)
	private Long id;
	
	@Column(name="title", nullable = false)
	private String title;
	
	@Column(name="description", nullable = false)
	private String description;
	
	@Column(name="content", nullable = false)
	private String content;
	
	// establish owning relationship by using mappedBy
	// cascade all so that any operation on parent gets reflected into child. eg. Remove
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Comment> comments = new HashSet<>();
}
