package com.aplicacion.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacion.demo.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long>{

}
