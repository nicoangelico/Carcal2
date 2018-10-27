package com.aplicacion.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacion.demo.model.Blog;
import com.aplicacion.demo.service.BlogService;

@RestController
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(value="/blog", method=RequestMethod.GET)
	public ResponseEntity<List<Blog>> getAllBlog(){
		return new ResponseEntity<List<Blog>>(blogService.getAllBlog(), HttpStatus.OK);
	}
	
    @RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
	public ResponseEntity<Blog> getToDoById(@PathVariable("id") long id) {
		return new ResponseEntity<Blog>(blogService.getBlogById(id), HttpStatus.OK);
	}
    
    @RequestMapping(value = "/blog", method = RequestMethod.POST)
   	public ResponseEntity<Blog> saveToDo(@RequestBody Blog blog) {
		return new ResponseEntity<Blog>(blogService.saveBlog(blog), HttpStatus.OK);
   	}
    
    @RequestMapping(value = "/blog", method = RequestMethod.PUT)
   	public ResponseEntity<Blog>  updateToDo(@RequestBody Blog blog) {
		return new ResponseEntity<Blog>(blogService.saveBlog(blog), HttpStatus.OK);
   	}
    
    @RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeToDoById(@PathVariable("id") long id){
    	Blog blog = blogService.getBlogById(id);
    	blogService.removeBlog(blog);
		return new ResponseEntity<String>("Blog eliminado", HttpStatus.OK);
	}
}

