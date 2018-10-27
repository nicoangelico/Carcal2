package com.aplicacion.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplicacion.demo.model.Blog;
import com.aplicacion.demo.repository.BlogRepository;

@Service
public class BlogService {
	
	@Autowired
	private BlogRepository blogRepository;
	
	public List<Blog> getAllBlog(){
		return blogRepository.findAll();
	}
	
	public Blog getBlogById(long id){
		return blogRepository.findOne(id);
	}
	
	public Blog saveBlog(Blog blog){
		return blogRepository.save(blog);
	}
	
	public void removeBlog(Blog blog){
		blogRepository.delete(blog);
	}
}

